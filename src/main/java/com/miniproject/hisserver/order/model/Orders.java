package com.miniproject.hisserver.order.model;

import com.miniproject.hisserver.common.BaseEntity;
import com.miniproject.hisserver.menu.model.Menu;
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

//    private int count;

    private int price;

    @OneToMany
    private List<Menu> menu = new ArrayList<>();

//    @ManyToOne(fetch = FetchType.LAZY)
//    private Seat seat;

    @ManyToOne(fetch = FetchType.LAZY)
    private Store store;
}
