package com.java.automation.lab.fall.antonyuk.core22.domain.event;

import com.java.automation.lab.fall.antonyuk.core22.domain.horse.*;

import com.java.automation.lab.fall.antonyuk.core22.domain.person.Rider;

import java.util.Objects;

public class Unit {

    private Horse horse;
    private Rider rider;

    public Unit() {
    }

    public Unit(Horse horse, Rider rider) {
        this.horse = horse;
        this.rider = rider;
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Unit unit = (Unit) o;
        return Objects.equals(horse, unit.horse) &&
                Objects.equals(rider, unit.rider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horse, rider);
    }

    @Override
    public String toString() {
        return "Unit{" +
                "horse=" + horse +
                ", rider=" + rider +
                '}';
    }
}
