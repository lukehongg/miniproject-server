package com.miniproject.hisserver.seat.model;

import com.miniproject.hisserver.common.BaseEntity;
import com.miniproject.hisserver.order.model.Orders;
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
@SQLDelete(sql = "UPDATE seat SET deleted = true Where id = ?")
public class Seat extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private int seatNum;

    @ManyToOne(fetch = FetchType.LAZY)
    private Store store;

    @OneToMany(mappedBy = "seat")
    private List<Orders> orders = new ArrayList<>();

}
