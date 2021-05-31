package com.Model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class AEntity implements Serializable {
    @Id
    @Getter
    @Setter
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
}
