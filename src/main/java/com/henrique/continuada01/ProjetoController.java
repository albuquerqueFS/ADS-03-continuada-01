package com.henrique.continuada01;

import Abstract.Projeto;
import App.FeedManager;
import App.Mobile;
import App.Web;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    private FeedManager feedManager = new FeedManager();

    @GetMapping("/listar")
    public List<Projeto> listarTodos() {
        return feedManager.exibirTodosOsProjetos();
    }

    @PostMapping("/cadastrar/web")
    public void novoProjetoWeb(@RequestBody Web projeto) {
        feedManager.adicionarProjeto(projeto);
    }

    @PostMapping("/cadastrar/mobile")
    public void novoProjetoMobile(@RequestBody Mobile projeto) {
        feedManager.adicionarProjeto(projeto);
    }

    @GetMapping("/recuperar/{id}")
    public Projeto pegarProjeto(@PathVariable int id) {
        return feedManager.buscarPorId(id);
    }

    @DeleteMapping("/excluir/{id}")
    public void excluirProjeto(@PathVariable int id) {
        feedManager.deletarProjeto(id);
    }

    @PutMapping("/alterar/mobile/{id}")
    public void alterarProjetoMob(@PathVariable int id, @RequestBody Mobile projeto) {
        feedManager.deletarProjeto(id);
        feedManager.adicionarProjetoNoId(id, projeto);
    }

    @PutMapping("/alterar/web/{id}")
    public void alterarProjetoWeb(@PathVariable int id, @RequestBody Web projeto) {
        feedManager.deletarProjeto(id);
        feedManager.adicionarProjetoNoId(id, projeto);
    }
}