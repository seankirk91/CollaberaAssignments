package PrintCountry;


import org.springframework.stereotype.Component;
@Component
public class PrintCountryWeb {
private String message;
    public String getMessage() {
    return message;
    }
    public void setMessage(String message) {
    this.message = message;
    }
}