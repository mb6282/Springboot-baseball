package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.team.Team;
import site.metacoding.baseball.domain.team.TeamDao;
import site.metacoding.baseball.web.dto.response.TeamDto;

@RequiredArgsConstructor
@Service
public class TeamService {
	private final TeamDao teamdao;
	
	public void 팀등록하기(Team team) {
		teamdao.save(team);
	}
	
	public List<TeamDto> 팀목록보기() {
		return teamdao.findAll();
	}
}
