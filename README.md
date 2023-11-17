# Film Classifications

This Java program, `FilmClassifications`, is designed to determine the available film classifications based on the age of the viewer. The program defines a method called `getAvailableClassifications`, which takes the age of the viewer as input and returns a string indicating the available film classifications.

## How it Works

The `getAvailableClassifications` method uses conditional statements to determine the appropriate film classifications for different age ranges. Here's a brief overview:

- If the viewer is less than 4 years old, no films are available.
- For viewers aged 4 to less than 8, only "U" films are available.
- For viewers aged 8 to less than 12, "U" and "PG" films are available.
- For viewers aged 12 to less than 15, "U," "PG," and "12" films are available.
- For viewers aged 15 to less than 18, "U," "PG," "12," and "15" films are available.
- If the viewer is 18 years old or older, all films are available.

## How to Use

The `FilmClassifications` class contains a `main` method that initializes the age of the viewer (currently set to 0) and prints the result of the `getAvailableClassifications` method.Can modify the `ageOfViewer` variable in the `main` method to test different age scenarios.