/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.myrestaurant.services;

import com.sun.tools.javac.util.Pair;
import edu.eci.arsw.myrestaurant.model.Order;
import edu.eci.arsw.myrestaurant.model.RestaurantProduct;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author hcadavid
 */
public interface RestaurantOrderServices {

    void addNewOrderToTable(Order o) throws OrderServicesException;

    void calculateTableBill(int tableNumber) throws OrderServicesException;

    Set<String> getAvailableProductNames();

    RestaurantProduct getProductByName(String product) throws OrderServicesException;

    Order getTableOrder(int tableNumber);

    Set<Integer> getTablesWithOrders();

    HashMap<Pair<String, Integer>,Order> getOrderTotal() throws OrderServicesException;

    void releaseTable(int tableNumber) throws OrderServicesException;
    
}
