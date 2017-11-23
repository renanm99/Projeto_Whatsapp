

package Classes;

public class Mensagem {
    private String emissor;
    private String texto;
    private String status;
    private String data;
    private String remetente;

    public Mensagem(String emissor, String texto, String data, String remetente){
        this.emissor = emissor;
        this.texto = texto;
        this.data = data;
        this.remetente = remetente;
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
    
    public String getRemetente() {
        return remetente;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String teste() {
        return "emissor=" + emissor + ", texto=" + texto + ", status=" + status + ", data=" + data + ", remetente=" + remetente;
    }
    
}

