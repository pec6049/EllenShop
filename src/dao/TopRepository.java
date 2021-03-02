package dao;

import java.util.ArrayList;

import dto.Top;

public class TopRepository {
	
	private ArrayList<Top> listOfTops = new ArrayList<Top>();
	private static TopRepository instance = new TopRepository();
	
	public static TopRepository getInstance() {
		return instance;
	}
	
	public TopRepository() {
		Top top = new Top("P1237", "Scoop stripe tee", 18000);
		top.setDescription("��������� ���ϸ��� �ø��� ��Ʈ������ Ƽ");
		top.setCategory("Top");
		top.setManufacturer("Ellen");
		top.setUnitsInStock(1000);
		top.setCondition("New");
		top.setFilename("P1237.jpg");
		
		listOfTops.add(top);
	}
	public ArrayList<Top> getAllOuters() {	//��ǰ ����� �������� �޼ҵ�
		return listOfTops;
	}
	
	public Top getTopById(String productId) {	//��ǰ �� ������ �������� �޼ҵ�
		Top topById = null;
		
		for(int i=0; i<listOfTops.size(); i++) {	//listOfTops�� ����� ��ǰ��Ͽ��� ��ǰ ���̵�� ��ġ�ϴ� ��ǰ�� ������
			Top top = listOfTops.get(i);
			if(top != null && top.getProductId() != null && top.getProductId().equals(productId)) {
				topById = top;
				break;
			}
		}
		return topById;
	}
	
	public void addTop(Top top) {	//listOfTops�� ���ο� ��ǰ ������ ����ϴ� addTop()�޼ҵ�
		listOfTops.add(top);
	}
}