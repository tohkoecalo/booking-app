package com.booking.booking_app.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "statuses")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "status_id")
    private Long statusId;

    @Column(name = "alias", nullable = false, length = 64)
    private String alias;
}
