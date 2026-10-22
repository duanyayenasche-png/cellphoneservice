package com.pluralsight;

import java.util.Scanner;

public class CellphoneService {



    public static void main(String[] args) {


        //create the phone
        CellPhone newPhoneWhoDis = new CellPhone();

        Scanner input = new Scanner(System.in);

        /*
        what is the serial number? 2578321
        what model is the phone? Iphone 17 Max
        What is the phone carrier? Tmobile
        Who is the owner? Duanyay

         */
        System.out.println(newPhoneWhoDis.toString());

        System.out.println("Serial Number:" + newPhoneWhoDis.getSerialNumber());
        System.out.println("Model:" + newPhoneWhoDis.getModel());
        System.out.println("Carrier:" + newPhoneWhoDis.getCarrier());
        System.out.println("Owner:" + newPhoneWhoDis.getOwner());
        System.out.println("Phone Number:" + newPhoneWhoDis.getPhoneNumber());



    }


}
