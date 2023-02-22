package com.miniproject.hisserver.history.model;

import com.miniproject.hisserver.common.BaseEntity;
import com.miniproject.hisserver.history.model.dto.HistoryCUDto;
import com.miniproject.hisserver.history.model.dto.HistoryDto;
import com.miniproject.hisserver.history.model.response.HistoryResponse;
import com.miniproject.hisserver.order.model.Orders;
import com.miniproject.hisserver.order.model.dto.OrderDto;
import com.miniproject.hisserver.store.model.Store;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Where(clause = "deleted = false")
@SQLDelete(sql = "UPDATE history SET deleted = true Where id = ?")
public class History extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private int cost;

    @OneToMany(mappedBy = "history")
    private List<Orders> orders = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Store store;


//    public History(HistoryCUDto dto) {
//        this.cost = dto.getCost();
//        this.orders = dto.getOrders();
//    }

    public History(List<Orders> orders) {
        this.orders = orders;
    }

    public HistoryDto toCreateDto() {
        return HistoryDto.builder()
                .historyId(this.id)
                .cost(this.cost)
                .orders(this.orders)
                .build();
    }

    public HistoryResponse historyResponse() {
        return new HistoryResponse(id, cost, orders);
    }
}
