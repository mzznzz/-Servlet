package ch08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {
	Map<String, Product> products = new HashMap<>();
	
	public ProductService() {
		/*
		 * Product p = new Product("101","애플사과폰 12","애플전자",1200000,"2020.12.12");
		 * products.put("101", p); p = new
		 * Product("102","삼전우주폰 21","삼전전자",1300000,"2021.2.2"); products.put("102", p);
		 * p = new Product("103","엘스듀얼폰","엘스전자",1500000,"2021.3.2"); products.put("103",
		 * p);
		 */
		
		
		//객체 배열의 선언과 동시에 할당
		//인덱스를 이용한 초기화(5명을 보관할 수 있는 객체 배열 선언)
		Product[] p = new Product[5];
		
		p[0] = new Product("101","애플사과폰 12","애플전자",1200000,"2020.12.12");
		p[1] = new Product("102","삼전우주폰 21","삼전전자",1300000,"2021.2.2");		
		p[2] = new Product("103","엘스듀얼폰","엘스전자",1500000,"2021.3.2");	
		p[3] = new Product("104","민지폰 21","애플전자",1800000,"2021.2.10");	
		p[4] = new Product("105","민지옛날폰 21","애플전자",1300000,"2018.2.2");	
		
		//각 개체의 멤버에 접근 이름을 products.put로 추가하여서 출력
		for (int i = 0; i < p.length; i++) {
			products.put(p[i].getId(),p[i]);
		}
	}
	
	public List<Product> findAll() {
		return new ArrayList<>(products.values());
	}
	
	public Product find(String id) {
		return products.get(id);
	}
}
