package com.jazasoft.builder;

/**
 * Created by mdzahidraza on 24/08/17.
 */
public interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void furnishHouse();
    void paintHouse();
    House getHouse();
}
