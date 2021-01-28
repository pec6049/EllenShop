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
		Outer outer = new Outer("P1234", "엘렌 jk", 59000);
		outer.setDescription("데일리하게 입기 좋은 캐주얼 아이템");
		outer.setCategory("Outer");
		outer.setManufacturer("Ellen");
		outer.setUnitsInStock(1000);
		outer.setCondition("New");
		outer.setFilename("P1234.jpg");
		
		listOfOuters.add(outer);
	}
	public ArrayList<Outer> getAllOuters() {	//상품 목록을 가져오는 메소드
		return listOfOuters;
	}
	
	public Outer getOuterById(String productId) {	//상품 상세 정보를 가져오는 메소드
		Outer outerById = null;
		
		for(int i=0; i<listOfOuters.size(); i++) {	//listOfOuters에 저장된 상품목록에서 상품 아이디와 일치하는 상품을 가져옴
			Outer outer = listOfOuters.get(i);
			if(outer != null && outer.getProductId() != null && outer.getProductId().equals(productId)) {
				outerById = outer;
				break;
			}
		}
		return outerById;
	}
	
	public void addOuter(Outer outer) {	//listOfOuters에 새로운 상품 정보를 등록하는 addOuter()메소드
		listOfOuters.add(outer);
	}
}
