/**
 * Name: Yining Wang
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/07/2023
 * File Name: CustomerDataAdapter.java
 * Description: The adapter class that implements the new system interface and adapts it to the old system.
 */

package edu.bu.met.cs665.UtilizingLegacySystems;

public class CustomerDataAdapter implements CustomerData_HTTPS {

    private final CustomerData_USB oldSystem;

    public CustomerDataAdapter(CustomerData_USB oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public void printCustomer(int customerId) {
        // Adapt the print call to the old system's method
        oldSystem.printCustomer(customerId);
    }

    @Override
    public void getCustomer_HTTPS(int customerId) {
        // Adapt the get customer call to the old system's method
        oldSystem.getCustomer_USB(customerId);
    }
}

