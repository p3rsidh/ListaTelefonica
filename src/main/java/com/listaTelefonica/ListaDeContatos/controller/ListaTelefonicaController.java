package com.listaTelefonica.ListaDeContatos.controller;

import com.listaTelefonica.ListaDeContatos.model.ContatoModel;
import com.listaTelefonica.ListaDeContatos.service.ListaTelefonicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListaTelefonicaController {

    @Autowired
    private ListaTelefonicaService listaTelefonicaService;

    @GetMapping(path = "/contatos")
    public List<ContatoModel> buscarContatos(){

        return null;
    }

}
