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

    //    Listar todos os projetos cadastrados
    @GetMapping("/listar")
    public List<Projeto> listarTodos() {
        return feedManager.exibirTodosOsProjetos();
    }

    //    Listar somente os projetos mobile
    @GetMapping("/listar/mobile")
    public List<Projeto> listarProjetosMobile() {
        return feedManager.listarProjetosMobile();
    }

    //    Listar somente os projetos web
    @GetMapping("/listar/web")
    public List<Projeto> listarProjetosWeb() {
        return feedManager.listarProjetosWeb();
    }

    //    Recuperar um projeto com determinado ID
    @GetMapping("/recuperar/{id}")
    public Projeto pegarProjeto(@PathVariable int id) {
        return feedManager.buscarPorId(id);
    }

    //    Cadastrar projeto web
    @PostMapping("/cadastrar/web")
    public void novoProjetoWeb(@RequestBody Web projeto) {
        feedManager.adicionarProjeto(projeto);
    }

    //    Cadastrar projeto mobile
    @PostMapping("/cadastrar/mobile")
    public void novoProjetoMobile(@RequestBody Mobile projeto) {
        feedManager.adicionarProjeto(projeto);
    }

    //    Excluir projeto
    @DeleteMapping("/excluir/{id}")
    public void excluirProjeto(@PathVariable int id) {
        feedManager.deletarProjeto(id);
    }

    //    Atualizar projeto mobile
    @PutMapping("/alterar/mobile/{id}")
    public void alterarProjetoMob(@PathVariable int id, @RequestBody Mobile projeto) {
        feedManager.deletarProjeto(id);
        feedManager.adicionarProjetoNoId(id, projeto);
    }

    //    Atualizar projeto mobile
    @PutMapping("/alterar/web/{id}")
    public void alterarProjetoWeb(@PathVariable int id, @RequestBody Web projeto) {
        feedManager.deletarProjeto(id);
        feedManager.adicionarProjetoNoId(id, projeto);
    }
}