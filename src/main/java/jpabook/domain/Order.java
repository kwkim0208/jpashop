package jpabook.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
//연관관계 주인은 두테이블을 놓고 외래키가 가까운곳으로 지정하면 된다

@Entity
@Table(name="orders")
@Getter @Setter
public class Order {
    @Id
    @GeneratedValue
    @Column(name="order_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name="member_id")
    private Member Member;

    private List<OrderItem> orderItems=new ArrayList<>();
    private Deliveray deliveray;
    private LocalDateTime orderDate;
    private OrderStatus orderStatus;


}
