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
		top.setDescription("사랑스럽고 데일리한 컬리의 스트라이프 티");
		top.setCategory("Top");
		top.setManufacturer("Ellen");
		top.setUnitsInStock(1000);
		top.setCondition("New");
		top.setFilename("P1237.jpg");
		
		listOfTops.add(top);
	}
	public ArrayList<Top> getAllOuters() {	//상품 목록을 가져오는 메소드
		return listOfTops;
	}
	
	public Top getTopById(String productId) {	//상품 상세 정보를 가져오는 메소드
		Top topById = null;
		
		for(int i=0; i<listOfTops.size(); i++) {	//listOfTops에 저장된 상품목록에서 상품 아이디와 일치하는 상품을 가져옴
			Top top = listOfTops.get(i);
			if(top != null && top.getProductId() != null && top.getProductId().equals(productId)) {
				topById = top;
				break;
			}
		}
		return topById;
	}
	
	public void addTop(Top top) {	//listOfTops에 새로운 상품 정보를 등록하는 addTop()메소드
		listOfTops.add(top);
	}
}