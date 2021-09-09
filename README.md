# Math with Loops Assignment

In this assignment, you'll be writing three methods to calculate some math methods iteratively (using loops).

The first method is factorial(). This method takes an integer as input, and returns the factorial of that number. The factorial of a number x is found by multiplying x by all integers smaller than x. For example, the factorial of 5 is equal to: factorial(5) = 5 * 4 * 3 * 2 * 1. Note that factorial(0) is defined to be 1. The method has the following signature: public static double factorial(int x) {}

The second method is calculateE(). This method takes no inputs, and returns a value for the mathematical constant e that is calculated with the following formula: e = 1/factorial(0) + 1/factorial(1) + 1/factorial(2) + 1/factorial(3) + ... + 1/factorial(infinity). You will not need to calculate the formula up to the infinity-th term, rather, you should keep adding additional terms until you end up with a value within 0.00001 of the Java Math constant Math.E. The method has the following signature: public static double calculateE() {}

The final method is babylonian(). This method takes a double as input, and returns the squareroot of that number. However, you are NOT allowed to use the Math.sqrt() method. Instead, you will use the Babylonian method to calculate the square root "by hand". Here is a description of the Babylonian Method:

1. Let's assume that x is the inputted double
2. Start with a guess, n. n can be any positive number. 
3. Use the following formula to get a better guess: m = (n + x/n) / 2 
4. As m is a better guess than n, update the value of your guess (set n = m)
5. Repeat steps 1-4 (with a loop) until the difference between your current n value and your previous n value is less than 0.00001
6. At this point, n will be a very close approximation of the squareroot.

The method has the following signature: public static double babylonian(double x) {}

After writing the three methods and testing that they work, add some code to your main method to test the methods. You should use Scanner in your main code to ask the user to type in a Double, and then calculate the squareroot of the value using the babylonian() method. Then, you should also run your calculateE() method.

Example of what your program may look like when it is being run:
```shell script
Enter a positive number!
125
The squareroot of 125.0 is 11.18033988749989
The value of e is roughly : 2.71828182845823
```

<br />
<br />

Add code to [MyMain.java](src/main/java/MyMain.java) to do the desired thing.

## Run your code with:
The easiest way to run your code is to press the play button in [MyMain.java](src/main/java/MyMain.java).

However, you can also run your code by typing the following into the Terminal.

```shell script
make run
```

Alternatively, if that doesn't work, use:

```shell script
./gradlew run
```

## Run your tests with:
The easiest way to run your code is to press the play button in [MyTests.java](src/test/java/MyTests.java).

However, you can also run your code by typing the following into the Terminal.

```shell script
make test
```

Alternatively, if that doesn't work, use:

```shell script
./gradlew test
```

