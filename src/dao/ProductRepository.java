package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();
	
	public static ProductRepository getInstance() {
		return instance;
	}
	
	public ProductRepository() {
		Product outer = new Product("P1234", "엘렌 jk", 59000);
		outer.setDescription("데일리하게 입기 좋은 캐주얼 아이템");
		outer.setCategory("Outer");
		outer.setManufacturer("Ellen");
		outer.setUnitsInStock(1000);
		outer.setCondition("New");
		outer.setFilename("P1234.jpg");
		
		Product dress = new Product("P1235", "벨리 플라워 ops", 48000);
		dress.setDescription("빈티지한 플라워 패턴과 색감의 포인트 원피스");
		dress.setCategory("Dress");
		dress.setManufacturer("Ellen");
		dress.setUnitsInStock(1000);
		dress.setCondition("New");
		dress.setFilename("P1235.jpg");
		
		Product pants = new Product("P1236", "포지티브 ash denim", 28500);
		pants.setDescription("깔끔한 스트레이트핏에 데일리한 색감의 팬츠");
		pants.setCategory("Pants");
		pants.setManufacturer("Ellen");
		pants.setUnitsInStock(1000);
		pants.setCondition("New");
		pants.setFilename("P1236.jpg");
		
		Product top = new Product("P1237", "Scoop stripe tee", 18000);
		top.setDescription("사랑스럽고 데일리한 컬리의 스트라이프 티");
		top.setCategory("Top");
		top.setManufacturer("Ellen");
		top.setUnitsInStock(1000);
		top.setCondition("New");
		top.setFilename("P1237.jpg");
		
		listOfProducts.add(outer);
		listOfProducts.add(dress);
		listOfProducts.add(pants);	
		listOfProducts.add(top);
	}
	public ArrayList<Product> getAllProducts() {	//상품 목록을 가져오는 메소드
		return listOfProducts;
	}
	
	public Product getProductById(String productId) {	//상품 상세 정보를 가져오는 메소드
		Product productById = null;
		
		for(int i=0; i<listOfProducts.size(); i++) {	//listOfProducts에 저장된 상품목록에서 상품 아이디와 일치하는 상품을 가져옴
			Product product = listOfProducts.get(i);
			if(product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
	
	public void addProduct(Product product) {	//listOfProducts에 새로운 상품 정보를 등록하는 addProduct()메소드
		listOfProducts.add(product);
	}
}
