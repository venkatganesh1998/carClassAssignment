package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testCarConstructorAndGetters() {
        Car car = new Car("Toyota", "Camry", 2020, "Red", 24000.00);

        assertEquals("Toyota", car.getMake());
        assertEquals("Camry", car.getModel());
        assertEquals(2020, car.getYear());
        assertEquals("Red", car.getColor());
        assertEquals(24000.00, car.getPrice());
    }

    @Test
    public void testSetMake() {
        Car car = new Car("Toyota", "Camry", 2020, "Red", 24000.00);
        car.setMake("Honda");
        assertEquals("Honda", car.getMake());
    }

    @Test
    public void testSetModel() {
        Car car = new Car("Toyota", "Camry", 2020, "Red", 24000.00);
        car.setModel("Accord");
        assertEquals("Accord", car.getModel());
    }

    @Test
    public void testSetYear() {
        Car car = new Car("Toyota", "Camry", 2020, "Red", 24000.00);
        car.setYear(2021);
        assertEquals(2021, car.getYear());
    }

    @Test
    public void testSetColor() {
        Car car = new Car("Toyota", "Camry", 2020, "Red", 24000.00);
        car.setColor("Blue");
        assertEquals("Blue", car.getColor());
    }

    @Test
    public void testSetPrice() {
        Car car = new Car("Toyota", "Camry", 2020, "Red", 24000.00);
        car.setPrice(23000.00);
        assertEquals(23000.00, car.getPrice());
    }
}
