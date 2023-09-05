package com.portfolio.crud.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Year;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "carros")
public class Carro {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_carro")
    private Long id;

    @Column(name = "tx_marca")
    private String marca;

    @Column(name = "tx_modelo")
    private String modelo;

    @Column(name = "date_ano")
    private Year ano;

}
