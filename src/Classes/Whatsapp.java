package Classes;

import java.util.ArrayList;
import java.util.Date;

public class Whatsapp {
    private ArrayList<Conversa> conversa = new ArrayList<>();
    private String usuario;
    private String telUsuario;
    private String statusUsuario;
    private Date data;
    
    public void NovaConversa(String telContato){
        if(conversaExiste()){
            return;
        }
    }

    public boolean conversaExiste(){
        return true;
    }

    //Possivelmente virá de Mensagem.java para dps gravar em Conversa.java
    //Eu to achando ne...
    public void EnviarMensagem(String telContato, String texto){
        //????
        ReceberMensagem();
    }

    //Enviar para o JFrame
    public void ReceberMensagem(String telContato, String texto){

    }

    /*
    Métodos para mandar e receber mensagem. Recebe a String com o telefone do contato e o
    texto. No caso da aplicação simulada, o método de mandar mensagem deve chamar o de
    receber mensagem, que se encarrega de chamar os métodos para adicionar a mensagem na
    conversa.
    */



}