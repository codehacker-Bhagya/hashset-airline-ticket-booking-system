package com.bhagya.practice.service;

import com.bhagya.practice.model.Flight;
import com.bhagya.practice.model.Passenger;

import java.util.HashSet;
import java.util.Scanner;

public class FlightService{

    private HashSet<Flight> flights = new HashSet<>();
    Scanner scanner = new Scanner(System.in);
    int flightIndex = 0;
   // Flight[] flights = new Flight[3];

    public static void flightData(Flight flight) {
        System.out.println(flight);

    }

    public Flight FlightInformation() {
        int option = 0;

        Flight flight = new Flight();
        System.out.println("Welcome to Airline booking System");
        System.out.println("Enter your option");
        option = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Your Destination");
        String destination = scanner.nextLine();
        System.out.println("Enter Your Flight Name which flight ticket do you need");
        String flightName = scanner.nextLine();
        System.out.println("Your Flight No Is : 5231");
        System.out.println("Flight Status: Ticket Is Available You Can book Your Ticket");


        flight.setDestination(destination);
        flight.setFlightName(flightName);
        return flight;
    }
    public void displayFlight() {
        for (Flight flight : flights) {
            System.out.println("Passenger info " + flight);
        }

    }

}
