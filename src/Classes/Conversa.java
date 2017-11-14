/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author renan
 */
public class Conversa {
    private ArrayList<Mensagem> mensagem = new ArrayList<>();
    private String contato;
    private Date data;

    public Conversa(String contato, Date data) {
        this.contato = contato;
        this.data = data;
    }
    
    public Mensagem NovaConversa(String autor, String texto){
        return new Mensagem(autor, texto, data);
    }
    
    public ArrayList<Mensagem> BuscarPalavra(String palavra){
        ArrayList<Mensagem> Buscas = new ArrayList<>();
        for (Mensagem msgEncontrada : mensagem) {
            if(msgEncontrada.getTexto().contentEquals(palavra)){
                Buscas.add(msgEncontrada);
            }
        }
        return Buscas;
    }
    
    public ArrayList<Mensagem> ConversaCompleta(){
        return mensagem;
    }
    
    
}
