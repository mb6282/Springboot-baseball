package site.metacoding.baseball.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.player.Player;
import site.metacoding.baseball.service.PlayerService;

@RequiredArgsConstructor
@Controller
public class PlayerController {

	private final PlayerService playerService;
	
	@GetMapping("/player")
	public String getPlayerList(Model model) {
		List<Player> playerListPS = playerService.선수목록보기();
		model.addAttribute("playerList", playerListPS);
		return "player/playerList";
	}
}
