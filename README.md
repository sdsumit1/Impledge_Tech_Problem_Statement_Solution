# Impledge_Technologies_Problem_Statement_Solution

# Overview:
CompoundedWords is a Java program designed to identify the longest and second-longest compounded words in a given list. A compounded word is a combination of two or more smaller words present in the list. The program employs dynamic programming to efficiently determine compounded words within the set, providing insights into linguistic structures.

# Prerequisites:
Ensure you have Java Development Kit (JDK) installed on your system.

# How to Execute:
1. Clone the Repository:
2. Compile the java program : javac CompoundedWords.java
3. Run the program : java CompoundedWords
4. The program will display the longest and second-longest compounded words found in the input, along with the processing time.

# Design Decisions:
The program utilizes a HashSet to efficiently check for the presence of words and dynamic programming to identify compounded words.
Words are sorted in descending order of length to optimize the search for compounded words.
The design focuses on readability, modularity, and efficient processing of input files.

# Approach
The program employs a dynamic programming approach to identify compounded words efficiently. It sorts the input words by length in descending order, creating a HashSet for constant-time word lookups. The algorithm iterates through the sorted list, removing each word and checking if it can be formed by concatenating smaller words. The design prioritizes readability, modularity, and optimal processing of input files, resulting in a streamlined solution for finding the longest and second-longest compounded words.



