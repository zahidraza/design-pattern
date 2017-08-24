package com.jazasoft.builder;

import org.testng.annotations.Test;

/**
 * Created by mdzahidraza on 24/08/17.
 */
public class ConstructionEngineerTest {
    @Test
    public void testConstructHouse() throws Exception {
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
        House houseA = engineerA.constructHouse();
        System.out.println("House is: "+houseA);
        PreFabricatedHouseBuilder prefabricatedHouseBuilder = new PreFabricatedHouseBuilder();
        ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
        House houseB = engineerB.constructHouse();
        System.out.println("House is: "+houseB);
    }

}
