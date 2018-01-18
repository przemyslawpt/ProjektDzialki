package pl.ptaszek.opole.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.ptaszek.opole.model.Adres;
import pl.ptaszek.opole.service.AdresService;

public class DzialkiApp {

	public static void main(String[] args) {
		      AnnotationConfigApplicationContext context = 
		            new AnnotationConfigApplicationContext(DzialkiConfig.class);
		      AdresService adresService = context.getBean(AdresService.class);
		      Adres adres = new Adres();
		      adres.setKodPocztowy("46-036");
		      adres.setMiejscowosc("Pokoj");
		      adres.setNumberLokalu("10");
		      adresService.save(adres);
		      Adres adres2 = new Adres();
		      adres.setKodPocztowy("46-037");
		      adres.setMiejscowosc("TFX");
		      adres.setNumberLokalu("10");
		      adresService.save(adres);
		      Adres adres3 = new Adres();
		      adres.setKodPocztowy("66-022");
		      adres.setMiejscowosc("FlorChris");
		      adres.setNumberLokalu("10");
		      adresService.save(adres);
		      adresService.save(adres2);
		      adresService.save(adres3);
//		      UserService userService = context.getBean(UserService.class);
//
//		      // Add Users
//		      userService.add(new User("Sunil", "Bora", "suni.bora@example.com"));
//		      userService.add(new User("David", "Miller", "david.miller@example.com"));
//		      userService.add(new User("Sameer", "Singh", "sameer.singh@example.com"));
//		      userService.add(new User("Paul", "Smith", "paul.smith@example.com"));
//
//		      // Get Users
//		      List<User> users = userService.listUsers();
//		      for (User user : users) {
//		         System.out.println("Id = "+user.getId());
//		         System.out.println("First Name = "+user.getFirstName());
//		         System.out.println("Last Name = "+user.getLastName());
//		         System.out.println("Email = "+user.getEmail());
//		         System.out.println();
//		      }
//
//		      context.close();
//		   }
		      
		      
		}
}