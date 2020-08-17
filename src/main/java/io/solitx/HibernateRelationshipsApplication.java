package io.solitx;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HibernateRelationshipsApplication implements CommandLineRunner {

	@Autowired
	private AddressRepo aRep;

	@Autowired
	private PersonRepo pRep;

	public static void main(String[] args) {
		SpringApplication.run(HibernateRelationshipsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		pRep.deleteById(UUID.fromString("d6b01ae5-0299-48ae-a7e3-85e2dfc9ef90"));

	}

	@GetMapping(value = "/p")
	public List<Person> getPersons() {

		return pRep.findAll();
	}

}
