package com.booking.booking_app.entities;

import jakarta.persistence.*;

public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long reviewId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;

    @Column(name = "rating")
    private Long rating;

    @Column(name = "comment", columnDefinition="TEXT")
    private String comment;
}
