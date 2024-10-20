package com.example;
import static com.example.FactorialCalculator.factorial;

public class Main {
    public static void main(String[] args) {
        int number = 5; // Здесь вы можете изменить число
        long result = factorial(number);
        System.out.println("Факториал " + number + " = " + result);
    }
    }
}
