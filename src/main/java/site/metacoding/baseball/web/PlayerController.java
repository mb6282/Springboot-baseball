package site.metacoding.baseball.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.player.Player;
import site.metacoding.baseball.domain.team.Team;
import site.metacoding.baseball.service.PlayerService;
import site.metacoding.baseball.service.TeamService;
import site.metacoding.baseball.web.dto.request.PlayerUpdateDto;
import site.metacoding.baseball.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class PlayerController {

	private final PlayerService playerService;
	private final TeamService teamService;
	
	@GetMapping("/player")
	public String getPlayerList(Model model) {
		List<Player> playerListPS = playerService.선수목록보기();
		model.addAttribute("playerList", playerListPS);
		return "player/playerList";
	}
	
	@GetMapping("/player/saveForm")
	public String playerSaveForm(Model model) {
		List<Team> teamPS = teamService.팀목록보기();
		model.addAttribute("team", teamPS);
		return "player/playerSaveForm";
	}
	
	@PostMapping("/player")
	public @ResponseBody CMRespDto<?> savePlayer(@RequestBody Player player) {
		playerService.선수등록하기(player);
		return new CMRespDto<>(1, "선수등록성공", null);
	}
	
	@GetMapping("/player/{id}/{name}/updateForm")
	public String teamUpdateForm(@PathVariable Integer id, @PathVariable String name, Model model) {
		Player playerPS = playerService.선수한명정보가져오기(id);
		List<Team> teamPS = teamService.팀목록보기();
		model.addAttribute("player", playerPS);
		model.addAttribute("team", teamPS);
		return "player/playerUpdateForm";
	}
	
	@PutMapping("/player/{id}")
	public @ResponseBody CMRespDto<?> updatePlayer(@PathVariable Integer id, @RequestBody PlayerUpdateDto playerUpdateDto) {
		playerService.선수수정하기(id, playerUpdateDto);
		return new CMRespDto<>(1, "선수정보수정성공", null);
	}
	
	@PostMapping("/playerDelete")
	public @ResponseBody CMRespDto<?> deletePlayer(@RequestParam(value = "checkBoxArr[]") List<Integer> ids) {
		playerService.선수삭제하기(ids);
		return new CMRespDto<>(1, "선수삭제성공", null);
	}
}
