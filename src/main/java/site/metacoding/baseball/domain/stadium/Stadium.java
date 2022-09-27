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

	// 엔티티가 아닌 필드
	private Integer no;
	
	public void update(StadiumUpdateDto stadiumUpdateDto) {
		this.stadiumName = stadiumUpdateDto.getStadiumName();
	}
	
}
