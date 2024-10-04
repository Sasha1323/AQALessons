package org.example;

import java.util.ArrayList;
import java.util.List;

public class Park {

    private List<Attraction> attractions;

    public Park() {
        attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String workingTime, double price) {
        attractions.add(new Attraction(name, workingTime, price));
    }

    public void displayAttractions() {
        for (Attraction attraction : attractions) {
            System.out.println(attraction);
        }
    }

    public class Attraction {
        private String name;
        private String workingTime;
        private double price;

        public Attraction(String name, String workingTime, double price) {
            this.name = name;
            this.workingTime = workingTime;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", workingTime='" + workingTime + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
