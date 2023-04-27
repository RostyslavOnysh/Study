package MateAcademy.JavaBasicExtended.ArraysExtended.Build;

import MateAcademy.ArraysExtended.Build.Building;

public class getNumberOfFlats {
    public int getNumberOfFlats(Building[] buildingsInfo) {
        // Write code below this line
        int totalApartments = 0;
        for (Building building : buildingsInfo) {
            int apartmentsInBuilding = building.numberOfFloors * building.flatsOnTheFloor;
            totalApartments += apartmentsInBuilding;
        }
        return totalApartments;
    }
}

      /*
       int[] buildingsInfo = {5, 5};
        int sum =0;
        for (int i = 0; i < buildingsInfo.length; i++) {
           sum = buildingsInfo[i] * buildingsInfo[i];

        }
        System.out.println(sum);
    }
}
       */
