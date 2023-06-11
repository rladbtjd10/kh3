package project1.jinsil;

import java.util.List;

public interface SearchInterface {

//	  검색하기
	public void doSearch();
	
//	  인기순으로 보기
//	public List print
	
//	  찜 많은 순으로 보기
	public List showRecRank();
	
//	  별점 높은 순 보기
	public List showStarRank();
	
//	내 위치랑 식당 거리 계산
    public int calDistance(String loca1, String loca2);
	
//	  가까운 순 보기
	public List showCloseRank();
	
//	검색어 저장하기
	public List saveSearchRank();
	
//	  최근검색어 보기
	public List showSaveSearh();
	
//	  검색기록 삭제
	public void deleteSearch();
	
//	  검색순위 보기
	public List showSearchScroeRank();
	
//	테마별로 묶기 
    public List themeList();
	
//	  테마별 추천
//	public showThemeList();
	
//	  검색필터 설정하기
	 
	
}
