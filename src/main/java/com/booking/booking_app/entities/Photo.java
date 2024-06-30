package com.booking.booking_app.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "photos")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id")
    private Long photoId;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "places",
            joinColumns = { @JoinColumn(name = "place_id") },
            inverseJoinColumns = { @JoinColumn(name = "photo_id") }
    )
    private Collection<Place> places;

    @Column(name = "url", nullable = false, columnDefinition="TEXT")
    private String url;
}
