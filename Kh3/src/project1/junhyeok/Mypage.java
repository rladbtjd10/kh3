package project1.junhyeok;

import java.util.List;
import java.util.Map;

public interface Mypage {
	
	// 나의 정보
	public void myinfo();
		
	// 정보 수정
	public void changeInfo();
	
	// 찜해둔 식당
	public List reservationRestaurant();
	
	// 레스토랑 예약 현황
	public void reservationCurrentSituation();
	
	// 리뷰 남기기
	public void review();
	
	// 이벤트/쿠폰/포인트 적립 내역
	public List event();
	
	public Map<String, String> coupon();
	
	public int point();
	
	// 추천식당
	public void recommendedRestaurant();
	
	// 설정(알림끄고켜기, 위치서비스 끄고켜기)
	public boolean alarmSetting();
	
	public boolean locationSetting();
	
	// 회원 탈퇴
	public void MembershipWithdrawal();
	
	// 고객센터 문의
	public void customerServiceCenter();
	
	public List reserveList();			// 예약 내역
	public List cancelList(); 			// 취소 내역
	
	
	
}
