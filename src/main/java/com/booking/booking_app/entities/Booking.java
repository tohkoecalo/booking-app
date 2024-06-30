package com.booking.booking_app.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;

    @Column(name = "booking_date", nullable = false, columnDefinition="timestamp")
    private Date bookingDate;

    @Column(name = "duration", nullable = false)
    private Long duration;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;
}
