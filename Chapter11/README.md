# Differences in Exception Handling in Java 17

Java 17, like its previous versions, uses an exception handling system based on a class hierarchy. However, specific features and improvements have been introduced in this version. Below are the main differences:

## 1. Exception Hierarchy

The exception hierarchy in Java 17 remains the same as in previous versions:

- **`Throwable`**
  - **`Exception`**
    - **`Checked Exceptions`**: Must be handled or declared with `throws`.
    - **`Unchecked Exceptions`**: Inherit from `RuntimeException` and do not have to be handled.
  - **`Error`**: Serious problems that applications should not attempt to handle.

## 2. Exception Handling

### `try-catch-finally` Blocks

The basic structure for handling exceptions remains unchanged:

```java
try {
    // Code that may throw an exception
    int result = 10 / 0;
} catch (ArithmeticException e) {
    // Handling the exception
    System.out.println("Error: " + e.getMessage());
} finally {
    // Code that always executes
    System.out.println("Finally block executed.");
}
