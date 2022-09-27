package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.player.Player;
import site.metacoding.baseball.domain.player.PlayerDao;
import site.metacoding.baseball.domain.team.Team;
import site.metacoding.baseball.web.dto.request.PlayerUpdateDto;
import site.metacoding.baseball.web.dto.request.TeamUpdateDto;

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
	
	public Player 선수한명정보가져오기(Integer id) {
		return playerDao.findById(id);
	}
	
	public void 선수수정하기(Integer id, PlayerUpdateDto playerUpdateDto) {
		Player playerPS = playerDao.findById(id);
		playerPS.update(playerUpdateDto);
		playerDao.update(playerPS);
	}
}
