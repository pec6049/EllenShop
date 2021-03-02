package dao;

import java.util.ArrayList;

import dto.Pants;

public class PantsRepository {
	
	private ArrayList<Pants> listOfPantses = new ArrayList<Pants>();
	private static PantsRepository instance = new PantsRepository();
	
	public static PantsRepository getInstance() {
		return instance;
	}
	
	public PantsRepository() {
		Pants pants = new Pants("P1236", "����Ƽ�� ash denim", 28500);
		pants.setDescription("����� ��Ʈ����Ʈ�Ϳ� ���ϸ��� ������ ����");
		pants.setCategory("Pants");
		pants.setManufacturer("Ellen");
		pants.setUnitsInStock(1000);
		pants.setCondition("New");
		pants.setFilename("P1236.jpg");
		
		listOfPantses.add(pants);
	}
	public ArrayList<Pants> getAllPantss() {	//��ǰ ����� �������� �޼ҵ�
		return listOfPantses;
	}
	
	public Pants getPantsById(String productId) {	//��ǰ �� ������ �������� �޼ҵ�
		Pants pantsById = null;
		
		for(int i=0; i<listOfPantses.size(); i++) {	//listOfPantss�� ����� ��ǰ��Ͽ��� ��ǰ ���̵�� ��ġ�ϴ� ��ǰ�� ������
			Pants pants = listOfPantses.get(i);
			if(pants != null && pants.getProductId() != null && pants.getProductId().equals(productId)) {
				pantsById = pants;
				break;
			}
		}
		return pantsById;
	}
	
	public void addPants(Pants pants) {	//listOfPantses�� ���ο� ��ǰ ������ ����ϴ� addTop()�޼ҵ�
		listOfPantses.add(pants);
	}
}