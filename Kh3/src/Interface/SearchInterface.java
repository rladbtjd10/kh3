package Interface;

import java.util.List;

public interface SearchInterface {

//  검색하기
	public void doSearch();
	
//	식당리스트
	public List restauList();
	
//	인기순 리스트 만들기
	public List makePopuList(String name, int reserScore);
	
//	인기순으로 보기
	public List showReserScore();
	
//	찜 많은 순 만들기
    public List makeRecList(String name, int recommend); 
	
//  찜 많은 순으로 보기
	public List showRecRank();
	
//	별점 순 만들기 
    public List makeStarList(String name, int averStar);
	
//  별점 높은 순 보기
	public List showStarRank();
	
//	내 위치랑 식당 거리 계산하기
    public int calDistance(String loca1, String loca2);
    
//  가까운순으로 정렬하기
    public List sortDistance();
	
//	가까운 순 보기
	public List showCloseRank();
	
//	검색어 저장하기
	public List saveSearchRank();
	
//	최근검색어 보기
	public List showSaveSearh();
	
//	검색기록 삭제
	public void deleteSearch();
	
//	검색순위 보기
	public List showSearchScoreRank();
	
//	음식 종류별로 식당 묶기 
    public List themeList();
	
//	음식 종류별 추천
	public List showFoodKindList();
	
//	필터 설정하기
//	public SearchFilter settingFilter();
	
//	필터대로 거른 리스트 가져오기
	public List filterList();
	
//  내 위치 설정하기
    public void myLocation();
    
//  내 위치 변경하기
    public void updateMyLocation();
	 
	
	
}
