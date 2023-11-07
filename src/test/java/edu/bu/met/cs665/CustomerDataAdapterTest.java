package edu.bu.met.cs665;

import edu.bu.met.cs665.UtilizingLegacySystems.CustomerDataAdapter;
import edu.bu.met.cs665.UtilizingLegacySystems.CustomerData_HTTPS;
import edu.bu.met.cs665.UtilizingLegacySystems.CustomerData_USB;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerDataAdapterTest {

    private CustomerDataAdapter adapter;
    private boolean printCustomerCalled;
    private boolean getCustomerCalled;
    private int storedCustomerId;

    // Stub implementation of CustomerData_USB within the test class
    private CustomerData_USB createStubCustomerDataUSB() {
        return new CustomerData_USB() {
            @Override
            public void printCustomer(int customerId) {
                printCustomerCalled = true;
                storedCustomerId = customerId;
            }

            @Override
            public void getCustomer_USB(int customerId) {
                getCustomerCalled = true;
                storedCustomerId = customerId;
            }
        };
    }

    @Before
    public void setUp() {
        printCustomerCalled = false;
        getCustomerCalled = false;
        storedCustomerId = -1;

        CustomerData_USB stub = createStubCustomerDataUSB();
        adapter = new CustomerDataAdapter(stub);
    }

    @Test
    public void testPrintCustomer() {
        int customerId = 12345;
        adapter.printCustomer(customerId);
        assertTrue("The printCustomer method should be called on the legacy system.", printCustomerCalled);
        assertEquals("The customerId passed to printCustomer is incorrect.", customerId, storedCustomerId);
    }

    @Test
    public void testGetCustomer_HTTPS() {
        int customerId = 67890;
        adapter.getCustomer_HTTPS(customerId);
        assertTrue("The getCustomer_USB method should be called on the legacy system.", getCustomerCalled);
        assertEquals("The customerId passed to getCustomer_USB is incorrect.", customerId, storedCustomerId);
    }
}


