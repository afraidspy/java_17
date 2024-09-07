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

# Overriding Methods That Handle Exceptions in Java

When overriding methods in Java, handling exceptions correctly is crucial to maintain the integrity of the method contracts established in the superclass. Here’s a detailed overview of how to handle exceptions when overriding methods.

## Key Points for Handling Exceptions in Overridden Methods

1. **Exception Declaration**: An overriding method cannot throw new checked exceptions that are not declared in the method’s `throws` clause of the superclass. It can throw fewer or no exceptions, or the same exceptions as the superclass method.

2. **Handling Exceptions**: An overridden method can handle exceptions internally and not propagate them, or it can handle exceptions and rethrow them as different exceptions if needed.

3. **`@Override` Annotation**: Using the `@Override` annotation ensures that the method is actually overriding a method in the superclass and helps avoid subtle bugs.
