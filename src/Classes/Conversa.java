package Classes;

import java.util.ArrayList;
import java.util.Date;


public class Conversa {
    private ArrayList<Mensagem> mensagem = new ArrayList<>();
    private String contato;
    private Date data;

    //Construtor de Conversa
    public Conversa(String contato, Date data) {
        this.contato = contato;
        this.data = data;
    }
    
    //Metodo que iniciará nova conversa
    //Provavel que aqui se iniciará manipulação de arquivo
    //Classe para criar o arquivo da conversa
    public Mensagem NovaConversa(String autor, String texto){
        return new Mensagem(autor, texto, data);
    }

    //Método para buscar uma palavra ou cadeia de palavras dentro
    //dentro da conversa
    public ArrayList<Mensagem> BuscarPalavra(String palavra){
        ArrayList<Mensagem> Buscas = new ArrayList<>();
        for (Mensagem msgEncontrada : mensagem) {
            if(msgEncontrada.getTexto().contentEquals(palavra)){
                Buscas.add(msgEncontrada);
            }
        }
        return Buscas;
    }
    
    //Retornar a conversa inteira
    //Aqui provavelmente ficará responsável por
    //Trazer toda a respectiva conversa para ser 
    //apresentada no JFrame
    public ArrayList<Mensagem> ConversaCompleta(){
        return mensagem;
    }
    
    
}
