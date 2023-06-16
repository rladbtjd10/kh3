package Interface;

public interface RestaurantInterface {

	/* - 식당을 위한 기능
	 * 1. 웨이팅 리스트 관리: 식당 운영자는 웹사이트를 통해 웨이팅 리스트를 관리하고 고객의 정보를 확인할 수 있음
	 * 2. 대기 시간 예측 및 업데이트: 식당 운영자는 대기 시간을 예측하고 필요에 따라 업데이트할 수 있음
	 * 3. 테이블 할당 및 관리: 식당 운영자는 웨이팅 리스트에 따라 테이블을 할당하고 테이블 상태를 관리할 수 있음
	 * 4. 예약 관리: 식당 운영자는 예약 신청을 받고 확인하여 예약을 관리할 수 있음
	 * 5. 알림 발송: 식당 운영자는 고객에게 대기 상태, 테이블 안내 등과 관련된 알림을 발송할 수 있음
	 */
	public void managingWaitingList();
	// 웨이팅 리스트 관리
	public void latencyPrediction();	
	 // 대기 시간 예측
	public void waitingTimeUpdate();
	 // 대기 시간 업데이트
	public void tableAssignment() ;
	 // 테이블 할당
	public void tableManaging();
	 // 테이블 관리
	public void managingReservations();
	 // 예약 관리
	public void sendNotifications();
	 // 알림 발송
}
