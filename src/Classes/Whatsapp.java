package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Whatsapp implements Serializable {

    private ArrayList<Conversa> ArrayConversa = new ArrayList<>();
    private String usuario;
    private String telUsuario;
    private String statusUsuario;
    private String data;

    public DefaultListModel Novaconversa() {
        while (true) {
            String numero = JOptionPane.showInputDialog("Digite o numero do contato");
            if (numero.length() == 9) {
                File arquivo = new File("contatos/contatos.txt");
                try {
                    FileWriter fw = new FileWriter(arquivo, true);
                    fw.write(numero);
                    fw.flush();
                    fw.close();
                    return GetContatos();
                } catch (Exception ex) {
                }
            }
            JOptionPane.showMessageDialog(null, "Digite um valor válido!", "AVISO", 0);
        }
    }

    public DefaultListModel ApagarConversa(String contato) {
        File arquivo = new File("contatos/contatos.txt");
        try {
            FileReader fr = new FileReader(arquivo);
            int c = fr.read();
            String contatos = "";
            while (c != -1) {
                contatos += (char) c;
                c = fr.read();
            }

            contatos = contatos.replaceFirst(contato, "");

            FileWriter fw = new FileWriter(arquivo);
            fw.write(contatos);
            fw.flush();
            fw.close();
        } catch (Exception ex) {
        }
        return GetContatos();
    }

    public DefaultListModel GetContatos() {
        DefaultListModel lista = new DefaultListModel();
        File arquivo = new File("contatos/contatos.txt");
        try {
            FileReader fr = new FileReader(arquivo);
            int c = fr.read();
            int i = 0;
            String numero = "";
            while (c != -1) {
                numero += (char) c;
                if (i == 8) {
                    lista.addElement(numero);
                    numero = "";
                    i = -1;
                }
                i++;
                c = fr.read();
            }
        } catch (Exception ex) {
        }
        return lista;
    }

    public void EnviarMensagem(String emissor, String texto, String data, String contato) throws IOException, FileNotFoundException, ClassNotFoundException {
        Mensagem mensagem = new Mensagem(emissor, texto, data);
        Conversa conversa = new Conversa(contato);
        conversa.SalvarConversa(mensagem);
        ArrayConversa.add(conversa);
    }

    public String VistoPorUltimo(String contato) {
        String hora = "";
        File arquivo = new File("contatos/hora/" + contato + ".txt");
        try {
            FileReader fr = new FileReader(arquivo);
            int c = fr.read();
            while (c != -1) {
                hora += (char) c;
                c = fr.read();
            }
        } catch (Exception ex) {
        }
        return hora;
    }

    public void GravarUsuario(String usuario, String telUsuario, String statusUsuario) {
        File arquivo = new File("contatos/user.txt");
        try {
            FileWriter fw = new FileWriter(arquivo);
            fw.write(usuario);
            fw.write("||");
            fw.write(telUsuario);
            fw.write("||");
            fw.write(statusUsuario);
            fw.flush();
            fw.close();
        } catch (Exception ex) {
        }
    }

    public String RetornarUsuario() {
        String usertxt = "";
        File arquivo = new File("contatos/user.txt");
        if (!arquivo.exists()) {
            String nome = setUsuario();
            if (nome.length() < 1) {
                nome = "user";
            }
            
            String status = setStatusUsuario();
            if (status.length() < 1) {
                status = "Hey there! I'm using WhatsApp";
            }

            String stel = "";
            while (true) {
                try {
                    int tel = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
                    stel = String.valueOf(tel);
                    if (stel.length() == 9) {
                        telUsuario = stel;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "DIGITE UM VALOR VÁLIDO");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "DIGITE UM VALOR VÁLIDO");
                }
            }

            GravarUsuario(nome, stel, status);
            usertxt = nome + "||" + stel + "||" + status;
            return usertxt;
        } else {
            try {
                FileReader fr = new FileReader(arquivo);
                int c = fr.read();
                while (c != -1) {
                    usertxt += (char) c;
                    c = fr.read();
                }

            } catch (Exception ex) {
            }
            return usertxt;
        }
    }

    public String setUsuario() {
        this.usuario = JOptionPane.showInputDialog("Digite um nome: ");
        return getUsuario();
    }

    public String setTelUsuario() {
        this.telUsuario = JOptionPane.showInputDialog("Digite o novo número: ");
        return getTelUsuario();
    }

    public String setStatusUsuario() {
        this.statusUsuario = JOptionPane.showInputDialog("Digite um status: ");
        return getStatusUsuario();
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setTelUsuario(String telUsuario) {
        this.telUsuario = telUsuario;
    }

    public void setStatusUsuario(String statusUsuario) {
        this.statusUsuario = statusUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getTelUsuario() {
        return telUsuario;
    }

    public String getStatusUsuario() {
        return statusUsuario;
    }

}
