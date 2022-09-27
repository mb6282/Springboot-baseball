package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.team.Team;
import site.metacoding.baseball.domain.team.TeamDao;
import site.metacoding.baseball.web.dto.request.TeamUpdateDto;

@RequiredArgsConstructor
@Service
public class TeamService {
	private final TeamDao teamDao;
	
	public void 팀등록하기(Team team) {
		teamDao.save(team);
	}
	
	public List<Team> 팀목록보기() {
		return teamDao.findAll();
	}
	
	public Team 팀한개정보가져오기(Integer id) {
		return teamDao.findById(id);
	}
	
	public void 팀수정하기(Integer id, TeamUpdateDto teamUpdateDto) {
		Team teamPS = teamDao.findById(id);
		teamPS.update(teamUpdateDto);
		teamDao.update(teamPS);
	}
	
	public void 팀삭제하기(List<Integer> ids) {
		for(Integer id : ids) {
			teamDao.deleteById(id);
		}
	}
}
