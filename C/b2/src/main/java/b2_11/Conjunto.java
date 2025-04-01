import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

public class Conjunto {
    Set<Conteudo> content = new HashSet<>();

    public boolean add(Object v) {
        return content.add(new Conteudo(v)); // Retorna o valor do add() do HashSet
    }
    // Operação de união (união de dois conjuntos)
    public Conjunto union(Conjunto outroConjunto) {
        Conjunto resultado = new Conjunto();
        resultado.content.addAll(this.content);
        resultado.content.addAll(outroConjunto.content);
        return resultado;
    }

    // Operação de interseção (interseção de dois conjuntos)
    public Conjunto intersection(Conjunto outroConjunto) {
        Conjunto resultado = new Conjunto();
        for (Conteudo conteudo : this.content) {
            if (outroConjunto.content.contains(conteudo)) {
                resultado.add(conteudo.getValue());
            }
        }
        return resultado;
    }

    // Operação de diferença (diferenca entre dois conjuntos)
    public Conjunto difference(Conjunto outroConjunto) {
        Conjunto resultado = new Conjunto();
        for (Conteudo conteudo : this.content) {
            if (!outroConjunto.content.contains(conteudo)) {
                resultado.add(conteudo.getValue());
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{ ");
        for (Conteudo c : content) {
            sb.append(c.toString()).append(", ");
        }
        sb.append("}");
        return sb.toString();
    }
}

class Conteudo{
    private Object value;
    private boolean isInt = false;

    Conteudo(Object value) {
        this.value = value;
        try {
            // Usa parseInt para verificar se é um número
            Integer.parseInt(value.toString());
            isInt = true;
        } catch (NumberFormatException e) {
            isInt = false;
        }
    }

    public Object getValue() {
        return value;
    }

    public boolean isInt() {
        return isInt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conteudo conteudo = (Conteudo) o;
        return Objects.equals(value, conteudo.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return value.toString();
    }

}