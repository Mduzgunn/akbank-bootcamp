package org.md;

import org.md.domain.Home;
import org.md.domain.House;
import org.md.domain.Villa;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Service service = new Service();

        Home home1 = new Home(110, 222222, 1, 1);
        Home home2 = new Home(120, 333333, 2, 1);

        Villa villa1 = new Villa(110, 222222, 1, 1);
        Villa villa2 = new Villa(120, 333333, 2, 2);

        service.addHouse(villa1);
        service.addHouse(villa2);

        service.addHouse(home1);
        service.addHouse(home2);

        System.out.println("Total price of all villas: " + service.getTotalPriceOfVilla());
        System.out.println("Total price of all homes: " + service.getTotalPriceOfHome());
        System.out.println("Total price of all houses: " + service.getTotalPriceOfAllHouses());

        System.out.println("Average square meters of all villas: " + service.getTotalSquareMetersOfVilla());
        System.out.println("Average square meters of all homes: " + service.getTotalSquareMetersOfHome());
        System.out.println("Average square meters of all houses: " + service.getTotalSquareMetersOfAllHouses());

        System.out.println("Average price per square meter of all villas: " + service.getAveragePricePerSquareMeterOfVilla());
        System.out.println("Average price per square meter of all homes: " + service.getAveragePricePerSquareMeterOfHome());
        System.out.println("Average price per square meter of all houses: " + service.getAveragePricePerSquareMeterOfAllHouses());

        List<House> testFilter = service.getHousesByRoomAndLivingRoom(1, 1);

        System.out.println("-----------------------------------------");

        for (House house : testFilter) {
            System.out.println(house.getClass().getSimpleName() + " with " + house.getRooms() + " rooms and " + house.getLivingRooms() + " living rooms");
        }
    }

}
