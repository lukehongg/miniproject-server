package com.miniproject.hisserver.order.model.response;

import com.miniproject.hisserver.menu.model.Menu;
import com.miniproject.hisserver.ordermenu.model.OrderMenu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {
    private Long orderId;
    private int price;
    private List<OrderMenu> orderMenu;
    private int seatNum;
    private LocalDateTime orderTime;
}
