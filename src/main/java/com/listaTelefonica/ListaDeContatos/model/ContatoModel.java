package com.listaTelefonica.ListaDeContatos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "ListaTelefonica")
public class ContatoModel {

    @Id
    private String numeroDeTelefone;

    @Column(length = 75, nullable = false)
    private String nome;

}
