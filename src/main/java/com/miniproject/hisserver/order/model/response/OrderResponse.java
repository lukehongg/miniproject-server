package com.miniproject.hisserver.order.model.response;

import com.miniproject.hisserver.menu.model.Menu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {
    private Long orderId;
    private int price;
    private List<Menu> menu;
}
