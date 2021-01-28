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
		Pants pants = new Pants("P1236", "포지티브 ash denim", 28500);
		pants.setDescription("깔끔한 스트레이트핏에 데일리한 색감의 팬츠");
		pants.setCategory("Pants");
		pants.setManufacturer("Ellen");
		pants.setUnitsInStock(1000);
		pants.setCondition("New");
		pants.setFilename("P1236.jpg");
		
		listOfPantses.add(pants);
	}
	public ArrayList<Pants> getAllPantss() {	//상품 목록을 가져오는 메소드
		return listOfPantses;
	}
	
	public Pants getPantsById(String productId) {	//상품 상세 정보를 가져오는 메소드
		Pants pantsById = null;
		
		for(int i=0; i<listOfPantses.size(); i++) {	//listOfPantss에 저장된 상품목록에서 상품 아이디와 일치하는 상품을 가져옴
			Pants pants = listOfPantses.get(i);
			if(pants != null && pants.getProductId() != null && pants.getProductId().equals(productId)) {
				pantsById = pants;
				break;
			}
		}
		return pantsById;
	}
	
	public void addPants(Pants pants) {	//listOfPantses에 새로운 상품 정보를 등록하는 addTop()메소드
		listOfPantses.add(pants);
	}
}