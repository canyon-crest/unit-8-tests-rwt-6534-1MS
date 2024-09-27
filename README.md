[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/DvbbZdi8)
# Unit 8 - Working with 2D Arrays in Java

## Overview
In this unit, students will learn about 2D arrays, a data structure that stores objects in a grid or table-like format. You will practice creating, accessing, manipulating, and traversing 2D arrays using nested loops. Key tasks include calculating sums, counting occurrences, transposing arrays, reversing rows, and filling arrays with random values. Understanding how to work with 2D arrays is essential for solving complex problems that involve grids, tables, or matrices.

## Learning Objectives
- Understand the structure and usage of 2D arrays in Java.
- Declare, create, and initialize 2D arrays.
- Access and modify elements in a 2D array using row and column indices.
- Traverse 2D arrays using nested loops.
- Perform common operations on 2D arrays, such as summing, transposing, reversing rows, and counting occurrences.
- Implement methods that manipulate 2D arrays without using external libraries.

## Key Concepts
- **2D Array**: An array that holds items in a grid, with rows and columns, like a table.
- **Nested Loops**: A loop inside another loop, commonly used for traversing 2D arrays.
- **Indexing**: Elements are accessed using two indices, the first for rows and the second for columns (e.g., `array[row][col]`).
- **Transposition**: Switching the rows and columns of a 2D array.
- **Row Reversal**: Reversing the order of rows in a 2D array.

## Instructions for Students
1. Implement the methods in `Unit8.java` to manipulate 2D arrays.
2. **Do not use any external libraries** or methods like `Arrays.fill()` or `Collections.reverse()`. Use only basic loops and indexing.
3. Write code to:
   - Calculate the sum of elements in a 2D array.
   - Count occurrences of a specific value in a 2D array.
   - Find the maximum element in a 2D array.
   - Reverse the rows in a 2D array.
   - Transpose a 2D array.
   - Fill a 2D array with random integers.

## Assignment
Complete the following methods in `Unit8.java`:
1. **sumOfElements**: Calculate and return the sum of all elements in the 2D array.
2. **countOccurrences**: Count and return the number of times a specified value appears in the 2D array.
3. **findMax**: Traverse the array to find and return the maximum element.
4. **reverseRows**: Reverse the rows of the 2D array in place.
5. **transpose**: Create and return a new 2D array that is the transpose of the original.
6. **fillWithRandom**: Fill a 2D array with random integers between `min` and `max`.

## JUnit Tests Description and Points

1. **Test Sum of Elements (15 points)**  
   Verifies that the method correctly calculates the sum of all elements in 3x3, 5x5, and 6x4 2D arrays.

2. **Test Count Occurrences (15 points)**  
   Ensures that the method correctly counts how many times a specific value appears in various 2D arrays.

3. **Test Find Max (15 points)**  
   Checks that the method accurately identifies the largest value in a 2D array.

4. **Test Reverse Rows (15 points)**  
   Verifies that the rows in the array are reversed correctly for arrays of different sizes.

5. **Test Transpose (20 points)**  
   Ensures that the method correctly transposes the rows and columns in a 2D array.

6. **Test Fill With Random (20 points)**  
   Ensures the method generates a 2D array of the specified size filled with random integers between the specified range.

## Getting Started
1. Clone the repository containing the Unit 8 project.
2. Open the project in your preferred IDE (such as IntelliJ IDEA or Eclipse).
3. Navigate to `Unit8.java` and implement the required methods.
4. Run the JUnit tests in `Unit8Test.java` to verify your implementations.
5. Ensure all tests pass before submitting your code.

## Submission
Submit your completed `Unit8.java` file through the course's designated submission platform by the due date. Ensure that all tests pass and your code adheres to the style guidelines provided in class.

## Resources
- [Java Documentation](https://docs.oracle.com/javase/8/docs/api/)
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [Java 2D Array Tutorial](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)

## Support
If you encounter any issues or have questions about the assignment, please reach out during office hours or post in the course discussion forum.

For additional assistance, contact: **Kevin** at [kevin@csplusplus.com](mailto:kevin@csplusplus.com).

---

**Unit 8 - Working with 2D Arrays in Java** is part of the AP Computer Science A course, designed to build proficiency in handling complex data structures and grid-based problems.
