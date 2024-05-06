package agenda;

import java.util.Map;
import java.util.HashMap;

public class Agenda {

    private Map< Integer, Contato> contatos;

    public Agenda() {
        this.contatos = new HashMap<>();
    }

    public void adicionarContatos(String nome_, int numero) {
        contatos.put(numero, new Contato(nome_, numero));
    }

    public static void main(String[] args) {
      
    }

  

}
