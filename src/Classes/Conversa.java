//certo

package Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conversa {

    public ArrayList<Mensagem> ArrayMensagem = new ArrayList<>();
    private String contato;
    private String data;

    //Construtor de Conversa
    public Conversa(String contato, String data) {
        this.contato = contato;
        this.data = data;
    }

    //Metodo que iniciará nova conversa
    //Provavel que aqui se iniciará manipulação de arquivo
    //Classe para criar o arquivo da conversa
    public void SalvarConversa(Mensagem mensagem) throws IOException, FileNotFoundException {
        
        File arquivo = new File("conversas/" + contato + ".txt");
        try (FileOutputStream fo = new FileOutputStream(arquivo, true)) {
            ObjectOutputStream bos = new ObjectOutputStream(fo);
            bos.writeObject(mensagem);
            bos.flush();
            bos.close();
        } catch (FileNotFoundException ex) {
            System.out.println("  a"+ex);
        }
        System.out.println("");
        mensagem.setStatus("Enviado");
        ArrayList<Mensagem> ArrayMensagem = new ArrayList<>();
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
    public String ConversaCompleta() throws IOException, FileNotFoundException, ClassNotFoundException {
        File arquivo = new File("conversas/" + contato + ".txt");
        try (FileInputStream fo = new FileInputStream(arquivo)) {
            try (ObjectInputStream bos = new ObjectInputStream(fo)) {
                Mensagem msg = (Mensagem) bos.readObject();
                System.out.println(msg.getTexto());
            }
            fo.close();
        } catch (FileNotFoundException ex) {
            
        }
        return "";
    }

}
