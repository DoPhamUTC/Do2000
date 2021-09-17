package com.globits;

import com.globits.da.domain.Employee;
import com.globits.da.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.transaction.Transactional;
import java.util.Arrays;

@SpringBootApplication
public class DAApplication implements CommandLineRunner {
	@Autowired
	EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(DAApplication.class, args);
	}

	@Bean
	public ModelMapper mapper(){
		return new ModelMapper();
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
//		Employee employee1 = new Employee("14783-011","Kathryne Cescot", "kcescot0@japanpost.jp", "179-415-0492", 62);
//		Employee employee2 = new Employee( "49999-941", "Nonah Loverock", "nloverockx@spotify.com", "576-288-6225", 52);
//		Employee employee3 = new Employee( "66129-116", "Shawna Atherton", "sathertony@amazon.co.uk", "314-439-7989", 29);
//		Employee employee4 = new Employee( "49035-113", "Freddi Doxsey", "fdoxseyz@stanford.edu", "479-526-2680", 46);
//		Employee employee5 = new Employee( "0245-0039", "Hortense Langrick", "hlangrick10@storify.com", "720-930-6239", 67);
//		Employee employee6 = new Employee( "54868-5839", "Moises McCaster", "mmccaster11@virginia.edu", "847-625-5772", 27);
//		Employee employee7 = new Employee( "49349-854", "Chris Greder", "cgreder12@gov.uk", "970-422-0125", 27);
//		Employee employee8= new Employee( "63629-2688", "Freida Nock", "fnock13@behance.net", "943-366-7210", 43);
//		Employee employee9 = new Employee( "0115-3511", "Allys Meaddowcroft", "ameaddowcroft14@seattletimes.com", "163-988-3924", 30);
//		Employee employee10 = new Employee( "20367-111", "Jarrod Halloway", "jhalloway15@gnu.org", "825-411-9880", 59);
//		Employee employee11 = new Employee( "52125-491", "Athene Vannozzii", "avannozzii16@netvibes.com", "574-477-0460", 43);
//		Employee employee12 = new Employee( "21695-602", "Zabrina Radborn", "zradborn17@scientificamerican.com", "942-812-0084", 32);
//		Employee employee13 = new Employee( "36987-2744", "Raff Bibbie", "rbibbie18@vinaora.com", "439-740-1698", 43);
//		Employee employee14 = new Employee( "45963-125", "Klaus Bromehed", "kbromehed19@scientificamerican.com", "256-258-6261", 51);
//		Employee employee15 = new Employee( "64578-0079", "Nana Corradini", "ncorradini1a@house.gov", "889-824-1865", 28);
//		Employee employee16 = new Employee( "67510-0026", "Junie Cancellieri", "jcancellieri1b@jalbum.net", "528-728-1980", 29);
//		Employee employee17 = new Employee( "63629-4878", "Kerk Sizey", "ksizey1c@senate.gov", "246-260-6460", 24);
//		Employee employee18 = new Employee( "49884-922", "Boy Affron", "baffron1d@google.it", "907-327-0075", 43);
//		employee1.setVoided(false);
//		employeeRepository.saveAll(Arrays.asList(
//				employee1,employee2,employee3,employee4,employee5,employee6,employee8,employee9,employee10,employee11,
//				employee12,employee13,employee14,employee15,employee16,employee17,employee18
//		));
	}
}
