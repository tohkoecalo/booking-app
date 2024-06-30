package com.booking.booking_app.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "places")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "place_id")
    private Long placeId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", columnDefinition="TEXT")
    private String description;

    @Column(name = "address")
    private String address;

    @Column(name = "latitude", nullable = false, columnDefinition="FLOAT8")
    private float latitude;

    @Column(name = "longitude", nullable = false, columnDefinition="FLOAT8")
    private float longitude;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
