package com.faculdade.doesangue_api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TIPOS_SANGUINEOS")
@Getter
@Setter

public class TipoSanguineo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TIPO")
    private Long idTipoSanguineo;

    @Column(name = "TIPO_ABO", length = 2, nullable = false)
    private String tipoAbo;

    @Column(name = "FATOR_RH", length = 1, nullable = false)
    private String fatorRh;

    @Column(name = "DESCRICAO_COMPLETA", length = 5, nullable = false, unique = true)
    private String descricaoCompleta;

    @Column(name = "PODE_DOAR_PARA", length = 100)
    private String podeDoarPara;

    @Column(name = "PODE_RECEBER_DE", length = 100)
    private String podeReceberDe;

    @Column(name = "PREVALENCIA_PERCENTUAL", precision = 5, scale = 2)
    private BigDecimal prevalenciaPercentual;

    @Column(name = "ATIVO")
    private Boolean ativo;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;
}
