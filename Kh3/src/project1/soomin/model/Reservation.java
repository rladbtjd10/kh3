package project1.soomin.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Reservation{
	
	private String id;
	private String name;
    private String phoneNumber;
    private int numberOfGuests;
    private LocalDateTime reservationDateTime;

    // 생성자, 게터(getter), 세터(setter) 등의 메서드 작성

    public void createReservation() {
        // 예약 생성 로직 작성
    }

    public void updateReservation() {
        // 예약 업데이트 로직 작성
    }

    public void cancelReservation() {
        // 예약 취소 로직 작성
    }

    public List<Reservation> getReservationsByDate(LocalDate date) {
		return null;
        // 특정 날짜의 예약 목록을 가져오는 로직 작성
    }

	
}
