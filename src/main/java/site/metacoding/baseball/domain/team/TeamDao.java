package site.metacoding.baseball.domain.team;

import java.util.List;

import site.metacoding.baseball.web.dto.response.TeamDto;

public interface TeamDao {
	public void save(Team team);
	public List<TeamDto> findAll();
	public Team findById(Integer id);
	public TeamDto findDtoById(Integer id);
	public void update(Team team);
	public void deleteById(Integer id);
}
