package Classes;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Whatsapp implements Serializable {
    private ArrayList<Conversa> conversa = new ArrayList<>();
    private String usuario;
    private String telUsuario;
    private String statusUsuario;
    private String data;

    public boolean conversaExiste(){
        return true;
    }
    
    public void EnviarMensagem(String emissor, String texto, String data, String contato) throws IOException{
        Mensagem mensagem = new Mensagem(emissor, texto, data);
        Conversa conversa = new Conversa(contato);
        conversa.SalvarConversa(mensagem);
        
    }

}
