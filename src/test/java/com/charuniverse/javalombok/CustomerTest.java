package com.charuniverse.javalombok;

import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    void testCustomer() {
        var customer = new Customer();
        customer.setId("123");
        customer.setName("Charun");

        System.out.println(customer.getId());
        System.out.println(customer.getName());
    }

    @Test
    void testCustomerConstructor() {
        var customer = new Customer("123", "Charun");
        System.out.println(customer.getId());
        System.out.println(customer.getName());
    }

    @Test
    void testCustomerEquals() {
        var customer1 = new Customer("123", "Charun");
        var customer2 = new Customer("123", "Charun");

        System.out.println(customer1.equals(customer2));
    }
}
