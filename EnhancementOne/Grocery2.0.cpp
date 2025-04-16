/*
* Elissa Jennings
* CS499-Final Project
* Original Program used an input file to perform functions such as displaying products and how many were sold.
* New program will take an input file and perform CRUD operations to clean/transform data.
* Final Update: 4/9/25
*/

#include <iostream>    
#include <fstream>     
#include <cstring>   
#include <string>     
#include <map> 
#include <vector>

using namespace std;

void displayMenu() {

	cout << "Select Menu Option 1 to read a specific item from the document." << endl;
	cout << "Select Menu Option 2 to read all items from document." << endl;
	cout << "Select Menu Option 3 to add item to list." << endl;
	cout << "Select Menu Option 4 to update item in list." << endl;
	cout << "Select Menu Option 5 to delete item in list." << endl;
	cout << "Select Menu Option 6 to Exit the Menu." << endl;
}

/*
* Function to get user menu choice.
* Function will run until a valid option is entered.
* User input should be between 1-4, otherwise will return error.
* Returns user's menu option
*/
int getMenuOption() {

	int userMenuOption = 0;
	bool invalidInput = true;

	do {

		cout << "Please enter your menu selection.";
		cin >> userMenuOption;
		invalidInput = ((userMenuOption < 1) || (userMenuOption > 6));

		if (invalidInput) {
			cout << "Invalid input, please select again." << endl;
			break;
		}

	} while (invalidInput);

	return userMenuOption;
}

/*
* Function: gets a userProduct to read from file.
* Parameters: userProduct = item user wishes to lookup, invalidInput = loops through function until valid input
* Returns userProduct.
*/
string getUserProduct() {

	string userProduct = "none";
	bool invalidInput = true;
	do {

		cout << "Please enter the item you wish to look up. ";
		cin >> userProduct;

		userProduct[0] = toupper(userProduct[0]);
		invalidInput = isdigit(userProduct[0]);

		if (invalidInput) {
			cout << "Invalid input, please try again." << endl;
		}

	} while (invalidInput);

	return userProduct;
}

/*
* Function: opens file and place contents into a vector.
* Parameters: inputFile = hardcoded text file, vector = stores items,
* Parameters: fileLine = to get each line of file 
*Output: Vector: productList
*/
vector<string> openFile(string fileName) {

	ifstream file(fileName);
	vector<string> productList;
	string fileLine;

	if (!file.is_open()) {
		cout << "Could not open file." << endl;
	}
	else {
		while (!file.eof()) {
			getline(file, fileLine);
			productList.push_back(fileLine);   
		}
	}
	return productList;

	file.close();
}


/*
* Function: adds new data to current list of items
* Parameters: fileName = to get original data, newData = new data to add to list
* Parameters: vector productList = store data from imported file and store new items, fileLine = to read data from file
*/
void addData() {

	string fileName = "CS210_Project_Three_Input_File.txt";
	string newData;
	vector<string> productList = openFile(fileName);
	string fileLine;

	cout << "Please enter item to add to list.";
	cin >> newData;
	productList.push_back(newData);
	for (int i = 0; i < productList.size(); i++)  
		cout << productList[i] << "\n ";
}


/*
* Function: finds and reads a specific piece of data.
* Parameters: fileName, vector: productList, readData = number of a specific item counted
* Parameters: dataSearch = item to be looked up, invalidInput = boolean to continue loop
* Output: Product and how many times it was found or item not found
*/
void readData() {

	string fileName = "CS210_Project_Three_Input_File.txt";
	vector<string> productList = openFile(fileName);
	int readData = 0;
	string dataSearch = "none";
	bool invalidInput = true;

	dataSearch = getUserProduct();
	if (dataSearch.size() == 0) {
		cout << "No item entered. Please enter an item to view.";
	}
	else {
		for (int i = 0; i < productList.size(); i++) {
			readData = count(productList.begin(), productList.end(), dataSearch);
		}
		if (readData == 0) {
				cout << "Item could not be found.";
		}
	}
	cout << dataSearch << " " << readData << endl;
}


/*
* Function: finds/reads all data from file.
* Parameters: inputFile, currentProduct = item being viewed in file, readData = number of a specific item counted
* Parameters: vector: productList to hold file contents, map(productCount) - stores key(item name) and values(counts) 
* Output: Map conatiner with all items in inputFile with their respective counts
*/
void readAllData() {

	string fileName = "CS210_Project_Three_Input_File.txt";
	vector<string> productList = openFile(fileName);
	string currentProduct = "none";
	int readData = 0;
	map<string, int> productCount;
	
	for (auto i: productList) {
		productCount[i]++;
	}
	
	for (map<string, int>::iterator it = productCount.begin(); it != productCount.end(); ++it) {
		cout << it->first << " " << it->second << endl;
	}
}


/*
* Function: finds a specific data element and updates it within the vector.
* Parameters: inputFile, dataSearch = input from user, updatedData= input from user
* Parameters: vector: productList to store file contents, vector iterator to loop through vector elements
*/
void updateData() {

	string fileName = "CS210_Project_Three_Input_File.txt";
	vector<string> productList = openFile(fileName);
	string dataSearch = "none";
	string updatedData = "none";
	bool dataFound = false;
	vector<string>::iterator itr; 
	
	cout << "Please enter an item you wish to update. ";
	cin >> dataSearch;
	cout << "Please enter the new updated data. ";
	cin >> updatedData;
	cout << "\n";

	dataSearch[0] = toupper(dataSearch[0]);

	if (dataSearch.size() == 0) {
		cout << "No item entered. Please enter an item to view.";
	}
	else {
		for (itr = productList.begin(); itr != productList.end(); ++itr) {
			if (*itr == dataSearch) {
				dataFound = true;
				*itr = updatedData;
			}
		}
		if (!dataFound) {
			cout << dataSearch << " could not be found. \n";
		}
		else {
			cout << dataSearch << " has been updated to " << updatedData << "\n";
		}
	}
}


/*
* Function: finds element and deletes it from vector.
* Parameters: inputFile, deleteData = input from user
* Parameters: vector: productList to store file contents, vector iterator to loop through vector elements
* Output: Multiple statements representing how many times each item was removed.
*/
void deleteData() {

	string fileName = "CS210_Project_Three_Input_File.txt";
	vector<string> productList = openFile(fileName);
	string deleteData;
	vector<string>::iterator itr;
	bool dataFound = false;

	cout << "Please enter an item you wish to delete. ";
	cin >> deleteData;

	deleteData[0] = toupper(deleteData[0]);

	if (deleteData.size() == 0) {
		cout << "No item entered. Please enter an item to view.";
	}
	else {
		for (itr = productList.begin(); itr != productList.end(); ++itr) {
			if (*itr == deleteData) {
				dataFound = true;
				itr = productList.erase(itr);
			}
		}
		if (!dataFound) {
			cout << "Could not find data to delete." << "\n";
		}
		else {
			cout << deleteData << " has been deleted from list. \n";
		}
	}
}

void exitProgram() {   

	cout << "Exiting menu, goodbye!" << endl;
	exit(0);  
}

/*
* Switch case to process user input for menu options.
*/
void processMenuInput(int userInput) {

	switch (userInput) {
	case 1:
		readData();
		break;
	case 2:
		readAllData();
		break;
	case 3:
		addData();
		break;
	case 4:
		updateData();
		break;
	case 5:
		deleteData();
		break;
	case 6:
		exitProgram();
	default:
		cout << "Error, please try again." << endl;
		break;
	}
}

/*
* Executes to display menu options, get user input, and executes switch statement for appropriate function.
*/
int main() {

	int userInput = 0;

	while (userInput != 6) {
		displayMenu();
		userInput = getMenuOption();
		processMenuInput(userInput);
		cout << "\n";
	}
}