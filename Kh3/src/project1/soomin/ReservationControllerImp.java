package project1.soomin;

public interface ReservationControllerImp {
	
 public void registerWaiting();
 	// 웨이팅 등록 
     // 사용자가 웨이팅 리스트에 등록되었을 때 

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
 

 
//[식당예약]
 public void reservationConfirmation();
     // 예약 확정 알림
 	// 사용자가 예약을 완료했을 때
 
 public void reservationChange(); 
     // 예약 변경 알림
 	// 사용자가 예약을 변경할 경우
 
 public void reservationCancellation(); 
     // 예약 취소 알림
 	// 사용자가 예약을 취소할 경우

 public void firstComeReservation();
     // 선착순 예약 알림
 	// 식당에서 선착순 예약 서비스를 제공할 때, 예약이 가능해졌을 때 알림보내줌

 public void congestionNotification();
     // 시간대별 혼잡도 알림 로직 구현
 	// 식당의 시간대별 혼잡도를 알림으로 제공

 public void restaurantOpen(); 
 	// 영업시간 확인 가능
 

//[포장 주문]
 public void pickUpOrder();
     // 주문 등록 알림 

 public void pickUpOrderConfirmation(); 
     // 주문 재확인 알림
 	// 사용자가 주문한 음식의 내용을 알림으로 보내주어 사용자가 올바른 주문을 했는지 확인
 
 public void pickUpOrderCancel();
     // 주문 취소 알림 
 	// 사용자가 주문한 음식을 취소했을 때
 
 public void pickUpNotification(); 
     // 주문 완료 알림
 	// 사용자가 주문한 음식이 준비되었을 때(포장주문 픽업)
 

}
