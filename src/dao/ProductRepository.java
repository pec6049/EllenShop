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
		Product outer = new Product("P1234", "���� jk", 59000);
		outer.setDescription("���ϸ��ϰ� �Ա� ���� ĳ�־� ������");
		outer.setCategory("Outer");
		outer.setManufacturer("Ellen");
		outer.setUnitsInStock(1000);
		outer.setCondition("New");
		outer.setFilename("P1234.jpg");
		
		Product dress = new Product("P1235", "���� �ö�� ops", 48000);
		dress.setDescription("��Ƽ���� �ö�� ���ϰ� ������ ����Ʈ ���ǽ�");
		dress.setCategory("Dress");
		dress.setManufacturer("Ellen");
		dress.setUnitsInStock(1000);
		dress.setCondition("New");
		dress.setFilename("P1235.jpg");
		
		Product pants = new Product("P1236", "����Ƽ�� ash denim", 28500);
		pants.setDescription("����� ��Ʈ����Ʈ�Ϳ� ���ϸ��� ������ ����");
		pants.setCategory("Pants");
		pants.setManufacturer("Ellen");
		pants.setUnitsInStock(1000);
		pants.setCondition("New");
		pants.setFilename("P1236.jpg");
		
		Product top = new Product("P1237", "Scoop stripe tee", 18000);
		top.setDescription("��������� ���ϸ��� �ø��� ��Ʈ������ Ƽ");
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
	public ArrayList<Product> getAllProducts() {	//��ǰ ����� �������� �޼ҵ�
		return listOfProducts;
	}
	
	public Product getProductById(String productId) {	//��ǰ �� ������ �������� �޼ҵ�
		Product productById = null;
		
		for(int i=0; i<listOfProducts.size(); i++) {	//listOfProducts�� ����� ��ǰ��Ͽ��� ��ǰ ���̵�� ��ġ�ϴ� ��ǰ�� ������
			Product product = listOfProducts.get(i);
			if(product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
	
	public void addProduct(Product product) {	//listOfProducts�� ���ο� ��ǰ ������ ����ϴ� addProduct()�޼ҵ�
		listOfProducts.add(product);
	}
}
