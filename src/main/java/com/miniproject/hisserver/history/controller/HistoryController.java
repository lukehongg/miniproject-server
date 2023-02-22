package com.miniproject.hisserver.history.controller;

import com.miniproject.hisserver.history.model.History;
import com.miniproject.hisserver.history.model.dto.HistoryDto;
import com.miniproject.hisserver.history.model.request.HistoryRequest;
import com.miniproject.hisserver.history.model.response.HistoryResponse;
import com.miniproject.hisserver.history.service.HistoryService;
import com.miniproject.hisserver.order.model.Orders;
import com.miniproject.hisserver.order.model.dto.OrderDto;
import com.miniproject.hisserver.order.model.dto.OrderIdDto;
import com.miniproject.hisserver.order.model.response.OrderIdResponse;
import com.miniproject.hisserver.order.model.response.OrderResponse;
import com.miniproject.hisserver.order.repository.OrderRepository;
import com.miniproject.hisserver.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/history")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class HistoryController {
    private final HistoryService historyService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    @PostMapping
    public ResponseEntity<List<OrderIdResponse>> pay(Long storeId, int seatNum) {
        List<OrderDto> orders = orderService.listOrdersInTable(storeId, seatNum);
        List<OrderIdDto> deleteOrders = new ArrayList<>();
        for(OrderDto order : orders) {
            Long deleteId = orderService.deleteOrder(order.getOrderId());
            deleteOrders.add(new OrderIdDto(deleteId));
        }
        List<OrderIdResponse> responses = deleteOrders.stream()
                .map(OrderIdDto::orderIdResponse)
                .collect(Collectors.toList());
        return ResponseEntity.ok(responses);
    }
}
