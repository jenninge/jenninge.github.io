/*
* Elissa Jennings
* Project 3
* Using functions to display products and the number of items that were sold in a day.
* 10/15/23
*/


#include <iostream>    //input/output library
#include <fstream>     //file library
#include <cstring>    //cstring library to manipulate strings/arrays
#include <string>     //string library
#include <map>     //map library

using namespace std;    

void displayMenu() {      //display menu function

	cout << "Press 1 to display how many of an item was sold." << endl;      //output menu options
	cout << "Select 2 for all items and how many were sold." << endl;
	cout << "Select 3 for all items sold displayed as a histogram." << endl;
	cout << "Select 4 to Exit the Menu." << endl;

}

int getUserInput() {      //function to get user menu choice

	int userInput = 0;      //delcaring and initialing user choice
	bool invalidInput = true;     //for do/while loop to verify input

	do {  // do/while loop

		cout << "Please enter your menu selection.";    //prompts user
		cin >> userInput;                               //gets user choice
		invalidInput = ((userInput < 1) || (userInput > 4));   //defines an invalid input

		if (invalidInput) {                    
			cout << "Invalid input, please select again." << endl;    //prompts user for correct input
		}

	} while (invalidInput);

	return userInput;       //returns the value of user choice
}

string getUserProduct() {        //function to prompt user for product

	string userProduct = "none";    //declaring and intiliazing product variable picked by user
	bool invalidInput = true;       //for do/while loop to validate input
	do { // do/while loop

		cout << "Please enter the item you wish to look up. ";    //prompt user for product
		cin >> userProduct;     //get user product

		userProduct[0] = toupper(userProduct[0]);    //will capitalize first letter of product entered by user
		invalidInput = isdigit(userProduct[0]);      //validates user input and checks to see if it's a digit
		
		if (invalidInput) {     //if input is invalid

			cout << "Invalid input, please try again." << endl;		 //prompts user to enter new product
		}
		
	} while (invalidInput);   // do/while loop

	return userProduct;   //returns the user product entered
}

int menuOption1() {     //function for menu option one

	ifstream inputFile;     //declaring inputfile
	int productNum = 0;      //declaring and intializing the number of produicts variable
	string userProduct = "none";     //declaring and initializing the product variable entered by user
	string currentProduct = "none";    //declaring and intiliazing the current product in file

	inputFile.open("CS210_Project_Three_Input_File.txt");    //opens input file
	if (!inputFile.is_open()) {                  //if loop to check if the file is open
		cout << "Could not open file." << endl;
		return 1;    //returns error
	}
	else {
	
		userProduct = getUserProduct();   //initialing userProduct with the getUserProduct function

		while (!inputFile.eof()) {     //will loop through the file until it reaches end of file
			inputFile >> currentProduct;      //looks at each item in file
			if (!inputFile.fail()) {
				if (currentProduct == userProduct) {    //will check to see if current product in file is the same as the product entered by user
					++productNum;    //will increment product if it matches user product
				}
			}
		}
	
		cout << userProduct << " " << productNum << endl;   //outputs the product entered by user and the number of times it was in the file
		inputFile.close();   //closes inputfile 
	}
}

int menuOption2() {   //function for menu option 2

	ifstream inputFile;    //declaring inputfile
	ofstream outputFile;    //declaring outputfile
	map<string, int> productCount;   //declaring a empty map container of strings(key) to integers(value)
	int productNum = 0;            //declaring and intializing the number of produicts variable
	string currentProduct = "none";   //declaring and intiliazing the current product in file

	inputFile.open("CS210_Project_Three_Input_File.txt");  //opens input file
	outputFile.open("frequency.dat");              //opens output file
	if (!inputFile.is_open()) {               //checks if inputfile is open
		cout << "Could not open file." << endl;
		return 1;   
	}
	if (!outputFile.is_open()) {        //checks if output file is open
		cout << "Could not open file." << endl;
		return 1;
	}
	else {

		while (inputFile >> currentProduct) {    //loops through inputfile
			++productCount[currentProduct];    //increments products through the inputfile
		}
		for (map<string, int>::iterator it = productCount.begin(); it != productCount.end(); ++it) {   //gets iterator that points to the first element in the map, and incrments element until it reaches last element of the map
			cout << it->first << " " << it->second << endl;    //outputs string element and int element of the map
			outputFile << it->first << " " << it->second << endl;   //places map into output file
		}

		inputFile.close();   //closes inputfile
		outputFile.close();  //closes outputfile
	}
}
 
int menuOption3() {        //function for menu option 3

	ifstream inputFile;       //declaring inputfile
	map<string, int> productCount;      //declaring a empty map container of strings(key) to integers(value)
	int productNum = 0;                //declaring and intializing the number of produicts variable
	string currentProduct = "none";      //declaring and intiliazing the current product in file

	inputFile.open("CS210_Project_Three_Input_File.txt");      //opens input file
	if (!inputFile.is_open()) {                           //checks if inputfile is open
		cout << "Could not open file." << endl;
		return 1;
	}
	else {

		while (inputFile >> currentProduct) {       //loops through inputfile 
			++productCount[currentProduct];         //increments products through the inputfile
		}
		for (map<string, int>::iterator it = productCount.begin(); it != productCount.end(); ++it) {    //gets iterator that points to the first element in the map, and incrments element until it reaches last element of the map
			cout << it->first;               //outputs string element of map
			int tempProduct = it->second;   //creates a temporary variable for the int element of the map
			for (int i = 0; i < tempProduct; ++i) {       //loops through the int elements to display "*" to represent the integers
				cout << "*";
			}
			cout << endl;
		}

		inputFile.close();       //closes input file
	}

}

void menuOption4() {      //function to exit program

	cout << "Exiting menu, goodbye!" << endl;

	exit(0);   //ends program

}

void processInput(int userInput) {    //function to process the user menu choice

	switch (userInput) {    //switch statement to execute different code depending on user input
	case 1:
		menuOption1();    //executes menu one function
		break;      //stops execution of switch statement
	case 2:
		menuOption2();     //executes menu 2 function
		break;
	case 3:
		menuOption3();   //executes menu 3 function
		break;
	case 4:
		menuOption4();  //executes menu 4 function
		break;
	default:     //default if no input matches
		cout << "Error, please try again." << endl;
		break;
	}
}

int main() {   

	int userInput = 0;   //declaring and intializing the menu option given by user

	displayMenu();    //executes menu function
	userInput = getUserInput();    //intializes the user input to the function get user input
	processInput(userInput);      //executes the processInput function with the argument of the user Input

}