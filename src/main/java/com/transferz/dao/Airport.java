package com.transferz.dao;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "airport")
public class Airport {
    @Id
    @Column(name = "code")
    @NotBlank
    @Size(max = 255)
    private String code;

    @Column(name = "name")
    @NotBlank
    @Size(max = 20)
    private String name;

    @Column(name = "country")
    @NotBlank
    @Size(max = 60)
    private String country;
}
