package com.acme.testing;

import com.acme.domain.Order;
import com.acme.utils.MyDate;

public class TestOrders {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyDate date1 = new MyDate(1, 20, 2008);
        Order anvil = new Order(date1, 2000.00, "Wile E Coyote", "Anvil", 10);

        MyDate date2 = new MyDate(4, 10, 2008);
        Order balloons = new Order(date2, 1000.00, "Bugs Bunny", "Balloon", 125);
        System.out.println("Your First order details:  ");
        System.out.println(anvil);
        System.out.println("The tax Rate is currently: " + Order.taxRate);
        // Order.computeTaxOn(3000.00);
        anvil.computeTax();
	
	 /*Order.setTaxRate(0.06); 
		 System.out.println("The tax Rate is currently: " +
	  Order.taxRate); anvil.computeTax(); 
		 balloons.computeTax();*/

        System.out.println("The total bill for " + anvil + " is " + anvil.computeTotal());
        System.out.println("--------------------------------------------");
        System.out.println("Your second order details: ");
        System.out.println(balloons);
        System.out.println("The tax Rate is currently: " + Order.taxRate);
        balloons.computeTax();

        System.out.println("The total bill for " + balloons + " is " + balloons.computeTotal());
    }

}
