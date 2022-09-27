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
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.domain.team.Team;
import site.metacoding.baseball.service.StadiumService;
import site.metacoding.baseball.service.TeamService;
import site.metacoding.baseball.web.dto.request.TeamUpdateDto;
import site.metacoding.baseball.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class TeamController {
	private final TeamService teamService;
	private final StadiumService stadiumService;

	@GetMapping("/team")
	public String getTeamList(Model model) {
		List<Team> teamPS = teamService.팀목록보기();
		model.addAttribute("team", teamPS);
		return "team/teamList";
	}

	@GetMapping("/team/saveForm")
	public String teamSaveForm(Model model) {
		List<Stadium> stadiumPS = stadiumService.경기장목록보기();
		model.addAttribute("stadium", stadiumPS);
		return "team/teamSaveForm";
	}

	@PostMapping("/team")
	public @ResponseBody CMRespDto<?> saveStadium(@RequestBody Team team) {
		teamService.팀등록하기(team);
		return new CMRespDto<>(1, "경기장등록성공", null);
	}

	@GetMapping("/team/{id}/{name}/updateForm")
	public String teamUpdateForm(@PathVariable int id, @PathVariable String name, Model model) {
		Team teamPS = teamService.경기장한개정보가져오기(id);
		List<Stadium> stadiumPS = stadiumService.경기장목록보기();
		model.addAttribute("team", teamPS);
		model.addAttribute("stadium", stadiumPS);
		return "team/teamUpdateForm";
	}
	
	@PutMapping("/team/{id}")
	public @ResponseBody CMRespDto<?> updateStadium(@PathVariable Integer id, @RequestBody TeamUpdateDto teamUpdateDto) {
		teamService.팀수정하기(id, teamUpdateDto);
		return new CMRespDto<>(1, "글수정성공", null);
	}

	@PostMapping("/teamDelete")
	public @ResponseBody CMRespDto<?> deleteTeam(@RequestParam(value = "checkBoxArr[]") List<Integer> ids) {
		teamService.팀삭제하기(ids);
		return new CMRespDto<>(1, "글삭제성공", null);
	}
}
