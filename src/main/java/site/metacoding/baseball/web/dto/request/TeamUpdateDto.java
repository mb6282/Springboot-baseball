package site.metacoding.baseball.web.dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TeamUpdateDto {
	private Integer stadiumId;
	private String teamName;
}
