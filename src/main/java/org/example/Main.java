package org.example;

//    ЗАДАНИЕ 1
public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Bobik");
        dogBobik.run(300);
        dogBobik.swim(5);

        Cat catSnezhok = new Cat("Snezhok");
        catSnezhok.run(150);
        catSnezhok.swim(3);
//        catSnezhok.eat(3);

        System.out.println("Всего животных:" + Animals.getAnimalsCount());
        System.out.println("Всего собак:" + Dog.getDogCount());
        System.out.println("Всего котов" + Cat.getCatCount());

        Bowl bowl = new Bowl(15);

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Snezhok");
        cats[1] = new Cat("Barsik");
        cats[2] = new Cat("Kuzya");

        for (Cat cat : cats) {
            cat.eat(bowl);

        }
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кот " + (i + 1) + (cats[i].isFull() ? " сыт." : " голоден."));
        }
        bowl.addFood(10);

        for (Cat cat : cats) {
            cat.eat(bowl);
        }
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кот " + (i + 1) + (cats[i].isFull() ? " сыт." : " голоден."));
        }
        System.out.println();

        //    ЗАДАНИЕ 2

        Shape circle = new Circle(5);
        circle.setFillColor("Красный");
        circle.setBorderColor("Чёрный");

        Shape rectangle = new Rectangle(4, 6);
        rectangle.setFillColor("Голубой");
        rectangle.setBorderColor("Зелёный");

        Shape triangle = new Triangle(3, 4, 5);
        triangle.setFillColor("Жёлтый");
        triangle.setBorderColor("Фиолетовый");

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);
    }
}
