package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        int expected = 21;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(19);
        conditioner.decreaseCurrentTemperature();
        int expected = 18;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureAboveMax () {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(31);
        conditioner.increaseCurrentTemperature();
        int expected = 30;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureBelowMin() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        int expected = 16;

        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}