<<<<<<< HEAD


package Classes;

=======
package Classes;

import java.util.Date;

>>>>>>> fabf7585e316617c1dbf5a4b944de8d0de568abc
public class Mensagem {
    private String emissor;
    private String texto;
    private String status;
<<<<<<< HEAD
    private String data;
    private String remetente;

    public Mensagem(String emissor, String texto, String data, String remetente){
        this.emissor = emissor;
        this.texto = texto;
        this.data = data;
        this.remetente = remetente;
        setStatus("Está sendo enviada");
=======
    private Date data;
    /*
    import java.text.SimpleDateFormat;
    import java.util.Calendar;
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    System.out.println( sdf.format(cal.getTime()) );
    */

    public Mensagem(String emissor, String texto, Date data) {
        this.emissor = emissor;
        this.texto = texto;
        this.data = data.getTime();
        this.status = setStatus("Está sendo enviada");
>>>>>>> fabf7585e316617c1dbf5a4b944de8d0de568abc
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

<<<<<<< HEAD
    public String getData() {
        return data;
    }
    
    public String getRemetente() {
        return remetente;
    }
=======
    public Date getData() {
        return data;
    }
>>>>>>> fabf7585e316617c1dbf5a4b944de8d0de568abc

    public void setStatus(String status) {
        this.status = status;
    }
    
<<<<<<< HEAD
    public String teste() {
        return "emissor=" + emissor + ", texto=" + texto + ", status=" + status + ", data=" + data + ", remetente=" + remetente;
    }
    
=======
>>>>>>> fabf7585e316617c1dbf5a4b944de8d0de568abc
}

