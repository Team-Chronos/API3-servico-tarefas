package com.criarTarefas.criarTarefas.controle;

import com.criarTarefas.criarTarefas.servico.ProfissionalExternoServico;
import com.criarTarefas.criarTarefas.modelo.DTO.ProfissionalNomeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/profissionais")
public class ProfissionalController {

    private final ProfissionalExternoServico profissionalExternoServico;

    public ProfissionalController(ProfissionalExternoServico profissionalExternoServico) {
        this.profissionalExternoServico = profissionalExternoServico;
    }

    @GetMapping("/nomes")
    public List<ProfissionalNomeDTO> listarNomes() {
        return profissionalExternoServico.listarNomesProfissionais();
    }
}