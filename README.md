# ePortfolio

## Overview

This repository contains artifacts with enhancements for a github pages portfolio. There are three enhancements within this repository with two different artifacts. The first artifact is used in enhancement one and three. It is a C++ program that reads an input file and counts the number of ocurrences of each item. The second artifact is used for enhancement two. It is a Java program that was created for JUNIT testing. It has no functionality as a java application.  

Enhancement One: This enhancement includes CRUD operations to perform on the data from the input file. The data is read from the file and placed into a vector. Functions used on the vector include reading data, adding data, updating data, and deleting data.    

Enhancement Two: Enhancements were made to have a fully functioning java application. It also includes changing the data structure from arrays to linked lists and hashmaps.   

Enhancement Three: This enhancement includes connecting to a SQLite database and performing CRUD operations on the input file data.   

## Getting Started   

[Visual Studios](https://visualstudio.microsoft.com/)
[Eclipse](https://eclipseide.org/)   

### Connecting to SQLite Database

1. Download the sqlite amalgamation zip file.
[SQLite](https://sqlite.org/download.html)   

2. Add sqlite3.c to source files in C++ program.
3. Add package under Manage NuGet Packages in the project directory.
    - Browse for sqlite3_c_plus_plus and install.
    - ![image](https://github.com/user-attachments/assets/16ce48e2-df2e-4da2-bcda-59aef62c36c3)

5. #include <sqlite3.h>
   
Now you are ready to work with a SQLite database!






 
