package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.domain.stadium.StadiumDao;
import site.metacoding.baseball.web.dto.request.StadiumUpdateDto;
import site.metacoding.baseball.web.dto.response.StadiumDto;

@RequiredArgsConstructor
@Service
public class StadiumService {
	private final StadiumDao stadiumDao;

	public void 경기장등록하기(Stadium stadium) {
		stadiumDao.save(stadium);
	}
	
	public List<StadiumDto> 경기장목록보기() {
		return stadiumDao.findAll();
	}
	
	public Stadium 경기장수정화면가져오기(Integer id) {
//		if(stadiumPS == null) {
//			throw new MyException(id+"의 게시글을 찾을 수 없습니다.");
//		}
//		id파라매터가 있을 경우 if (boardsPS == null)로 Exception 처리를 해줘야함~ 
		return stadiumDao.findById(id);
	}

	public void 경기장수정하기(Integer id, StadiumUpdateDto stadiumUpdateDto) {
		Stadium stadiumPS = stadiumDao.findById(id);
		stadiumPS.update(stadiumUpdateDto);
		stadiumDao.update(stadiumPS);
	}

	public void 경기장삭제하기(Integer id) {
		stadiumDao.deleteById(id);
	}
	
}
