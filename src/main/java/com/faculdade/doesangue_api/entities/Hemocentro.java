package com.faculdade.doesangue_api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "HEMOCENTROS")
@Getter
@Setter

public class Hemocentro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_HEMOCENTRO")
    private Long idHemocentro;

    @Column(name = "CODIGO_HEMOCENTRO", length = 20, nullable = false, unique = true)
    private String codigoHemocentro;

    @Column(name = "NOME_HEMOCENTRO", length = 100, nullable = false)
    private String nomeHemocentro;

    @Column(name = "RAZAO_SOCIAL", length = 100)
    private String razaoSocial;

    @Column(name = "CNPJ", length = 14, unique = true)
    private String cnpj;

    @Column(name = "TIPO_HEMOCENTRO", length = 30, nullable = false)
    private String tipoHemocentro;

    @Column(name = "NIVEL_ATENCAO", length = 20)
    private String nivelAtencao;

    @Column(name = "LOGRADOURO", length = 100, nullable = false)
    private String logradouro;

    @Column(name = "NUMERO", length = 10, nullable = false)
    private String numero;

    @Column(name = "COMPLEMENTO", length = 50)
    private String complemento;

    @Column(name = "BAIRRO", length = 50, nullable = false)
    private String bairro;

    @Column(name = "CIDADE", length = 50, nullable = false)
    private String cidade;

    @Column(name = "ESTADO", length = 2, nullable = false)
    private String estado;

    @Column(name = "CEP", length = 10, nullable = false)
    private String cep;

    @Column(name = "TELEFONE_PRINCIPAL", length = 15, nullable = false)
    private String telefonePrincipal;

    @Column(name = "TELEFONE_SECUNDARIO", length = 15)
    private String telefoneSecundario;

    @Column(name = "EMAIL_INSTITUCIONAL", length = 100)
    private String emailInstitucional;

    @Column(name = "SITE_WEB", length = 100)
    private String siteWeb;

    @Column(name = "DIRETOR_TECNICO", length = 100)
    private String diretorTecnico;

    @Column(name = "CRM_DIRETOR", length = 20)
    private String crmDiretor;

    @Column(name = "RESPONSAVEL_TECNICO", length = 100)
    private String responsavelTecnico;

    @Column(name = "REGISTRO_RESPONSAVEL", length = 20)
    private String registroResponsavel;

    @Column(name = "CAPACIDADE_COLETAS_DIA")
    private Integer capacidadeColetasDia;

    @Column(name = "HORARIO_FUNCIONAMENTO", length = 100)
    private String horarioFuncionamento;

    @Column(name = "FUNCIONA_FERIADOS")
    private Boolean funcionaFeriados;

    @Column(name = "FUNCIONA_FINS_SEMANA")
    private Boolean funcionaFinsSemana;

    @Column(name = "ATIVO")
    private Boolean ativo;

    @Column(name = "DATA_LICENCIAMENTO")
    private LocalDate dataLicenciamento;

    @Column(name = "NUMERO_LICENCA", length = 50)
    private String numeroLicenca;

    @Column(name = "ORGAO_LICENCIADOR", length = 50)
    private String orgaoLicenciador;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

}
