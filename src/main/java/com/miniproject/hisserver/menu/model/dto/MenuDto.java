package com.miniproject.hisserver.menu.model.dto;

import com.miniproject.hisserver.order.model.Orders;
import com.miniproject.hisserver.ordermenu.model.OrderMenu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MenuDto {
    private Long menuId;
    private String name;
    private String image;
    private String price;
    private List<OrderMenu> orderMenu;
}
