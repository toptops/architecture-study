package com.layered.infra.mysql.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class ATestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "data", nullable = false)
    private String data;

    @Enumerated(EnumType.STRING)
    @Column(name = "enum", nullable = false)
    private TestEnum testEnum;
}
