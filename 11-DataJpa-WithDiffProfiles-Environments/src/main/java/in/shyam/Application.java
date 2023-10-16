package in.shyam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shyam.entity.DaysHotel;
import in.shyam.entity.DaysHotelCPK;
import in.shyam.repository.DaysHotelRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		DaysHotelRepo repo = ctx.getBean(DaysHotelRepo.class);
		
		DaysHotelCPK dcpk = new DaysHotelCPK();
		dcpk.setItemId(1000);
		dcpk.setItemName("IceCream with GulabJamun");
		
		DaysHotel d = new DaysHotel();
		d.setItemPrice(450.00);
		d.setItemQuantity(2);
		d.setTotalPrice(d.getItemPrice() * d.getItemQuantity());
		d.setDaysHotelCpk(dcpk);
		
		repo.save(d);
	}

}
