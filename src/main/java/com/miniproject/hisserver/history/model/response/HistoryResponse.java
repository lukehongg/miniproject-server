package com.miniproject.hisserver.history.model.response;

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
public class HistoryResponse {
    private Long historyId;
    private int cost;
    private List<Orders> orders;
}
