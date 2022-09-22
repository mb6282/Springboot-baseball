package site.metacoding.baseball.domain.stadium;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Stadium {
	@GetMapping({ "/", "/stadium" })
	public String getStadiumList() {
		return "stadium/stadiumList";
	}
}
