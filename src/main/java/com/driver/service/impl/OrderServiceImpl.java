package com.driver.service.impl;

import com.driver.Convertor.OrderConvertor;
import com.driver.io.entity.OrderEntity;
import com.driver.io.repository.OrderRepository;
import com.driver.service.OrderService;
import com.driver.shared.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Override
    public OrderDto createOrder(OrderDto order) {
        return null;
    }

    @Override
    public OrderDto getOrderById(String orderId) {
        OrderEntity orderEntity=orderRepository.findByOrderId(orderId);
       OrderDto orderDto= OrderConvertor.convertUserToDto(orderEntity);
       return OrderDto;
    }

    @Override
    public OrderDto updateOrderDetails(String orderId, OrderDto order) throws Exception {
        return null;
    }

    @Override
    public void deleteOrder(String orderId) throws Exception {
          OrderEntity orderEntity=orderRepository.findByOrderId(orderId);
          orderRepository.delete(orderEntity);
    }

    @Override
    public List<OrderDto> getOrders() {
        return null;
    }
}
}