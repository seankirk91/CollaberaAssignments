package PrintCountry;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import PrintCountry.PrintCountryWeb;
@RestController
public class PrintCountryObject {
    @Autowired
    PrintCountryWeb printCountryWeb;
	//private PrintCountryWeb PrintCountryWeb;
    
    /* @GetMapping("/printcountry")
    public PrintCountryWeb printCountryWeb() {
       printCountryWeb.setMessage("Give the country app a country!");
        return printCountryWeb;
    } */
    
    
}