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

    public Optional<ContatoModel> buscarTelefone(Long codigoCliente){
        return  listaTelefonicaRepository.findById(codigoCliente);
    }

    public ContatoModel adicionarContato(ContatoModel contatoModel){

        contatoModel.getNome();
        contatoModel.getNumeroDeTelefone();
        contatoModel.getCodigoCliente();

        return listaTelefonicaRepository.save(contatoModel);
    }

    public void deletarContato(Long codigoCliente){
        listaTelefonicaRepository.deleteById(codigoCliente);
    }

    public ContatoModel editarContato(ContatoModel contato){
        contato.getNome();
        contato.getNumeroDeTelefone();

        return listaTelefonicaRepository.save(contato);
    }
}
