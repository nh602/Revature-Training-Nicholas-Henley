# Question answers

What is the difference between throw and throws? 
- Throw is used to trigger an exception to be raised (during execution)
- Throws is how you describe the behaviour of a method to throw an exception in the signature.

Why did the compiler force you to handle AttendanceShortageException but not InvalidMarksException? 
- AttendanceShortage... is a checked exception but invalidMarks... is unchecked / runtime exception

When does the finally block run? 
- After all the try catch blocks (assuming JVM doesn't exit)

Why is it better to check email == null than to catch NullPointerException?
- Because it's cheaper to check than handling the exception 

Name one more custom exception the portal could use, and say whether it should be checked or unchecked. 
- Use a checked exception for validating a real email address i.e. fits the format expected