package Classes;

import java.io.Serializable;

public class Mensagem implements Serializable {

    private String emissor;
    private String texto;
    private String status;
    private String data;

    public Mensagem(String emissor, String texto, String data) {
        this.emissor = emissor;
        this.texto = texto;
        this.data = data;
        setStatus("Está sendo enviada");
    }

    public String getEmissor() {
        return emissor;
    }

    public String getTexto() {
        return texto;
    }

    public String getStatus() {
        return status;
    }

    public String getData() {
        return data;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String teste() {
        return "emissor=" + emissor + ", texto=" + texto + ", status=" + status + ", data=" + data;
    }

}
