package com.layered.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class ATest {
    @Id
    private long id;
    private String data;
}
