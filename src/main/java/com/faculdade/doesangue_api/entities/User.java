package com.faculdade.doesangue_api.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="USERS")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USER")
    private Long idUser;

    @Column(name = "FULL_NAME", length = 100, nullable = false)
    private String fullName;

    @Column(name = "CPF", length = 11, nullable = false, unique = true)
    private String cpf;

    @Column(name = "EMAIL", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "SENHA_HASH", length = 255, nullable = false)
    private String senhaHash;

    @Column(name = "REGISTRO_PROFISSIONAL", length = 20)
    private String registroProfissional;

    @Column(name = "CONSELHO_CLASSE", length = 10)
    private String conselhoClasse;

    @Column(name = "UF_REGISTRO", length = 2)
    private String ufRegistro;

    @Column(name = "TELEFONE_PRINCIPAL", length = 15)
    private String telefonePrincipal;

    @Column(name = "TELEFONE_SECUNDARIO", length = 15)
    private String telefoneSecundario;

    @Column(name = "LOGRADOURO", length = 100)
    private String logradouro;

    @Column(name = "NUMERO", length = 10)
    private String numero;

    @Column(name = "COMPLEMENTO", length = 50)
    private String complemento;

    @Column(name = "BAIRRO", length = 50)
    private String bairro;

    @Column(name ="CIDADE", length = 50)
    private String cidade;

    @Column(name = "ESTADO", length = 2)
    private String estado;

    @Column(name = "CEP", length = 10)
    private String cep;

    @Column(name = "CONTA_ATIVA")
    private Boolean contaAtiva;

    @Column(name = "LAST_LOGIN")
    private LocalDateTime lastLogin;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_HEMOCENTRO_PRINCIPAL")
    private Hemocentro hemocentroPrincipal;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_ROLE", nullable = false)
    private UserRole userRole;

}
