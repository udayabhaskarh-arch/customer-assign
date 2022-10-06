package com.customassign.codegen.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customassign.codegen.model.Order;
import com.customassign.codegen.model.Order.StatusEnum;
import com.customassign.codegen.repository.OrderRepository;
import com.customassign.codegen.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order getOrderById(Long orderId){
        return orderRepository.findById(orderId).orElse(new Order());
    }

    public void deleteOrder(Long orderId){
        Order order = getOrderById(orderId);
        order.setStatus(StatusEnum.INACTIVE);
        orderRepository.save(order);
    }

    public void saveOrder(Order order){
        orderRepository.save(order);
    }

    public Order updateOrder(Long orderId,Order requestOrder){
        Optional<Order> order = orderRepository.findById(orderId);
        if(order.isPresent()){
            Order record  =  order.get();
            BeanUtils.copyProperties(requestOrder, record);
            orderRepository.save(record);
            return record;
        }
        return new Order();
        
    }

}
