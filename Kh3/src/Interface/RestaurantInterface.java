package Interface;

public interface RestaurantInterface {
	
public void uploadPhoto(String photo); // 주어진 사진을 식당의 사진 목록에 추가합니다.
	
	public void setOperatingInfo(String operatingInfo); //식당의 영업정보를 설정합니다.
	public void updateOperatingInfo(String operatingInfo); //식당의 영업정보를 설정합니다.
	
	public void addFacility(String facility); // 주어진 편의시설을 식당의 편의시설 목록에 추가합니다.
	
	public void setIntroduction(String introduction); // 식당의 매장 소개를 설정합니다.
	
	public void setPicked(boolean picked); //식당의 Pick 여부를 설정합니다.
	
	public int pickedCount(); // pick 수
	
	public void getRepresentativeMenu(); //대표 메뉴를 반환합니다.
	public void getMenu(); //식당의 메뉴 목록을 반환합니다.
	
	public void updatePhoto(int index, String newPhoto); //주어진 인덱스에 해당하는 사진을 새로운 사진으로 업데이트합니다.
	public void deletePhoto(int index); //주어진 인덱스에 해당하는 사진을 삭제합니다.
	
	public void writeReview(String review); //주어진 후기를 식당의 후기 목록에 추가합니다.
	public void updateReview(int index, String newReview); //주어진 인덱스에 해당하는 후기를 새로운 후기로 업데이트합니다.
	public void deleteReview(int index); //주어진 인덱스에 해당하는 후기를 삭제합니다.

	public void setAddress(String address); //식당의 주소를 설정합니다.
	public void updateAddress(String address); //식당의 주소를 설정합니다.

	public void setPhoneNumber(String phoneNumber); //식당의 전화번호를 설정합니다.
	public void getPhoneNumber(); //식당의 전화번호를 반환합니다.

	public void setOperatingHours(String operatingHours); //식당의 운영시간을 설정합니다.
	public void getOperatingHours(); //식당의 운영시간을 반환합니다.

	public double setRating(double rating); //식당의 평점을 설정합니다.

	public void addDiscount(String discount); //주어진 할인 정보를 식당의 할인 목록에 추가합니다.
	public void removeDiscount(String discount); //주어진 할인 정보를 식당의 할인 목록에서 제거합니다.

	public void setLatitude(double latitude); //식당의 위도를 설정합니다.
	public void setLongitude(double longitude); //식당의 경도를 설정합니다.

}
