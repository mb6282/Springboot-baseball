package site.metacoding.baseball.domain.team;

import java.util.List;

import site.metacoding.baseball.web.dto.response.TeamDto;

public interface TeamDao {
	public void save(Team team);
	public List<TeamDto> findAll();
	public Team findById(Integer id);
	public void update(Team stadium);
	public void deleteById(Integer id);
}
