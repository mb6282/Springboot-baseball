package site.metacoding.baseball.domain.stadium;

import java.util.List;

import site.metacoding.baseball.web.dto.response.StadiumDto;

public interface StadiumDao {
	public void save(Stadium stadium);
	public List<StadiumDto> findAll();
	public Stadium findById(Integer id);
	public void update(Stadium stadium);
	public void deleteById(Integer id);
}