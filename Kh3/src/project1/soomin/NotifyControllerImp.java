package project1.soomin;

public interface NotifyControllerImp {
	
 public void registerWaiting();
 	// 웨이팅 등록 알림
     // 사용자가 웨이팅 리스트에 등록되었을 때 알림을 보내줌

 public void postponeWaiting(); 
 	 // 웨이팅 연기 기능
 	 // 예약 시간이 다가왔을 때 "연기하기" 버튼을 누르면 알림이 발송되어 사용자가 예약을 연기할 수 있도록 안내(차례넘기기)

 public void cancelWaiting();
 	// 웨이팅 취소 기능
 	// 사용자가 예약을 취소할 경우

 public void prepareForEntry(); 
 	 // 입장 준비 알림
      // 사용자가 예약한 시간이 가까워지면 알림을 보내줌

 public void notifyWaitingPrediction(); 
 	// 대기 시간 예측 알림
 	// 식당의 대기 시간을 예측하여 사용자들에게 알림
 
 public void updateWaitingTime(); 
 	// 대기시간 업데이트
 	// 웨이팅 리스트에 등록된 사용자들에게 대기 시간의 변동이 있을 때

 public void notifyWaitingCount(); 
     // 대기 인원 알림
 	// 사용자가 웨이팅 리스트에 등록될 때, 해당 식당의 대기 인원 수를 알림으로 보냄
 

 
// [리뷰]    
 public void notifyReviewRequest(); 
     // 식당 리뷰 요청 알림
 	// 사용자들에게 식당 방문 후 리뷰를 작성하도록 요청하는 알림

 public void notifyReviewRegistration(); 
     // 리뷰 등록 알림

 public void updateReview(); 
     // 리뷰 수정 알림

 public void removeReview(); 
     // 리뷰 삭제 알림

 
//[식당예약]
 public void reservationConfirmationNotification();
     // 예약 확정 알림
 	// 사용자가 예약을 완료했을 때
 
 public void reservationChangeNotification(); 
     // 예약 변경 알림
 	// 사용자가 예약을 변경할 경우
 
 public void reservationCancellationNotification(); 
     // 예약 취소 알림
 	// 사용자가 예약을 취소할 경우

 public void firstComeReservationNotification();
     // 선착순 예약 알림
 	// 식당에서 선착순 예약 서비스를 제공할 때, 예약이 가능해졌을 때 알림보내줌

 public void congestionNotification();
     // 시간대별 혼잡도 알림 로직 구현
 	// 식당의 시간대별 혼잡도를 알림으로 제공

 public void restaurantOpenNotification(); 
 	// 영업시간 확인 가능
 

//[포장 주문]
 public void orderNotification();
     // 주문 등록 알림 

 public void orderConfirmationNotification(); 
     // 주문 재확인 알림
 	// 사용자가 주문한 음식의 내용을 알림으로 보내주어 사용자가 올바른 주문을 했는지 확인
 
 public void orderCancelNotification();
     // 주문 취소 알림 
 	// 사용자가 주문한 음식을 취소했을 때
 
 public void pickUpNotification(); 
     // 주문 완료 알림
 	// 사용자가 주문한 음식이 준비되었을 때(포장주문 픽업)
 


//[마이페이지 관련]    
 public void sendPreferenceNotification();
     // 선호도 관련 알림 로직 구현
 	// 자신의 선호도나 이용 기록을 기반으로 그와 관련된 할인 정보나 새로운 메뉴 소식을 알림으로 전달
 
 public void notifyDiscountEvent(); 
     // 할인 및 특별 이벤트 알림 
 	// 식당에서 제공하는 할인 행사나 특별 이벤트가 있을 때(ex:할인 이벤트, 새로운 메뉴 출시, 음식 시음 행사 등의 정보)
 
 public void updatePushNotificationSettings(); 
     // 푸시 알림 설정 변경 로직 구현
 	// 원하는 경우에만 받도록 설정
 
 public void sendCommentNotification(); 
     // 댓글 알림 로직 구현
 	// 사용자의 후기, 문의사항 등에 댓글이 달렸을 때 알림
 

}
