package Interface;

public interface ReservationInterface {

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

	 public String notifyWaitingPrediction(); 
	 	// 대기 시간 예측
	 	// 식당의 대기 시간을 예측하여 사용자들에게 알림
	 
	 public void updateWaitingTime(); 
	 	// 대기시간 업데이트
	 	// 웨이팅 리스트에 등록된 사용자들에게 대기 시간의 변동이 있을 때

	 public int notifyWaitingCount(); 
	     // 대기 인원 
	 	// 사용자가 웨이팅 리스트에 등록될 때, 해당 식당의 대기 인원 수를 알림으로 보냄
	 

	 
	//[식당예약]
	 public boolean reservationConfirmation();
	     // 예약 확정
	 	// 사용자가 예약을 완료했을 때
	 
	 public void firstComeReservation();
	     // 선착순 예약 알림
	 	// 식당에서 선착순 예약 서비스를 제공할 때, 예약이 가능해졌을 때 알림보내줌

	 public String congestionNotification();
	     // 시간대별 혼잡도 알림 로직 구현
	 	// 식당의 시간대별 혼잡도를 알림으로 제공


}
