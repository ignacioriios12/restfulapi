package com.cursoJaax.restfulapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "locals")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String name; /*nombre del local*/
    private String code; /*codigo del local*/
    private String floor;   /*piso donde se encuentra el local*/


}
