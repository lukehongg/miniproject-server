//package com.miniproject.hisserver.order.model.dto;
//
//
//import com.miniproject.hisserver.order.model.Orders;
//import com.miniproject.hisserver.order.model.response.OrderResponse;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.time.LocalDateTime;
//
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//public class OrderDto {
//    private Long orderId;
//    private int price;
//
//    private String menuName;
//    private int seatNum;
//    private LocalDateTime orderTime;
//
//    public OrderDto(Orders orders) {
//        this.orderId = orders.getId();
//        this.price = orders.getPrice();
//
//        this.seatNum = orders.getSeat().getSeatNum();
//        this.orderTime = orders.getCreated_at();
//    }
//
//    public OrderResponse orderResponse() {
//        return new OrderResponse(orderId, price, seatNum, orderTime);
//    }
//
//}
