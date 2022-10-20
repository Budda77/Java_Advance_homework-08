package ua.homework.main;

import ua.homework.domain.Magazine;
import ua.homework.domain.User;
import ua.homework.service.MagazineService;
import ua.homework.service.UserService;
import ua.homework.sevice.impl.MagazineServiceImpl;
import ua.homework.sevice.impl.UserServiceImpl;

public class MainApplication {

	public static void main(String[] args) {

		UserService userService = new UserServiceImpl();
		
		// Create table
		userService.create(new User("admin@com.ua", "first Admin", "last Admin", "admin"));
		userService.create(new User("johnson@com.ua", "Dwayne", "Johnson", "client"));
		userService.create(new User("ajlo@com.ua", "Jennifer", "Lopez", "vip"));
		userService.create(new User("lively@com.ua", "Blake", "Lively", "client"));
		userService.create(new User("rodrigo@com.ua", "Olivia", "Rodrigo", "client"));
		userService.create(new User("alia@com.ua", "Alia", "Bhatt", "client"));
		userService.create(new User("rashmika@com.ua", "Rashmika", "Mandanna", "client"));
		userService.create(new User("khan@com.ua", "Salman", "Khan", "client"));
		userService.create(new User("grant@com.ua", "Cary", "Grant", "client"));
		userService.create(new User("james@com.ua", "James", "Stewart", "client"));
		userService.create(new User("bergman@com.ua", "Ingrid", "Bergman", "vip"));
		userService.create(new User("astaire@com.ua", "Fred", "Astaire", "client"));
		userService.create(new User("marilyn@com.ua", "Marilyn", "Monroe", "client"));
		userService.create(new User("fonda@com.ua", "Henry", "Fonda", "client"));
		userService.create(new User("gable@com.ua", "Clark", "Gable", "vip"));
		userService.create(new User("elizabeth@com.ua", "Elizabeth", "Taylor", "vip"));
		
		// Read All
		userService.readAll().stream().forEach(System.out::println);
		
		// Read by ID
		System.out.println(userService.read(10));
		
		// Delete by ID
		userService.delete(17);
		
		// Update
 		userService.update( new User(19,"gary@com.ua", "Gary", "Cooper", "vip"));
 		
 		// Read All
 		userService.readAll().stream().forEach(System.out::println);
		
 		
		MagazineService magazineService = new MagazineServiceImpl();
		// Create table
		magazineService.create(new Magazine("EatingWell", "cooking", 105.40));
		magazineService.create(new Magazine("Food Network", "cooking", 98.50));
		magazineService.create(new Magazine("Food & Wine at Amazon", "cooking", 100.50));
		magazineService.create(new Magazine("FCherry Bombe at Cherry Bombe", "cooking", 123.80));
		magazineService.create(new Magazine("Milk Street at Amazon", "cooking", 84.90));
		magazineService.create(new Magazine("Golf Digest", "sport", 107.20));
		magazineService.create(new Magazine("Sports Illustrated", "sport", 104.50));
		magazineService.create(new Magazine("The Red Bulletin", "sport", 141.20));
		magazineService.create(new Magazine("Baseball America", "sport", 124.30));
		magazineService.create(new Magazine("Backcountry", "sport", 136.60));	
		magazineService.create(new Magazine("Financial Times", "finance", 140.50));
		magazineService.create(new Magazine("The Wall Street Journal", "finance", 112.00));
		magazineService.create(new Magazine("The Economist", "finance", 100.60));
		magazineService.create(new Magazine("Forbes", "finance", 110.90));
		magazineService.create(new Magazine("Money Magazine", "finance", 150.63));
		magazineService.create(new Magazine("The New Yorker", "political", 130.30));
		magazineService.create(new Magazine("The Week", "political", 150.80));
		magazineService.create(new Magazine("National Review", "political", 1150.00));
		magazineService.create(new Magazine("Reason", "political", 125.90));
		magazineService.create(new Magazine("The Nation", "political", 103.00));	
		magazineService.create(new Magazine("Essence", "culture", 105.00));
		magazineService.create(new Magazine("Life Extension", "culture", 127.00));
		magazineService.create(new Magazine("Town & Country", "culture", 164.00));
		magazineService.create(new Magazine("International Living", "culture", 121.00));
		
		// Read All
		magazineService.readAll().stream().forEach(System.out::println);
		
		// Read by ID
		System.out.println(magazineService.read(1));
		
		// Update
		magazineService.update(new Magazine(24,"Saturday Evening Post", "culture", 133.33));
		
		// Delete by ID
		magazineService.delete(23);
		
		// Read All
		magazineService.readAll().stream().forEach(System.out::println);
		
	}

}
