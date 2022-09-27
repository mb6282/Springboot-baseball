package site.metacoding.baseball.domain.team;

import java.util.List;

public interface TeamDao {
	public void save(Team team);
	public List<Team> findAll();
	public Team findById(Integer id);
	public void update(Team team);
	public void deleteById(Integer id);
}
