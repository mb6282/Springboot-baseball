package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.player.Player;
import site.metacoding.baseball.domain.player.PlayerDao;

@RequiredArgsConstructor
@Service
public class PlayerService {
	private final PlayerDao playerDao;
	
	public void 선수등록하기(Player player) {
		playerDao.save(player);
	}
	
	public List<Player> 선수목록보기() {
		return playerDao.findAll();
	}
	
	
}
