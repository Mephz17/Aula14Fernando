package listacomcabeça;

class No {
    String valor;
    No proximo;

    public No(String valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class ListaCircularComCabeca {
    No cabeca;

    public ListaCircularComCabeca() {
        cabeca = new No("cabeca");
        cabeca.proximo = cabeca;
    }

    public boolean estaVazia() {
        return cabeca.proximo == cabeca;
    }

    public void inserir(String valor) {
        No novoNo = new No(valor);
        No atual = cabeca;

        while (atual.proximo != cabeca) {
            atual = atual.proximo;
        }

        novoNo.proximo = cabeca;
        atual.proximo = novoNo;
    }

    public boolean inserirDepois(String valorExistente, String novoValor) {
        if (estaVazia()) {
            System.out.println("A lista está vazia." + valorExistente);
            return false;
        }

        No atual = cabeca.proximo;
        boolean encontrado = false;

        do {
            if (atual.valor.equals(valorExistente)) {
                encontrado = true;
                break;
            }
            atual = atual.proximo;
        } while (atual != cabeca);

        if (encontrado) {
            No novoNo = new No(novoValor);
            novoNo.proximo = atual.proximo;
            atual.proximo = novoNo;
            return true;
        } else {
            System.out.println("Nó com valor " + valorExistente + " não encontrado.");
            return false;
        }
    }

    public boolean remover(String valor) {
        if (estaVazia()) {
            System.out.println("A lista esta vazia, não ha o que remover.");
            return false;
        }

        No atual = cabeca.proximo;
        No anterior = cabeca;

        do {
            if (atual.valor.equals(valor)) {
                anterior.proximo = atual.proximo;
                System.out.println("Elemento " + valor + " removido.");
                return true;
            }
            anterior = atual;
            atual = atual.proximo;
        } while (atual != cabeca);

        System.out.println("Elemento " + valor + " não encontrado para remoção.");
        return false;
    }

    public boolean buscar(String valor) {
        if (estaVazia()) {
            return false;
        }

        No atual = cabeca.proximo;

        do {
            if (atual.valor.equals(valor)) {
                return true;
            }
            atual = atual.proximo;
        } while (atual != cabeca);

        return false;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Lista: [Vazia]");
            return;
        }

        No atual = cabeca.proximo;
        StringBuilder sb = new StringBuilder("Lista: [ccabeca]");

        do {
            sb.append(atual.valor);
            atual = atual.proximo;
            if (atual != cabeca) {
                sb.append("->");
            }
        } while (atual != cabeca);

        sb.append("[cabeca]");
        System.out.println(sb.toString());
    }
}
