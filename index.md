# Elissa Jennings Portfolio

## Self-Assessment

My journey throughout the Computer Science program has been eye opening. I have a background in healthcare, so I started this journey from scratch. I knew nothing about programming or software development in general. This program has made me confident that I can succeed in a career within computer science. My goal is to work in data analytics.  
The program has highlighted how important it is to work well within a team. When a program was not functioning how I wanted to, I would try to figure out the problem myself. However, after trying three different methods without success I would ask for help. I don’t consider asking for help a weakness, but it lets the team know that I am working on the project but don’t want to waste time on the final deliverable.    

Communication with stakeholders was apparent with many projects from different classes. The mobile architect class had clear expectations for creating a mobile app for an event tracker. It listed how the stakeholders expected the app to look and what kind of features they wanted.  Without clear communication and expectations, time would be wasted designing an app they weren’t expecting. This can be applied to data analytics by understanding the problem that stakeholders are trying to solve from the beginning.    

My best topic is data structures and algorithms. I have a good understanding of different containers and where they are best used and understand the concept of time complexities. My enhancements demonstrate different uses for different containers including vectors, linked lists, and hash maps.   

My journey with software engineering and database concepts has grown immensely. My code in the beginning of this program was clunky, hard to read, and a lot of the time did not function as intended. The class that brought many concepts together into one was the client server class. It made me understand how to connect a database to a python program and create a dash application.  This is very useful for data analytics because many companies use python programs to connect to a database and perform queries.    

Security is a topic that is always a hot topic, but this program gave me a much better understanding of good security works. I learned the importance of encryption and access control. Data analytics can involve sensitive data such as medical health records and it Is extremely important that the data does not fall into the wrong hands. Access control can apply to databases and visualization tools like Power BI. A big security risk when working with databases is SQL injection.  The key is to ensure the SQL queries have parameters.   

The three artifacts I chose helped demonstrate my understanding of data manipulation, data structures, and databases. The artifact I used for enhancement one and three performs the basic function of reading an input file. Data can be stored in many different file types and needs to be stored into one data structure. These enhancements show how to not only read different file types but manipulate the data to transform it for either database insertion or queries. The second artifact demonstrates the skill of different data structures but adding functionality to a program used for another purpose. The two artifacts demonstrate a variety of skills including two different programming languages, data structures, data cleaning/transformation, and databases. Below is a detailed description of the three enhancements and links to the programs.


## Code Review

This code review provides the plans for all three enhancements. This includes increased functionality and better code comments.

[CodeReview Link](https://github.com/jenninge/CodeReview/raw/refs/heads/main/CodeReview.mp4)

## Projects

### Enhancement One: Software Engineering and Design   

The artifact for this enhancement is from CS210, an introduction to C++ programming language course. The original project demonstrated how to read an input file, count the occurrence of each item and place them into an output file. It was created in the fall of 2023. All programming was completed using Visual Studios IDE. I chose this program because it had a good base for functionality. My goal was to enhance the program to be able to perform CRUD operations on the data from the input file so it could eventually be loaded into some type of database.

I enhanced the project by reading an input file into a vector and performing CRUD operations on the vector. The operations I created included reading all data, reading a specific piece of data, updating data, and deleting data. The program can be easily adjusted based on the type of input file. The enhancement demonstrates my skills with data transformation, data structures, and well-defined functions.   

During this enhancement, I realized how much I have learned throughout this program. I found it much easier to debug the program and find where there were issues. It also demonstrated how important it is to test after each modification of the code. I struggled getting my validation code to work but after trial and error I was able to work through the problem and get a fully functional program. I achieved the following course outcomes by creating CRUD operations and demonstrating skills for data management.    

Course Outcomes achieved:  
- Design and evaluate computing solutions that solve a given problem using algorithmic principles and computer science practices and standards appropriate to its solution, while managing the trade-offs involved in design choices.   

- Demonstrate an ability to use well-founded and innovative techniques, skills, and tools in computing practices for the purpose of implementing computer solutions that deliver value and accomplish industry-specific goals.

[Original Project Link](https://github.com/jenninge/jenninge.github.io/tree/main/OriginalForEnhancementOneAndThree)  

[Enhanced Project Link](https://github.com/jenninge/jenninge.github.io/tree/main/EnhancementOne)  

### Enhancement Two: Algorithms and Data Structures

The artifact for this enhancement is from CS320, software testing and automation class. It was created in April 2024 using Java programming language. All programming was completed using Eclipse IDE. The original program was used for JUNIT testing only. It had no functionality for a java application. The program created arrays of contact and appointment data and tested various functions. The functions included adding, updating, and deleting contacts and appointments. I chose this program because it had a good base code to add functionality to run it as a java application. I wanted to demonstrate my skills with different data structures, ability to add functionality, and demonstrate my understanding of time complexity.   

Enhancement to this program includes full functionality as a java application. The array of appointments was changed to a linked list. I chose a linked list because an appointment list would constantly be changing, and a linked list is better for frequent insertions and deletions. The array of contacts was changed to a HashMap. A HashMap is better for large and dynamically changing data like contact information.   

This enhancement solidified the importance of classes. This program became very large, very quickly and without the use of classes it would be unmanageable. I ran into issues when trying to print the data from the containers but was able to solve it. If I was unable to get a function working properly, I left detailed notes so anyone could see what my process was. I feel this program has improved drastically since it had zero functionality to it in the beginning.  I met the following course outcomes by including comments that are useful and detailing the reasons for the changes. The new program utilizes algorithmic principles and details were given for the changes.  

Course Outcomes achieved: 
- Design, develop, and deliver professional-quality oral, written, and visual communications that are coherent, technically sound, and appropriately adapted to specific audiences and contexts.

- Design and evaluate computing solutions that solve a given problem using algorithmic principles and computer science practices and standards appropriate to its solution, while managing the trade-offs involved in design choices.

#### Time Complexities    

| Container | Best | Worst |   

| :----: | :----: | :----: |   
| Array | O(1) | O(1)/O(n) |   
| Linked List | O(1) | O(n) |   
| HashMap | O(1) | O(n) |    
  
[Original Project Link]()   
[Enhanced Project Link]()

### Enhancement Three: Databases

The artifact for this enhancement is the same project from the first enhancement. It is from CS210, an introduction to C++ programming language course. The original project demonstrated how to read an input file, count the occurrence of each item and place them into an output file. It was created in the fall of 2023. All programming was completed using Visual Studios IDE. I chose this program because it had a good base for functionality. My goal was to enhance the program to read any type of file and place the data into a SQLite database for queries. I wanted to showcase my skills working with relational databases and querying the data.    
The enhancement to this project includes connecting to a SQLite database. I wanted to make enhancements so the program could read any file type, insert the data into a vector, and then insert the data into the SQLite database to perform CRUD operations. This program has many functions. These functions include reading a file, opening the database, creating a table, and adding/reading/updating/deleting data. The improvements make it much easier to deal with large amounts of data and being able to reference at any time by connecting to the database.    

Through this enhancement, I have learned that well thought-out plans may not go as expected. I was unable to get the data from the CSV file inserted into the database. Although I was unable to solve this problem, I inserted detailed comments to demonstrate what I have tried and what my process was. Bulk inserts can be challenging when working with a SQL database. The enhanced artifact has more real-world applications than the original program. I met the following outcomes by creating a program that interacts with a SQL database. This can be useful for many different departments within an organization. I feel I might have met the last course outcome, but I am still cautious to try and prevent SQL injection attacks from happening.    

Course Outcomes achieved:
- Employ strategies for building collaborative environments that enable diverse audiences to support organizational decision making in the field of computer science.
- Develop a security mindset that anticipates adversarial exploits in software architecture and designs to expose potential vulnerabilities, mitigate design flaws, and ensure privacy and enhanced security of data and resources.

[Original Project Link](https://github.com/jenninge/jenninge.github.io/tree/main/OriginalForEnhancementOneAndThree)   
[Enhanced Project Link]()



