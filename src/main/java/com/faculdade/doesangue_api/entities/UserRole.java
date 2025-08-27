package com.faculdade.doesangue_api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_ROLES")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ROLE")
    private Long idRole;

    @Column(name = "NOME_ROLE", nullable = false, unique = true, length = 50)
    private String nomeRole;

    @Column(name = "NIVEL_ACESSO", nullable = false)
    private Integer nivelAcesso;

    @Column(name = "ATIVO", nullable = false)
    private Boolean ativo = true;
}
