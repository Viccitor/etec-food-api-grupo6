package br.com.etechas.etecfood.controller ;

import br.com.etechas.etecfood.entity.Avaliacao;
import br.com.etechas.etecfood.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class AvaliacaoController {
    @Autowired
    private AvaliacaoRepository avaliacaoRepository;


    @GetMapping
    public List<Avaliacao> listar() {
        return avaliacaoRepository.findAll();
    }

}
