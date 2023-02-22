package com.miniproject.hisserver.order.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.miniproject.hisserver.common.BaseEntity;
import com.miniproject.hisserver.history.model.History;
import com.miniproject.hisserver.menu.model.Menu;
import com.miniproject.hisserver.order.model.response.OrderResponse;
import com.miniproject.hisserver.ordermenu.model.OrderMenu;
import com.miniproject.hisserver.seat.model.Seat;
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
@SQLDelete(sql = "UPDATE orders SET deleted = true Where id = ?")
public class Orders extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private int price;

    @OneToMany(mappedBy = "orders")
    @JsonManagedReference
    private List<OrderMenu> orderMenu = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Store store;

    @ManyToOne(fetch = FetchType.LAZY)
    private History history;

    @ManyToOne(fetch = FetchType.LAZY)
    private Seat seat;
}
