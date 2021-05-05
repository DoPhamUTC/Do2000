package com.example.demoManyToMany;
import com.example.demoManyToMany.entity.DetailOutBill;
import com.example.demoManyToMany.entity.OutBill;
import com.example.demoManyToMany.entity.OutBill_ProductKey;
import com.example.demoManyToMany.entity.Product;
import com.example.demoManyToMany.repository.DetaiOutBillRepository;
import com.example.demoManyToMany.repository.OutBillRepository;
import com.example.demoManyToMany.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoManyToManyApplication implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(DemoManyToManyApplication.class, args);
	}

	@Autowired
	DetaiOutBillRepository detaiOutBillRepository;
	@Override
	public void run(String... args) throws Exception {
		Product product1 = new Product(100000);
		Product product2 = new Product(75000);
		Product product3  = new Product(90000);

		OutBill outBill1 = new OutBill("ok",10);
		OutBill outBill2 = new OutBill("finished",3);

		DetailOutBill detailOutBill1 = new DetailOutBill(outBill1,product1);
		DetailOutBill detailOutBill2 = new DetailOutBill(outBill2,product3);
        detaiOutBillRepository.save(detailOutBill1);
		detaiOutBillRepository.save(detailOutBill2);
	}
}
