Problem Statement: Employee Management Using Array and Object Serialization in Java
Problem Title: Store 5 Employee Objects in a File Using ObjectOutputStream and Retrieve Them Using ObjectInputStream.
Problem Description
Develop a Java application that creates an array of 5 Employee objects and stores the entire array into a file using ObjectOutputStream. Later, retrieve the employee objects from the file using ObjectInputStream and display their details on the console.
Requirements
1. Create an Employee class

Define the following attributes:
- empId – Employee ID
- empName – Employee Name
- department – Department Name
- salary – Employee Salary
2. Implement Serialization
- Implement the Serializable interface in the Employee class.
- Define a serialVersionUID.
- Create a parameterized constructor.
- Override the toString() method to display employee details.
3. Create an Employee array
- Create an array of 5 Employee objects.
- Initialize it with employee details.
4. Write objects to a file
- Create a file named employees.dat.
- Use FileOutputStream.
- Use ObjectOutputStream.
- Write the complete Employee array into the file using writeObject().
5. Read objects from a file
- Use FileInputStream.
- Use ObjectInputStream.
- Retrieve the Employee array using readObject().
- Display all employee details using a loop.