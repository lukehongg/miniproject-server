//package com.miniproject.hisserver.order.controller;
//
//import com.miniproject.hisserver.order.model.dto.OrderDto;
//import com.miniproject.hisserver.order.model.request.OrderIdRequest;
//import com.miniproject.hisserver.order.model.response.OrderIdResponse;
//import com.miniproject.hisserver.order.model.response.OrderResponse;
//import com.miniproject.hisserver.order.service.OrderService;
//import lombok.RequiredArgsConstructor;
//import org.apache.coyote.Response;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@RestController
//@RequestMapping("/api/order")
//@RequiredArgsConstructor
//@CrossOrigin(origins = "*")
//public class OrderController {
//    private final OrderService orderService;
//
//    @GetMapping("/orders")
//    public ResponseEntity<List<OrderResponse>> getOrders(Long storeId) {
//        List<OrderDto> orders = orderService.listAllOrders(storeId);
//        List<OrderResponse> responses = orders.stream()
//                .map(OrderDto::orderResponse)
//                .collect(Collectors.toList());
//        return ResponseEntity.ok(responses);
//    }
//
//    @PostMapping("/delete")
//    public ResponseEntity<OrderIdResponse> deleteOrder(
////            @RequestParam OrderIdRequest request
//            Long orderId
//    ) {
//        Long orderDeleteId = orderService.deleteOrder(
////                request.getOrderId()
//                orderId
//        );
//        OrderIdResponse response = new OrderIdResponse(orderDeleteId);
//        return ResponseEntity.ok(response);
//    }
//}
