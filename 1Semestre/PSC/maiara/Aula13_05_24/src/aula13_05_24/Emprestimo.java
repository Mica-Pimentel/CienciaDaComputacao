/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13_05_24;

/**
 *
 * @author micael
 */
class Emprestimo {

    private Usuario usuario;
    private ItemBlibioteca item;

    public Emprestimo(Usuario usuario, ItemBlibioteca item) {
        this.usuario = usuario;
        this.item = item;
    }

    public void emprestarItem() {
        if (item.isDisponivel()) {
            item.setDisponivel(false);
            System.out.println("O item '" + item.getTitulo() + "' foi emprestado para " + usuario.getNome());
        } else {
            System.out.println("O item '" + item.getTitulo() + "' n?o está disponível no momento.");
        }
    }

    public void devolverItem() {
        if (!item.isDisponivel()) {
            item.setDisponivel(true);
            System.out.println("O item '" + item.getTitulo() + "' foi devolvido por " + usuario.getNome());
        } else {
            System.out.println("O item '" + item.getTitulo() + "' já está disponível.");
        }
    }
}
