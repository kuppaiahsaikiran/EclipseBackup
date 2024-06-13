package com.kodnest.Strings;

import java.util.Scanner;

public class FindingTarget {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the list of train stations as a string
        System.out.println("Enter the list of train stations separated by commas:");
        String stationList = scanner.nextLine();

        // Read the target station
        System.out.println("Enter the target station:");
        String targetStation = scanner.nextLine();

        // Check if the target station is present in the list
        if (isStationPresent(stationList, targetStation)) {
            System.out.println("Target station found in the list.");
        } else {
            System.out.println("Target station not found in the list.");
        }

        scanner.close();
    }

    private static boolean isStationPresent(String stationList, String targetStation) {
        // Split the station list into an array of station names
        String[] stations = stationList.split(",\\s*");

        // Check if the target station is present in the array
        for (String station : stations) {
            if (station.equalsIgnoreCase(targetStation)) {
                return true;
            }
        }
        return false;
    }
}
