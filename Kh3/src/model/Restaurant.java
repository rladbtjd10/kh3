package Restaurant;

import java.util.List;

public class Restaurant {
	
	private String name; // 식당이름
	private String address; //식당의 주소
	private String phoneNumber; //식당의 전화번호
	private String operatingHours; //식당의 영업시간
	private double rating; //식당의 평점
	private String discounts; //식당의 할인 정보
	private double latitude; //식당의 위치 정보 위도
	private double longitude; //식당의 위치 정보 경도
	private String photos; //식당사진 -수정,삭제
	private String reviews; //리뷰(후기) -작성,수정,삭제
	private String operatingInfo; //식당 영업정보 작성,수정,삭제 - 운영시간 -휴식시간 -휴무일 -전화번호 
	private String facility; //편의시설 - 남녀화장실구분, 무선인터넷, 단체석구비, 등
	private String introduction; // 매장소개
	private boolean Picked; //매장Pick
	

	private String Ratings; //평점
	private String starScore; 
	private String Location;
	private String number; //전화번호
	private String businessHours; 
	private String serviceOption;
	private String popularTime;
	private String location;  // 위치
	private List menu;        // 메뉴
	private int averStar;	  // 별점
	private int recommend;    // 찜 수
	private int searchScore;  // 검색횟수
	private String foodKind;  // 음식종류
    private int reserScore;   // 예약확정수
	

	private List waiting;	     // 웨이팅 리스트
	private int time;	 	     // 예상시간
	private int update;		 	 // 예상시간 업데이트
	private int tableNum; 	 	 // 테이블 번호
	private String tableMan;  	 // 테이블 관리
	private String reserveMan;   // 예약 관리
	private String alarm; 	     // 알림

}
