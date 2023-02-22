package com.miniproject.hisserver.order.model;



import com.miniproject.hisserver.common.BaseEntity;
import com.miniproject.hisserver.seat.model.Seat;

import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;



@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Where(clause = "deleted = false")
@SQLDelete(sql = "UPDATE seat SET deleted = true Where id = ?")
public class Orders extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String category;

    private int price;

    private int amount;

    @ManyToOne(fetch = FetchType.LAZY)
    private Seat seat;



}
