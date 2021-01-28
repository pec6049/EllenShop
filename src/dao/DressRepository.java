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
		Dress dress = new Dress("P1235", "벨리 플라워 ops", 48000);
		dress.setDescription("빈티지한 플라워 패턴과 색감의 포인트 원피스");
		dress.setCategory("Dress");
		dress.setManufacturer("Ellen");
		dress.setUnitsInStock(1000);
		dress.setCondition("New");
		dress.setFilename("P1235.jpg");
		
		listOfDresses.add(dress);
	}
	public ArrayList<Dress> getAllDresses() {	//상품 목록을 가져오는 메소드
		return listOfDresses;
	}
	
	public Dress getDressById(String productId) {	//상품 상세 정보를 가져오는 메소드
		Dress dressById = null;
		
		for(int i=0; i<listOfDresses.size(); i++) {	//listOfDresses에 저장된 상품목록에서 상품 아이디와 일치하는 상품을 가져옴
			Dress dress = listOfDresses.get(i);
			if(dress != null && dress.getProductId() != null && dress.getProductId().equals(productId)) {
				dressById = dress;
				break;
			}
		}
		return dressById;
	}
	
	public void addDress(Dress dress) {	//listOfDresses에 새로운 상품 정보를 등록하는 addDress()메소드
		listOfDresses.add(dress);
	}
}