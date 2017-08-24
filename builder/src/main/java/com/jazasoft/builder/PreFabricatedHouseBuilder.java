package com.jazasoft.builder;

/**
 * Created by mdzahidraza on 24/08/17.
 */
public class PreFabricatedHouseBuilder implements HouseBuilder{
    private House house;

    public PreFabricatedHouseBuilder() {
        this.house = new House();
    }
    
    
    public void buildFoundation() {
        house.setFoundation("Wood, laminate, and PVC flooring");
        System.out.println("PrefabricatedHouseBuilder: Foundation complete...");
    }
    
    public void buildStructure(){
        house.setStructure("Structural steels and wooden wall panels");
        System.out.println("PrefabricatedHouseBuilder: Structure complete...");
    }

    public void buildRoof(){
        house.setRoof("Roofing sheets");
        System.out.println("PrefabricatedHouseBuilder: Roof complete...");
    }

    public void paintHouse(){
        house.setPainted(false);
        System.out.println("PrefabricatedHouseBuilder: Painting not required...");
    }

    public void furnishHouse(){
        house.setFurnished(true);
        System.out.println("PrefabricatedHouseBuilder: Furnishing complete...");
    }

    public House getHouse() {
        System.out.println("PrefabricatedHouseBuilder: Prefabricated house complete...");
        return house;
    }
}