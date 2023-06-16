package Interface;

public interface CustomerInterface {

	/* - 고객을 위한 기능:
	 * 1. 웨이팅 리스트 등록: 고객은 웹사이트를 통해 웨이팅 리스트에 자신의 정보와 인원 수를 등록할 수 있음
	 * 2. 대기 시간 확인: 고객은 웹사이트나 모바일 앱을 통해 실시간으로 대기 시간을 확인할 수 있음
	 * 3. 대기 상태 알림: 고객은 웨이팅 리스트에 등록된 후 알림을 받아 대기 상태를 실시간으로 알 수 있음
	 * 4. 예약 및 취소: 고객은 웹사이트를 통해 예약을 신청하고 필요에 따라 예약을 취소할 수 있음
	 * 5. 테이블 안내 알림: 고객은 테이블이 준비되었을 때 알림을 받아 식당로 안내 받을 수 있음
	 */
	public void waitingList();
	 // 웨이팅 리스트
	public void watingtimeCheck();
	 // 대기 시간 확인
	public void notification();
	 // 대기 상태 알림
	public void reservation();
	 // 예약
	public void cancellation();
	 // 취소
	public void TableAlarm();
	 // 테이블알림

}
