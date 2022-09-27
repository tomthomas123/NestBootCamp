package com.nest;
import com.nest.newhotel.Fooditems;

import java.util.ArrayList;
import java.util.Scanner;
public class Hotel {
    static int total=0;

    public static void main(String[] args) {

                int y;
                int x;
                Scanner s=new Scanner(System.in);
        Fooditems foodItems=new Fooditems(10,23,12,20);
        Fooditems takeaway=new Fooditems(10,25,15,25);
                while (true) {
                    System.out.println("enter the choice");
                    System.out.println("1.Tea "+"price-> "+ foodItems.getTea());
                    System.out.println("2.coffe "+ foodItems.getCoffee());
                    System.out.println("3. dosa "+ foodItems.getDosa());
                    System.out.println("4. idle "+ foodItems.getIdle());
//                    System.out.println("5.ice cream 35$");
//                    System.out.println("6.BILL");
//                    System.out.println("7.exit");

                    System.out.println("1. Dining");
                    System.out.println("2. Takeaway");
                    y=s.nextInt();
                    x=s.nextInt();


                     switch (y) {
                        case 1:
                            System.out.println(" Selected Dining");
                            switch (x)
                            {
                                case 1:
                                    System.out.println("how many quantity");
                                    int m = foodItems.getTea();
                                    total = (10 * m) + total;
                                    System.out.println(total);
                                    break;
                                case 2:
                                    System.out.println("how many quantity");
                                    int n = foodItems.getCoffee();
                                    total = (30 * n) + total;
                                    System.out.println(total);

                                    break;
                                case 3:
                                    System.out.println("how many quantity");
                                    int o = foodItems.getDosa();
                                    total = (12 * o) + total;
                                    System.out.println(total);
                                    break;
                                case 4:
                                    System.out.println("how many quantity");
                                    int l = foodItems.getIdle();
                                    total = (15 * l) + total;
                                    System.out.println(total);
                                    break;

                            }


                        case 2:
                            System.out.println("Selected Takeaway");
                            switch(x) {
                                case 1:
                                    System.out.println("how many quantity");
                                    int m = takeaway.getTea();// s.nextInt();
                                    total = (10 * m) + total;
                                    System.out.println(total);
                                    break;
                                case 2:
                                    System.out.println("how many quantity");
                                    int n = takeaway.getCoffee();//s.nextInt();
                                    total = (30 * n) + total;
                                    System.out.println(total);
                                    break;
                                case 3:
                                    System.out.println("how many quantity");
                                    int o = takeaway.getDosa();//s.nextInt();
                                    total = (12 * o) + total;
                                    System.out.println(total);
                                    break;
                                case 4:
                                    System.out.println("how many quantity");
                                    int l = takeaway.getIdle();//s.nextInt();
                                    total = (15 * l) + total;
                                    System.out.println(total);
                                    break;
                                default:
                                    System.out.println("InValid");
                            }


                    }
                }

            }
        }


