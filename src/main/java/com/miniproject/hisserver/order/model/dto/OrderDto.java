package com.miniproject.hisserver.order.model.dto;

import com.miniproject.hisserver.menu.model.Menu;
import com.miniproject.hisserver.order.model.Orders;
import com.miniproject.hisserver.order.model.response.OrderResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private Long orderId;
    private int price;
    private List<Menu> menu;

    public OrderDto(Orders orders) {
        this.orderId = orders.getId();
        this.price = orders.getPrice();
        this.menu = orders.getMenu();
    }

    public OrderResponse orderResponse() {
        return new OrderResponse(orderId, price, menu);
    }
}
