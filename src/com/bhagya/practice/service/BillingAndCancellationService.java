package com.bhagya.practice.service;

import com.bhagya.practice.model.BillingAndCancellation;

import java.util.HashSet;
import java.util.Scanner;

public class BillingAndCancellationService {

    private HashSet<BillingAndCancellation> billingAndCancellations = new HashSet<>();
    int billingIndex = 0;
    Scanner scanner = new Scanner(System.in);

   // private BillingAndCancellation[] billings = new BillingAndCancellation[3];

    public void billingData(BillingAndCancellation billingAndCancellation) {
        System.out.println(billingAndCancellation);

    }

    public BillingAndCancellation BillingService(){

        int option =0;

        BillingAndCancellation billingAndCancellation = new BillingAndCancellation();

        System.out.println("Welcome to Airline booking System");
        System.out.println("Enter your option");
        option = Integer.parseInt(scanner.nextLine());

        System.out.println("Pls Select Your Payment Method");
        String method = scanner.nextLine();
        System.out.println("Enter Your UPI ID");
        int upiid = Integer.parseInt(scanner.nextLine());


        billingAndCancellation.setPaymentMethod(method);
        billingAndCancellation.setUpiid(upiid);

        return billingAndCancellation;

    }

    public void displayBilling(){
        for(BillingAndCancellation billingAndCancellation : billingAndCancellations);
        System.out.println("Billing Details " + billingAndCancellations);
    }



}
