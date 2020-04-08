package PrintCountry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import PrintCountry.PrintCountryWeb;
@RestController
public class PrintCountryController {
    private static final String printCountryChina = "Population is 1.386 Billion";
    private static final String printCountryMexico = "Population is 129.2 Million";
    private static final String printCountryFrance = "Population is 66.99 Million!";
    private static final String printCountryEgypt = "Population of Egypt is 97.55 Million!";
    private static final String printCountrySpain = "Population is 46.94 Million!";
    @GetMapping("/printcountry")
    public String sayCountry(){
        return "The Countries and their capitals are: "
        		+ "China: Beijing, "
        		+ "Mexico: Mexico City, "
        		+ "France: Paris, "
        		+ "Egypt: Cairo, "
        		+ "Spain: Madrid.";
    } 
    
    PrintCountryWeb egypt = new PrintCountryWeb();
    
    
    @GetMapping("/printcountry/egypt/{pop}")
    public PrintCountryWeb printCountryObject(@PathVariable String pop) {
        egypt.setMessage(String.format(printCountryEgypt, pop)); 
        return egypt; 
        }
    
    PrintCountryChina china = new PrintCountryChina();
    
    @GetMapping("/printcountry/china/{pop}")
    public PrintCountryChina printCountryChina(@PathVariable String pop) {
        china.setMessage(String.format(printCountryChina, pop)); 
        return china; 
        }
    
 PrintCountryMexico mexico = new PrintCountryMexico();
    
    
    @GetMapping("/printcountry/mexico/{pop}")
    public PrintCountryMexico printCountryMexico(@PathVariable String pop) {
        mexico.setMessage(String.format(printCountryMexico, pop)); 
        return mexico; 
        }
    
    PrintCountryFrance france = new PrintCountryFrance();
    
    @GetMapping("/printcountry/france/{pop}")
    public PrintCountryFrance printCountryFrance(@PathVariable String pop) {
        france.setMessage(String.format(printCountryFrance, pop)); 
        return france; 
        }

PrintCountrySpain spain = new PrintCountrySpain();
    
    @GetMapping("/printcountry/spain/{pop}")
    public PrintCountrySpain printCountrySpain(@PathVariable String pop) {
        spain.setMessage(String.format(printCountrySpain, pop)); 
        return spain; 
        }
    
      }
      
  
   
     

