package com.listaTelefonica.ListaDeContatos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "ListaTelefonica")
public class ContatoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoCliente;

    @Column(length = 75, nullable = false)
    private String numeroDeTelefone;

    @Column(length = 75, nullable = false)
    private String nome;

}
