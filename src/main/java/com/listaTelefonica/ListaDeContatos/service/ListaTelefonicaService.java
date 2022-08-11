package com.listaTelefonica.ListaDeContatos.service;

import com.listaTelefonica.ListaDeContatos.model.ContatoModel;
import com.listaTelefonica.ListaDeContatos.repository.ListaTelefonicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListaTelefonicaService {

    @Autowired
    private ListaTelefonicaRepository listaTelefonicaRepository;

    public List<ContatoModel> buscarContatos(){
        return listaTelefonicaRepository.findAll();
    }

    public Optional<ContatoModel> buscarTelefone(String telefone){
        return  listaTelefonicaRepository.findById(telefone);
    }

    public ContatoModel adicionarContato(ContatoModel contatoModel){

        contatoModel.getNome();
        contatoModel.getNumeroDeTelefone();

        return listaTelefonicaRepository.save(contatoModel);
    }

    public void deletarContato(String telefone){
        listaTelefonicaRepository.deleteById(telefone);
    }

    public ContatoModel deletarContato(ContatoModel contato){
        contato.getNome();
        contato.getNumeroDeTelefone();

        return listaTelefonicaRepository.save(contato);
    }
}
