package com.jazasoft.builder;

/**
 * Created by mdzahidraza on 24/08/17.
 */
public class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() {
        house = new House();
    }

    public void buildFoundation() {
        house.setFoundation("Concrete, brick, and stone");
        System.out.println("ConcreteHouseBuilder: Foundation complete...");
    }

    public void buildStructure() {
        house.setStructure("Concrete, mortar, brick, and reinforced steel");
        System.out.println("ConcreteHouseBuilder: Structure complete...");
    }

    public void buildRoof() {
        house.setRoof("Concrete and reinforced steel");
        System.out.println("ConcreteHouseBuilder: Roof complete...");
    }

    public void furnishHouse() {
        house.setFurnished(true);
        System.out.println("ConcreteHouseBuilder: Furnishing complete...");
    }

    public void paintHouse() {
        house.setPainted(true);
        System.out.println("ConcreteHouseBuilder: Painting complete...");
    }

    public House getHouse() {
        System.out.println("ConcreteHouseBuilder: Concrete house complete...");
        return house;
    }
}
