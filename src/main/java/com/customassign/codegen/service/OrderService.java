package com.customassign.codegen.service;

import com.customassign.codegen.model.Order;

public interface OrderService {
    /**
     * @param orderId
     * @return
     */
    public Order getOrderById(Long orderId);
    /**
     * @param orderId
     */
    public void deleteOrder(Long orderId);
    /**
     * @param order
     */
    public void saveOrder(Order order);
    
    /**
     * @param orderId
     * @param requestOrder
     * @return
     */
    public Order updateOrder(Long orderId,Order requestOrder);
}
