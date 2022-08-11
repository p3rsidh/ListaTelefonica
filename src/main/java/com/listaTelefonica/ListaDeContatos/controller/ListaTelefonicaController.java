package com.listaTelefonica.ListaDeContatos.controller;

import com.listaTelefonica.ListaDeContatos.model.ContatoModel;
import com.listaTelefonica.ListaDeContatos.service.ListaTelefonicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ListaTelefonicaController {

    @Autowired
    private ListaTelefonicaService listaTelefonicaService;

    @GetMapping(path = "/contatos")
    public List<ContatoModel> mostrarContatos(){
        return listaTelefonicaService.buscarContatos();
    }

    @GetMapping(path = "/contatos/{codigo}")
    public Optional<ContatoModel> buscarContatos(@PathVariable Long codigoCliente){

        return listaTelefonicaService.buscarTelefone(codigoCliente);
    }

    @PostMapping(path = "/contatos")
    @ResponseStatus(HttpStatus.CREATED)
    public ContatoModel adicionarContato(@RequestBody ContatoModel contatoModel){

        contatoModel.getCodigoCliente();
        contatoModel.getNumeroDeTelefone();
        contatoModel.getNome();

        return listaTelefonicaService.adicionarContato(contatoModel);
    }

}
