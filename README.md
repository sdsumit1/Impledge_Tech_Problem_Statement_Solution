# Impledge_Tech_Problem_Statement_Solution

Overview
CompoundedWords is a Java program designed to identify the longest and second-longest compounded words in a list. The program reads words from a user-specified text file, sorts them by length in descending order, and employs dynamic programming to determine compounded words within the set. The goal is to efficiently find the longest and second-longest compounded words from the given input.

How to Execute
Prerequisites:

Ensure you have Java Development Kit (JDK) installed on your system.
Clone the Repository:

bash
Copy code
git clone https://github.com/your-username/CompoundedWords.git
cd CompoundedWords
Compile and Run:

Compile the Java program:
bash
Copy code
javac CompoundedWords.java
Run the program:
bash
Copy code
java CompoundedWords
Follow Instructions:

The program will prompt you to enter the filename of the text file containing a list of words.
View Output:

The program will display the longest and second-longest compounded words found in the input, along with the processing time.
Approach and Design Decisions
The program utilizes a HashSet to efficiently check for the presence of words and dynamic programming to identify compounded words.
Words are sorted in descending order of length to optimize the search for compounded words.
The design focuses on readability, modularity, and efficient processing of input files.


