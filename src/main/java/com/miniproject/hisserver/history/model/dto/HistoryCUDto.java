package com.miniproject.hisserver.history.model.dto;

import com.miniproject.hisserver.order.model.Orders;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HistoryCUDto {
    private Long historyId;
    private int cost;
    private List<Orders> orders;

    public HistoryCUDto(int cost, List<Orders> orders) {
        this.cost = cost;
        this.orders = orders;
    }
}
