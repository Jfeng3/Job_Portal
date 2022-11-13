package com.example.jupiter_analytics.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class JobPost {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String title;

    private String postedBy;

    private String description;

    private String company;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
