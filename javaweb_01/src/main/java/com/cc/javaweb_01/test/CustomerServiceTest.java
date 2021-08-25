package com.cc.javaweb_01.test;

import com.cc.javaweb_01.model.Customer;
import com.cc.javaweb_01.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest() {
        customerService = new CustomerService();
    }

    @Before
    public void init() {

    }

    @Test
    public void getCustomerListTest() {
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertEquals(2, customerList.size());
    }

    @Test
    public void createCustomerTest() {
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("name", "customer100");
        fieldMap.put("contact", "John");
        fieldMap.put("telephone", "13564657713");
        boolean created = customerService.createCustomer(fieldMap);
        Assert.assertTrue(created);
    }

    @Test
    public void getCustomerTest() {
        int id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void updateCustomerTest() {
        long id = 1;
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("contact", "Eric");
        boolean updated = customerService.updateCustomer(id, fieldMap);
        Assert.assertTrue(updated);
    }

    @Test
    public void deleteCustomerTest() {
        long id = 1;
        boolean deleted = customerService.deleteCustomer(id);
        Assert.assertTrue(deleted);
    }
}
