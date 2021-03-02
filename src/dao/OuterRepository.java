package dao;

import java.util.ArrayList;

import dto.Outer;

public class OuterRepository {
	
	private ArrayList<Outer> listOfOuters = new ArrayList<Outer>();
	private static OuterRepository instance = new OuterRepository();
	
	public static OuterRepository getInstance() {
		return instance;
	}
	
	public OuterRepository() {
		Outer outer = new Outer("P1234", "���� jk", 59000);
		outer.setDescription("���ϸ��ϰ� �Ա� ���� ĳ�־� ������");
		outer.setCategory("Outer");
		outer.setManufacturer("Ellen");
		outer.setUnitsInStock(1000);
		outer.setCondition("New");
		outer.setFilename("P1234.jpg");
		
		listOfOuters.add(outer);
	}
	public ArrayList<Outer> getAllOuters() {	//��ǰ ����� �������� �޼ҵ�
		return listOfOuters;
	}
	
	public Outer getOuterById(String productId) {	//��ǰ �� ������ �������� �޼ҵ�
		Outer outerById = null;
		
		for(int i=0; i<listOfOuters.size(); i++) {	//listOfOuters�� ����� ��ǰ��Ͽ��� ��ǰ ���̵�� ��ġ�ϴ� ��ǰ�� ������
			Outer outer = listOfOuters.get(i);
			if(outer != null && outer.getProductId() != null && outer.getProductId().equals(productId)) {
				outerById = outer;
				break;
			}
		}
		return outerById;
	}
	
	public void addOuter(Outer outer) {	//listOfOuters�� ���ο� ��ǰ ������ ����ϴ� addOuter()�޼ҵ�
		listOfOuters.add(outer);
	}
}
