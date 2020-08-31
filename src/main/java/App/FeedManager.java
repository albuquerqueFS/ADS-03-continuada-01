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

    public void deletarProjeto(int id) {
        this.projetoList.remove(id - 1);
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
}
