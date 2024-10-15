package org.example;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//      ЗАДАНИЕ 1

        String[] words = {
                "пион", "василек", "подсолнух", "пион", "тюльпан",
                "пион", "подсолнух", "подсолнух", "тюльпан", "одуванчик",
                "тюльпан", "роза", "пион", "пион", "одуванчик",
                "подсолнух", "василек", "василек"
        };

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова и их количество:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

//      ЗАДАНИЕ 2

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "123-45-67");
        phoneBook.add("Иванов", "984-43-34");
        phoneBook.add("Петров", "987-65-32");
        phoneBook.add("Сидоров", "777-77-77");

        System.out.println("Номера телефонов Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Номера телефонов Петрова: " + phoneBook.get("Петров"));
        System.out.println("Номера телефонов Сидорова: " + phoneBook.get("Сидоров"));
        System.out.println("Номера телефонов Смирнова: " + phoneBook.get("Смирнов"));
    }
}