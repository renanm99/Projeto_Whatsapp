//certo
package Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Conversa implements Serializable {

    private ArrayList<Mensagem> ArrayMensagem = new ArrayList<>();
    private String contato;
    private String data;

    //Metodo que iniciará nova conversa
    public void NovaConversa(String telContato) {
        if (true//conversaexiste()
                ) {
            return;
        }
    }

    public Conversa(String contato) {
        this.contato = contato;
    }

    //Provavel que aqui se iniciará manipulação de arquivo
    //Classe para criar o arquivo da conversa
    public void SalvarConversa(Mensagem mensagem) throws IOException, FileNotFoundException {
        System.out.println("size - " + getArrayMensagem().size());
        ArrayMensagem.add(mensagem);
        ArrayMensagem.add(mensagem);
        ArrayMensagem.add(mensagem);
        ArrayMensagem.add(mensagem);
        System.out.println("size - " + getArrayMensagem().size());
        
        mensagem.setStatus("Enviado");
        File arquivo = new File("contatos/conversas/" + contato + ".txt");
        try {
            FileOutputStream fo = new FileOutputStream(arquivo);
            ObjectOutputStream bos = new ObjectOutputStream(fo);
            bos.writeObject(ArrayMensagem);
            bos.flush();
            bos.close();
        } catch (FileNotFoundException ex) {
            System.out.println("  a" + ex);
        }
        if (!"user".equals(mensagem.getEmissor())) {
            arquivo = new File("contatos/hora/" + contato + ".txt");
            try {
                FileWriter fr = new FileWriter(arquivo);
                fr.write(mensagem.getData());
                fr.flush();
                fr.close();
            } catch (FileNotFoundException ex) {
                System.out.println("  a" + ex);
            }
        }

    }

    public String LerConversa() throws IOException, FileNotFoundException {
        /*
        File arquivo = new File("conversas/" + contato + ".txt");
        String conversa = "";
        try (FileReader fr = new FileReader(arquivo)) {
            int c = fr.read();
            while (c != -1) {
                conversa += (char) c;
                c = fr.read();
            }
            System.out.println(conversa);
            return conversa;
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
         */
        System.out.println(ArrayMensagem);
        return "";

    }

    //Método para buscar uma palavra ou cadeia de palavras dentro
    //dentro da conversa
    public ArrayList<Mensagem> BuscarPalavra(String palavra) {
        ArrayList<Mensagem> Buscas = new ArrayList<>();
        for (Mensagem msgEncontrada : ArrayMensagem) {
            if (msgEncontrada.getTexto().contentEquals(palavra)) {
                Buscas.add(msgEncontrada);
            }
        }
        return Buscas;
    }

    //Retornar a conversa inteira
    //Aqui provavelmente ficará responsável por
    //Trazer toda a respectiva conversa para ser 
    //apresentada no JFrame
    public ArrayList<Mensagem> ConversaCompleta() throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Mensagem> msg = null;
        File arquivo = new File("contatos/conversas/" + contato + ".txt");
        try {
            FileInputStream fo = new FileInputStream(arquivo);
            ObjectInputStream bos = new ObjectInputStream(fo);
            msg = (ArrayList<Mensagem>) bos.readObject();
            for (Mensagem mensagem : msg) {
                System.out.println(mensagem.getTexto());
            }
            fo.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
        return msg;
    }

    public ArrayList<Mensagem> getArrayMensagem() {
        return ArrayMensagem;
    }
}
