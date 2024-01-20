package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Office> officeList = new ArrayList<>();
        officeList.add(new Office());
        officeList.add(new Office());
//        officeList.add(new House());
        printBuildings(officeList);

        List<Buildings> buildingsList = new ArrayList<>();
        buildingsList.add(new Buildings());
        buildingsList.add(new Buildings());
        buildingsList.add(new House());
        addHouseToList(buildingsList);
        buildingsList.add(new Office());
        printBuildings(buildingsList);

        List<House> houseList = new ArrayList<>();
        houseList.add(new House());
        houseList.add(new House());
        addHouseToList(houseList);
        printBuildings(houseList);
    }

    public static void printBuildings(List<? extends Buildings> lst) {
        for(Buildings b: lst)
            System.out.println(b.toString());
    }

    public static void addHouseToList(List<? super House> lst) {
        lst.add(new House());
    }
}
