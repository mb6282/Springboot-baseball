package site.metacoding.baseball.domain.stadium;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import site.metacoding.baseball.web.dto.request.StadiumUpdateDto;

@NoArgsConstructor
@Getter
public class Stadium {
	private Integer id;
	private String stadiumName;
	private Timestamp createDate;

	public void update(StadiumUpdateDto stadiumUpdateDto) {
		this.stadiumName = stadiumUpdateDto.getStadiumName();
	}
	
}
