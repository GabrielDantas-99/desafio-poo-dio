package domain;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<Conteudo>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<Conteudo>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        // this.conteudosInscritos.addAll(bootcamp.getConteudos());
        // bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        if (!conteudosInscritos.isEmpty()) {
            Conteudo conteudo = conteudosInscritos.iterator().next();
            conteudosConcluidos.add(conteudo);
            conteudosInscritos.remove(conteudo);
        } else {
            System.out.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public void calcularTotalXp() {
        conteudosConcluidos.stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
        result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudosInscritos == null) {
            if (other.conteudosInscritos != null)
                return false;
        } else if (!conteudosInscritos.equals(other.conteudosInscritos))
            return false;
        if (conteudosConcluidos == null) {
            if (other.conteudosConcluidos != null)
                return false;
        } else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
            return false;
        return true;
    }

}
