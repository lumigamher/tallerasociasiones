package com.campus.tallerasociasiones.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "invoices")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private Long total;

    @ManyToOne
    private Client client;
}
