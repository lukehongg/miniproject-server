package com.miniproject.hisserver.order.service;

import com.miniproject.hisserver.order.model.Orders;
import com.miniproject.hisserver.order.model.dto.OrderDto;
import com.miniproject.hisserver.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    @Transactional
    public List<OrderDto> listAllOrders(Long storeId) {
        List<Orders> orders = orderRepository.findAllByStoreId(storeId);
        return orders.stream().map(OrderDto::new).collect(Collectors.toList());
    }

    @Transactional
    public Long deleteOrder(Long orderId) {
        orderRepository.deleteById(orderId);
        return orderId;
    }

    @Transactional
    public List<Orders> listOrdersInTable(Long storeId, int seatNum) {
        List<Orders> orders = orderRepository.findAllByStoreIdAndSeatId(storeId, seatNum);
        return orders;
    }

}
