package site.metacoding.baseball.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.domain.team.Team;
import site.metacoding.baseball.service.StadiumService;
import site.metacoding.baseball.service.TeamService;
import site.metacoding.baseball.web.dto.response.CMRespDto;
import site.metacoding.baseball.web.dto.response.StadiumDto;
import site.metacoding.baseball.web.dto.response.TeamDto;

@RequiredArgsConstructor
@Controller
public class TeamController {
	private final TeamService teamService;
	private final StadiumService stadiumService;
	
	@GetMapping("/team")
	public String getTeamList(Model model) {
		List<TeamDto> teamDtoPS = teamService.팀목록보기();
		model.addAttribute("teamDto", teamDtoPS);
		return "team/teamList";
	}
	
	@GetMapping("/team/saveForm")
	public String teamSaveForm(Model model) {
		List<StadiumDto> stadiumDtoPS = stadiumService.경기장목록보기();
		model.addAttribute("stadiumDto", stadiumDtoPS);
		return "team/teamSaveForm";
	}
	
	@PostMapping("/team")
	public @ResponseBody CMRespDto<?> saveStadium(@RequestBody Team team) {
		teamService.팀등록하기(team);
		return new CMRespDto<>(1, "경기장등록성공", null);
	}
}
