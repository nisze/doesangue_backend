package com.faculdade.doesangue_api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DOADORES")
@Getter
@Setter

public class Doador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DOADOR")
    private Long idDoador;

    @Column(name = "FULL_NAME", length = 100, nullable = false)
    private String fullName;

    @Column(name = "CPF", length = 11, nullable = false, unique = true)
    private String cpf;

    @Column(name = "RG", length = 20)
    private String rg;

    @Column(name = "ORGAO_EMISSOR_RG", length = 10)
    private String orgaoEmissorRg;

    @Column(name = "UF_RG", length = 2)
    private String ufRg;

    @Column(name = "BIRTH_DATE", nullable = false)
    private LocalDate birthDate;

    @Column(name = "GENDER", length = 1, nullable = false)
    private String gender;

    @Column(name = "EMAIL", length = 100)
    private String email;

    @Column(name = "TELEFONE_PRINCIPAL", length = 15)
    private String telefonePrincipal;

    @Column(name = "TELEFONE_SECUNDARIO", length = 15)
    private String telefoneSecundario;

    @Column(name = "PREFERENCIA_CONTATO", length = 20)
    private String preferenciaContato;

    @Column(name = "LOGRADOURO", length = 100)
    private String logradouro;

    @Column(name = "NUMERO", length = 10)
    private String numero;

    @Column(name = "COMPLEMENTO", length = 50)
    private String complemento;

    @Column(name = "BAIRRO", length = 50)
    private String bairro;

    @Column(name = "CIDADE", length = 50)
    private String cidade;

    @Column(name = "ESTADO", length = 2)
    private String estado;

    @Column(name = "CEP", length = 10)
    private String cep;

    @Column(name = "PONTO_REFERENCIA", length = 100)
    private String pontoReferencia;

    @Column(name = "EMPRESA", length = 100)
    private String empresa;

    @Column(name = "LOGRADOURO_TRABALHO", length = 100)
    private String logradouroTrabalho;

    @Column(name = "NUMERO_TRABALHO", length = 10)
    private String numeroTrabalho;

    @Column(name = "COMPLEMENTO_TRABALHO", length = 50)
    private String complementoTrabalho;

    @Column(name = "BAIRRO_TRABALHO", length = 50)
    private String bairroTrabalho;

    @Column(name = "CIDADE_TRABALHO", length = 50)
    private String cidadeTrabalho;

    @Column(name = "ESTADO_TRABALHO", length = 2)
    private String estadoTrabalho;

    @Column(name = "CEP_TRABALHO", length = 10)
    private String cepTrabalho;

    @ManyToOne
    @JoinColumn(name = "ID_TIPO_SANGUINEO", nullable = false)
    private TipoSanguineo tipoSanguineo;

    @Column(name = "PESO_KG", precision = 5, scale = 2)
    private BigDecimal pesoKg;

    @Column(name = "ALTURA_CM")
    private Integer alturaCm;

    @ManyToOne
    @JoinColumn(name = "ID_HEMOCENTRO_CADASTRO")
    private Hemocentro hemocentroCadastro;

    @Column(name = "STATUS_DOADOR", length = 20)
    private String statusDoador;

    @Column(name = "PRIMEIRA_DOACAO")
    private Boolean primeiraDoacao;

    @Column(name = "DOADOR_HABITUAL")
    private Boolean doadorHabitual;

    @Column(name = "ACEITA_CONTATO_CAMPANHAS")
    private Boolean aceitaContatoCampanhas;

    @Column(name = "ACEITA_CONTATO_EMERGENCIA")
    private Boolean aceitaContatoEmergencia;

    @Column(name = "ACEITA_PESQUISAS_CIENTIFICAS")
    private Boolean aceitaPesquisasCientificas;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "CADASTRADO_POR", nullable = false)
    private User cadastradoPor;

    @Column(name = "DELETED_AT")
    private LocalDateTime deletedAt;

    @Column(name = "FOTO_PERFIL_URL", length = 500)
    private String fotoPerfilUrl;

    @Column(name = "FOTO_PERFIL_UPLOAD_EM")
    private LocalDateTime fotoPerfilUploadEm;
}
