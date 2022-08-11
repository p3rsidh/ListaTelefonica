package com.listaTelefonica.ListaDeContatos.repository;

import com.listaTelefonica.ListaDeContatos.model.ContatoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaTelefonicaRepository extends JpaRepository<ContatoModel, String> {

}
