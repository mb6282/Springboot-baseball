package site.metacoding.baseball.domain.player;

import java.util.List;

public interface PlayerDao {
	public void save(Player player);
	public List<Player> findAll();
	public Player findById(Integer id);
	public void update(Player player);
	public void deleteById(Integer id);

}
