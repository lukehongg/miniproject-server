package com.miniproject.hisserver.history.controller;

import com.miniproject.hisserver.history.model.History;
import com.miniproject.hisserver.history.model.dto.HistoryDto;
import com.miniproject.hisserver.history.model.request.HistoryRequest;
import com.miniproject.hisserver.history.model.response.HistoryResponse;
import com.miniproject.hisserver.history.service.HistoryService;
import com.miniproject.hisserver.order.model.Orders;
import com.miniproject.hisserver.order.model.dto.OrderDto;
import com.miniproject.hisserver.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/history")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class HistoryController {
    private final HistoryService historyService;
    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<HistoryResponse> create(Long storeId, int seatNum) {
        List<Orders> orders = orderService.listOrdersInTable(storeId, seatNum);
        History history = historyService.create(orders);
        HistoryResponse response = history.historyResponse();
        return ResponseEntity.ok(response);
    }
}
