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
import site.metacoding.baseball.service.StadiumService;
import site.metacoding.baseball.web.dto.request.StadiumUpdateDto;
import site.metacoding.baseball.web.dto.response.CMRespDto;
import site.metacoding.baseball.web.dto.response.StadiumDto;

@RequiredArgsConstructor
@Controller
public class StadiumController {
	
	private final StadiumService stadiumService;
	
	@GetMapping({ "/", "/stadium" })
	public String getStadiumList(Model model) {
		List<StadiumDto> stadiumDtoPS = stadiumService.경기장목록보기();
		model.addAttribute("stadiumDto", stadiumDtoPS);
		return "stadium/stadiumList";
	}
	
	@GetMapping("/stadium/saveForm")
	public String stadiumSaveForm() {
		return "stadium/stadiumSaveForm";
	}
	
	@PostMapping("/stadium")
	public @ResponseBody CMRespDto<?> saveStadium(@RequestBody Stadium stadium) {
		stadiumService.경기장등록하기(stadium);
		return new CMRespDto<>(1, "경기장등록성공", null);
	}
	
	@GetMapping("/stadium/{id}/{name}/updateForm")
	public String stadiumUpdateForm(@PathVariable int id, @PathVariable String name, Model model) {
		Stadium stadiumPS = stadiumService.경기장한개정보가져오기(id);
		model.addAttribute("stadium", stadiumPS);
		return "stadium/stadiumUpdateForm";
	}
	
	@PutMapping("/stadium/{id}")
	public @ResponseBody CMRespDto<?> updateStadium(@PathVariable Integer id, @RequestBody StadiumUpdateDto stadiumUpdateDto) {
		stadiumService.경기장수정하기(id, stadiumUpdateDto);
		return new CMRespDto<>(1, "글수정성공", null);
	}
	
	@PostMapping("/stadiumDelete")
	public @ResponseBody CMRespDto<?> deleteStadium(@RequestParam(value="checkBoxArr[]") List<Integer> ids) {
		//파라매터를 json형태로 받는 경우에는 @RequestBody HashMap<,>으로 받을 수 있으나
		//경기장삭제하기에 id를 넣어주어야 하므로 Param으로 id값만 받는게 적절하다
		stadiumService.경기장삭제하기(ids);
		return new CMRespDto<>(1, "글삭제성공", null);
	}
}
