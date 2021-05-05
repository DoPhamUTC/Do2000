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
	OutBillRepository outBillRepository;

	@Autowired
	ProductRepository productRepository;

	@Autowired
	DetaiOutBillRepository detaiOutBillRepository;
	@Override
	public void run(String... args) throws Exception {
		Product product1 = new Product(100000);
		Product product2 = new Product(75000);
		Product product3  = new Product(90000);

		OutBill outBill1 = new OutBill("ok",10);
		OutBill outBill2 = new OutBill("finished",3);

		DetailOutBill detailOutBill = new DetailOutBill();
		detailOutBill.setOutBill(outBill1);
		detailOutBill.setProduct(product1);
		detailOutBill.setAmount(product1.getAmount());
		product1.getDetailOutBills().add(detailOutBill);

		DetailOutBill detailOutBill2 = new DetailOutBill();
		detailOutBill.setOutBill(outBill2);
		detailOutBill.setProduct(product1);
		detailOutBill.setAmount(product1.getAmount());
		product1.getDetailOutBills().add(detailOutBill2);

		DetailOutBill detailOutBill3 = new DetailOutBill();
		detailOutBill.setOutBill(outBill2);
		detailOutBill.setProduct(product2);
		detailOutBill.setAmount(product2.getAmount());
		product1.getDetailOutBills().add(detailOutBill3);

		outBillRepository.save(outBill1);
		outBillRepository.save(outBill2);

		productRepository.save(product1);
		productRepository.save(product2);

		detaiOutBillRepository.save(detailOutBill);
		detaiOutBillRepository.save(detailOutBill2);
		detaiOutBillRepository.save(detailOutBill3);

	}
}
