package PrintCountry;

import org.springframework.stereotype.Component;

@Component
public class PrintCountryFrance {
	private String message;
    public String getMessage() {
    return message;
    }
    public void setMessage(String message) {
    this.message = message;
    }

}
