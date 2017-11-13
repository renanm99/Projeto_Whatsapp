
package Classes;

import java.util.Date;

public class Mensagem {
    private String emissor;
    private String texto;
    private String status;
    private Date data;

    public Mensagem(String emissor, String texto, Date data) {
        this.emissor = emissor;
        this.texto = texto;
        this.data = data;
        this.status = "Está sendo enviada";
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

    public Date getData() {
        return data;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}

