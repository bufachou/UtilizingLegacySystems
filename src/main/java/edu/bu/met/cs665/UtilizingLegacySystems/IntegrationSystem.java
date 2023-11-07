/**
 * Name: Yining Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/07/2023
 * File Name: IntegrationSystem.java
 * Description: The main class that demonstrates the usage of the adapter.
 */

package edu.bu.met.cs665.UtilizingLegacySystems;

public class IntegrationSystem {

    public static void main(String[] args) {
        // Create an instance of the legacy system
        CustomerData_USB legacySystem = new LegacyCustomerDataSystem();

        // Create an adapter that allows the new system to use the legacy system's methods
        CustomerData_HTTPS adapter = new CustomerDataAdapter(legacySystem);

        // Use the new system's interface to interact with the legacy system
        adapter.printCustomer(12345);
        adapter.getCustomer_HTTPS(67890);
    }
}

