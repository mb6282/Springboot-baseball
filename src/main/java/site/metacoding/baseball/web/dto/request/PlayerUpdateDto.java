package site.metacoding.baseball.web.dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PlayerUpdateDto {
	private String playerName;
	private Integer teamId;
	private String position;
}
