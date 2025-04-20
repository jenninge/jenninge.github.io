/*
* Elissa Jennings
* Final Project Part 3
* Connecting C++ program to SQLite database.
* 4/6/25
* References: https://www.tutorialspoint.com/sqlite/sqlite_c_cpp.htm, https://www.youtube.com/watch?v=L-hnA82JsEM
*/


#include <iostream> 
#include <stdio.h>
#include <sqlite3.h>
#include <fstream>
#include <sstream>
#include <vector>

using namespace std;

/*
* Function used for SELECT statements. 
*/
int callback(void* NotUsed, int argc, char** argv, char** azColName) { //(ignored, number of columns, array of strings in rows, array of strings of column names)

	for (int i = 0; i < argc; i++) {
		cout << azColName[i] << ": " << argv[i] << endl;
	}
	cout << "\n";

	return 0;
}

/*
* Function: Used to open database if it exists, otherwise creates a new database.
*/
static int openDatabase(const char* file) {

	sqlite3* DB;
	int exit = 0;

	exit = sqlite3_open(file, &DB);

	if (exit) {
		cout << "Database could not be opened. \n" << sqlite3_errmsg(DB);
	}
	else {
		cout << "Database opened successfully. \n";
	}

	sqlite3_close(DB);
	return 0;
}

/*
* Function: Creates a new table if it does not already exist.
* Creates the table of Humans with 9 columns.
*/
static int createTable(const char* file) {

	sqlite3* DB;
	char* errorMsg;

	int exit = 0;
	exit = sqlite3_open(file, &DB);

	string sql = "CREATE TABLE IF NOT EXISTS HUMANS("
		"ID INTEGER PRIMARY KEY AUTOINCREMENT, "
		"USER_ID              TEXT NOT NULL, "
		"FIRST_NAME           TEXT NOT NULL, "
		"LAST_NAME            TEXT NOT NULL, "
		"SEX                  TEXT, "
		"EMAIL                VARCHAR(40), "
		"PHONE                VARCHAR(20), "
		"DATE_OF_BIRTH        VARCHAR(12) NOT NULL,"
		"JOB_TITLE            TEXT);";

	exit = sqlite3_exec(DB, sql.c_str(), NULL, 0, &errorMsg);  //(database connection, SQL statement, callback function, first argument to callback function, error message)

	if (exit != SQLITE_OK) {
		cout << ("Could not create table. SQL error! \n", errorMsg);
		sqlite3_free(errorMsg);
	}
	else {
		cout << "People table created successfully. \n";
	}

	return 0;
}


/*
* Function: Inserts Data into Human table.
* Manual inserts works as intended.
* Error: Unable to read data from CSV file and insert into table. Commented code is prior attempts.
*/
static int insertData(const char* file) {

	ifstream inputFile;
	string data;
	vector<string> humanData;
	sqlite3* DB;
	char* errorMsg{};

	inputFile.open("people-100.csv");
	if (!inputFile.is_open()) {
		cout << "Could not open file." << endl;
		return 1;
	}
	else {
		while (getline(inputFile, data, ',')) {
			humanData.push_back(data);
		}
		//for (int i = 0; i < humanData.size(); i++) {   //for testing vector
			//cout << humanData[i];
		//}
	}

	int exit = sqlite3_open(file, &DB);
	for (int i = 0; i < humanData.size(); i++) {
		string sql("INSERT INTO HUMANS (USER_ID, FIRST_NAME, LAST_NAME, SEX, EMAIL, PHONE, DATE_OF_BIRTH, JOB_TITLE) VALUES(?,?,?,?,?,?,?,?);");
		exit = sqlite3_exec(DB, sql.c_str(), NULL, 0, &errorMsg);
	}
	//string sql("INSERT INTO HUMANS (USER_ID, FIRST_NAME, LAST_NAME, SEX, EMAIL, PHONE, DATE_OF_BIRTH, JOB_TITLE) VALUES(' " + humanData[0] + ", " + humanData[1] + ", " + humanData[2] + ", " + humanData[3] + ", " + humanData[4] + ", " + humanData[5] + ", " + humanData[6] + ", " + humanData[7] + ", " + humanData[8] + "');");
	//string sql("INSERT INTO HUMANS (USER_ID, FIRST_NAME, LAST_NAME, SEX, EMAIL, PHONE, DATE_OF_BIRTH, JOB_TITLE) VALUES( 'ggggg', 'Sally', 'Smith', 'Female', 's.s@gmail.com','555-000-5555', '01/10/1989', 'Dentist');");

	if (exit != SQLITE_OK) {
		cout << ("Could not insert data. ERROR! \n", errorMsg);
		sqlite3_free(errorMsg);
	}
	else {
		cout << "Data was inserted successfully. \n";
	}

	return 0;
}

/*
* Function: Used to read all data from the table Humans.
*/
static int selectData(const char* file) {

	sqlite3* DB;
	char* errorMsg{};
	int exit = sqlite3_open(file, &DB);

	string sql = "SELECT * FROM HUMANS;";

	sqlite3_exec(DB, sql.c_str(), callback, NULL, NULL);

	if (exit != SQLITE_OK) {
		cout << ("Could not retrieve data. ERROR! \n", errorMsg);
		sqlite3_free(errorMsg);
	}
	else {
		cout << "Data retrieved successfully. \n";
	}

	return 0;
}

/*
* Function: Updates a specific data based on WHERE clause.
*/
static int updateData(const char* file) {

	char* errorMsg;
	sqlite3* DB;
	int exit = sqlite3_open(file, &DB);

	string sql("UPDATE HUMANS SET SEX = 'F' WHERE SEX = 'Female'");

	exit = sqlite3_exec(DB, sql.c_str(), NULL, 0, &errorMsg);
	
	if (exit != SQLITE_OK) {
		cout << ("Could not update data. ERROR! \n", errorMsg);
		sqlite3_free(errorMsg);
	}
	else {
		cout << "Data updated successfully. \n";
	}
	return 0;
}


/*
* Function: Deletes specific piece of data based on WHERE clause.
*/
static int deleteData(const char* file) {

	char* errorMsg;
	sqlite3* DB;
	int exit = sqlite3_open(file, &DB);

	string sql = "DELETE FROM HUMANS WHERE LAST_NAME = 'Smith';";

	exit = sqlite3_exec(DB, sql.c_str(), NULL, 0, &errorMsg);

	if (exit != SQLITE_OK) {
		cout << ("Could not delete data. ERROR! \n", errorMsg);
		sqlite3_free(errorMsg);
	}
	else {
		cout << "Data deleted successfully. \n";
	}

	return 0;
}


int main() {

	sqlite3* DB;
	const char* file = "humanDB.db";

	openDatabase(file);
	createTable(file);
	insertData(file);
	selectData(file);
	updateData(file);
	deleteData(file);
	selectData(file);  //check update/delete function
	
}