package org.example;
import static org.example.FactorialCalculator.factorial;

public class Main {
    public static void main(String[] args) {
        int number = 5; // Здесь вы можете изменить число
        long result = factorial(number);
        System.out.println("Факториал " + number + " = " + result);
    }
    }
}
