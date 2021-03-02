package dao;

import java.util.ArrayList;

import dto.Dress;

public class DressRepository {
	
	private ArrayList<Dress> listOfDresses = new ArrayList<Dress>();
	private static DressRepository instance = new DressRepository();
	
	public static DressRepository getInstance() {
		return instance;
	}
	
	public DressRepository() {
		Dress dress = new Dress("P1235", "���� �ö�� ops", 48000);
		dress.setDescription("��Ƽ���� �ö�� ���ϰ� ������ ����Ʈ ���ǽ�");
		dress.setCategory("Dress");
		dress.setManufacturer("Ellen");
		dress.setUnitsInStock(1000);
		dress.setCondition("New");
		dress.setFilename("P1235.jpg");
		
		listOfDresses.add(dress);
	}
	public ArrayList<Dress> getAllDresses() {	//��ǰ ����� �������� �޼ҵ�
		return listOfDresses;
	}
	
	public Dress getDressById(String productId) {	//��ǰ �� ������ �������� �޼ҵ�
		Dress dressById = null;
		
		for(int i=0; i<listOfDresses.size(); i++) {	//listOfDresses�� ����� ��ǰ��Ͽ��� ��ǰ ���̵�� ��ġ�ϴ� ��ǰ�� ������
			Dress dress = listOfDresses.get(i);
			if(dress != null && dress.getProductId() != null && dress.getProductId().equals(productId)) {
				dressById = dress;
				break;
			}
		}
		return dressById;
	}
	
	public void addDress(Dress dress) {	//listOfDresses�� ���ο� ��ǰ ������ ����ϴ� addDress()�޼ҵ�
		listOfDresses.add(dress);
	}
}