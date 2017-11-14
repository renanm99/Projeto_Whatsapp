package Main;

import Classes.Conversa;
import java.util.Date;

public class AppWhatsApp {
    public static void main(String[] args) {
        Date data = new Date();
        Conversa cv = new Conversa("eu", data);
        cv.NovaConversa("eu", "aaaa");
    }
}
