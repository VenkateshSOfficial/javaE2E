# Identifiers

## What is an identifier?

Used for identification.
A name in a Java program is considered an identifier, which can be used for identification. It can be any one of the below:

a. class name
b. method name
c. variable name
d. label name

## Rules to be followed while defining identifiers

1. The only allowed characters in Java identifiers are a to z, A to Z, 0 to 9, $, and _ (underscore).
   ex: total_number -> valid
       total# -> invalid (not allowed)

2. Identifiers should not start with a digit.
   ex: total_123 -> valid
       123Total -> invalid (can't start with digits)

3. Java identifiers are case-sensitive. We can differentiate with respect to case (lowercase and uppercase).
   ex: int Number = 10
       int number = 20

4. No length limit for Java identifiers.

5. Reserved words can't be used as identifiers in Java.
   ex: int x=10 -> valid (x is not a reserved word in Java)
       int if=20 -> invalid (if is a reserved word in Java)

6. Predefined Java class and interface names can be used to name an identifier in Java.
   ex: refer to program PredefinedClass.java
   But it is not recommended to do this in Java; it is not a good programming practice.
