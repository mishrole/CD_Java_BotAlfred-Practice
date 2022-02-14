import java.util.Date;
import java.text.SimpleDateFormat;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿Cómo estás?";
    }
    
    public String guestGreeting(String name) {
        String message = String.format("Hola, %s. Encantado de verte", name);
        return message;
    }

    public String guestGreeting(String name, String dayPeriod) {
        String message = "";

        if (dayPeriod == "mañana") {
            message = String.format("Buenos días, %s. Encantado de verte.", name);
        } else if (dayPeriod == "tarde") {
            message = String.format("Buenas tardes, %s. Encantado de verte.", name);
        } else if (dayPeriod == "noche") {
            message = String.format("Buenas noches, %s. Encantado de verte.", name);
        }

        return message;
    }

    public String guestGreeting() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("k");
        Integer formatted = Integer.parseInt(formatter.format(date));

        String message = "";

        if (formatted >= 4 && formatted < 12) {
            message = "Buenas tardes. Encantado de verte.";
        } else if (formatted >= 12 && formatted < 18) {
            message = "Buenas tardes. Encantado de verte.";
        } else if (formatted >= 18 && formatted < 4) {
            message = "Buenas noches. Encantado de verte.";
        }

        return message;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        String message = "Actualmente es " + date;
        return message;
    }
    
    public String respondBeforeAlexis(String conversation) {
        String message = "";
        
        if (conversation.indexOf("Alexis") >= 0) {
            message = "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso";
        } else if (conversation.indexOf("Alfred") >= 0) {
            message = "A su servicio. Como see, naturalmente";
        } else if (conversation.indexOf("enojado") >= 0) {
            message = "AAAAAAAAAAAAAAAAAAAAAAAAAAH";
        } else {
            message = "Bien. Y con eso, me retiraré";
        }

        return message;
    }

}
