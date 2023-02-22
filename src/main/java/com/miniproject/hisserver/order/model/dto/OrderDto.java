package com.miniproject.hisserver.order.model.dto;

import com.miniproject.hisserver.menu.model.Menu;
import com.miniproject.hisserver.order.model.Orders;
import com.miniproject.hisserver.order.model.response.OrderResponse;
import com.miniproject.hisserver.ordermenu.model.OrderMenu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.criterion.Order;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private Long orderId;
    private int price;
    private List<OrderMenu> orderMenu;
    private String menuName;
    private int seatNum;
    private LocalDateTime orderTime;

    public OrderDto(Orders orders) {
        this.orderId = orders.getId();
        this.price = orders.getPrice();
        this.orderMenu = orders.getOrderMenu();
        this.seatNum = orders.getSeat().getSeatNum();
        this.orderTime = orders.getCreated_at();
    }

    public OrderResponse orderResponse() {
        return new OrderResponse(orderId, price, orderMenu, seatNum, orderTime);
    }

}
