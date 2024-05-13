package agenda;

public class Agenda {

    private static final int MAX_CONTATOS = 100;
    private final Contato[] contatos;
    private int numContatos;

    public static void main(String[] args) {
        // Criando uma agenda
        Agenda minhaAgenda = new Agenda();

        // Adicionando alguns contatos
        minhaAgenda.adicionarContato(new Contato("Jo?o", "123456789"));
        minhaAgenda.adicionarContato(new Contato("Maria", "987654321"));
        minhaAgenda.adicionarContato(new Contato("Carlos", "456789123"));

        // Listando os contatos
        minhaAgenda.listarContatos();

        //Buscando um contato
        Contato contato = minhaAgenda.buscarContato("Maria");
        if (contato != null) {
            System.out.println("Contato encontrado: " + contato);
        } else {
            System.out.println("Contato n?o encontrado.");
        }

        // Editando um contato
        minhaAgenda.editarContato("Carlos", "Carlos Silva", "999999999");

        // Listando os contatos após a ediç?o
        minhaAgenda.listarContatos();

        // Removendo um contato
        minhaAgenda.removerContato("Jo?o");

        // Listando os contatos após a remoç?o
        minhaAgenda.listarContatos();
    }

    public Agenda() {
        contatos = new Contato[MAX_CONTATOS];
        numContatos = 0;
    }

    public void adicionarContato(Contato contato) {
        if (numContatos < MAX_CONTATOS) {
            contatos[numContatos] = contato;
            numContatos++;
            System.out.println("Contato adicionado com sucesso.");
        } else {
            System.out.println("A agenda está cheia. N?o é possível adicionar mais contatos.");
        }
    }

    public void removerContato(String nome) {
        boolean encontrado = false;
        for (int i = 0; i < numContatos; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                contatos[i] = contatos[numContatos - 1];
                contatos[numContatos - 1] = null;
                numContatos--;
                encontrado = true;
                System.out.println("Contato removido com sucesso.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contato n?o encontrado.");
        }
    }

    public void listarContatos() {
        if (numContatos == 0) {
            System.out.println("A agenda está vazia.");
        } else {
            System.out.println("Lista de contatos:");
            for (int i = 0; i < numContatos; i++) {
                System.out.println((i + 1) + ". " + contatos[i]);
            }
        }
    }

    public Contato buscarContato(String nome) {
        for (int i = 0; i < numContatos; i++) {
            Contato contato = contatos[i];
            if (contato != null && contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    // Método para editar um contato na agenda
    public void editarContato(String nome, String novoNome, String novoTelefone) {
        Contato contato = buscarContato(nome);
        if (contato != null) {
            contato.setNome(novoNome);
            contato.setNumero(novoTelefone);
            System.out.println("Contato editado com sucesso.");
        } else {
            System.out.println("Contato n?o encontrado.");
        }

    }

}
