/**
 * Name: Yining Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/07/2023
 * File Name: LegacyCustomerDataSystem.java
 * Description: Concrete implementation of the legacy system.
 */

package edu.bu.met.cs665.UtilizingLegacySystems;

public class LegacyCustomerDataSystem implements CustomerData_USB {

    @Override
    public void printCustomer(int customerId) {
        // Implementation for printing customer data from USB
        System.out.println("Customer data printed from USB for customer ID: " + customerId);
    }

    @Override
    public void getCustomer_USB(int customerId) {
        // Implementation for retrieving customer data from USB
        System.out.println("Customer data retrieved from USB for customer ID: " + customerId);
    }
}

