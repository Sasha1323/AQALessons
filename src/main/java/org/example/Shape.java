package org.example;

public interface Shape {

    double area();
    double perimeter();
    void setFillColor(String color);
    void setBorderColor(String color);
    default double defaultPerimeter() {
        return perimeter();
    }
}
