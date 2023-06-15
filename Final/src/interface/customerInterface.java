package project1.juyoung.src.Alarm.customer;

public interface customerInterface {

	public boolean waitingtimeCheck();
	 // 대기 시간, 대기인원 알림 (예약완료)
	public void discountAlarm();
	 // 할인이벤트 알림
	public void commentAlarm();
	 // 댓글 답글 알림
	public void readyAlarm();
	 // 입장준비 알림, 경고알림
	public void entranceAlarm();
	 // 입장준비 알림
	public void cancelAlarm();
	// (식당)예약취소 알림
	public void selfCancelAlarm();
	// (고객)예약취소 알림

}
