package org.when.example;

import org.when.example.switchable.*;

/**
 * @author: when
 * @create: 2021-01-21  22:54
 **/
public class SwitchableApp {
    public static void main(String[] args) {
        BuildingManagement buildingManagement = new BuildingManagement();
        buildingManagement.addAsset(new RoomLight(101));
        buildingManagement.addAsset(new EmergencyLight(101));
        buildingManagement.addAsset(new Computer(101));
        buildingManagement.addAsset(new ComputerMonitor(101));

        buildingManagement.goodNight();
    }
}
