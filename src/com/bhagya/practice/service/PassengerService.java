package com.bhagya.practice.service;

import com.bhagya.practice.model.Flight;
import com.bhagya.practice.model.Passenger;

import java.util.HashSet;
import java.util.Scanner;

public class PassengerService {
    private static Scanner scanner = new Scanner(System.in);
    int passengerIndex = 0;
    private HashSet<Passenger> passengers = new HashSet<>();

    //private static Passenger[] passengers = new Passenger[3];

    public static void passengerData(Passenger passenger) {
        System.out.println(passenger);

    }

    public   Passenger acceptPassenger() {

        int option = 0;
        Passenger passenger = new Passenger();

        System.out.println("Welcome to Airline booking System");
        System.out.println("....pls choose your option....");
        option = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Your Full Name");
        String name = scanner.nextLine();
        System.out.println("Enter Your Mo No");
        long MoNo = scanner.nextLong();
        System.out.println("Enter Your UID no");
        long uid = scanner.nextLong();

        // passengers[passengerIndex] = passenger;
        // passengerIndex++;
        passenger.setFullName(name);
        passenger.setMoNo(MoNo);
        passenger.setUIDno(uid);
        return passenger;


    }

    public void displayPassenger() {
        for (Passenger passenger : passengers) {
            System.out.println("Passenger info " + passenger);
        }


    }

}