package App;

import Abstract.Projeto;

import java.util.ArrayList;
import java.util.List;

public class FeedManager {
    private List<Projeto> projetoList;

    public FeedManager() {
        projetoList = new ArrayList<>();
    }

    public void adicionarProjeto(Projeto p) {
        this.projetoList.add(p);
    }

    public void adicionarProjetoNoId(int id, Projeto p) {
        this.projetoList.add(id - 1, p);
    }

    public String deletarProjeto(int id) {
        if (id <= this.projetoList.size()) {
            this.projetoList.remove(id - 1);
            return "Projeto excluído!";
        } else {
            return "Não existe um projeto com o id especificado";
        }
    }

    public void alterarProjeto(int id, Projeto p) {
        this.projetoList.remove(id - 1);
        this.projetoList.add(id - 1, p);
    }

    public Projeto buscarPorId(int id) {
        return this.projetoList.get(id - 1);
    }

    public List<Projeto> exibirTodosOsProjetos() {
        return this.projetoList;
    }

    public List<Projeto> listarProjetosWeb() {
        List<Projeto> projWeb = new ArrayList<>();

        this.projetoList.forEach(projeto -> {
            if (projeto instanceof Web) projWeb.add(projeto);
        });

        return projWeb;
    }

    public List<Projeto> listarProjetosMobile() {
        List<Projeto> projMobile = new ArrayList<>();

        this.projetoList.forEach(projeto -> {
            if (projeto instanceof Mobile) projMobile.add(projeto);
        });

        return projMobile;
    }
}
