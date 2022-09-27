package site.metacoding.baseball.web.dto.response;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class TeamDto {
	private Integer id;
	private Integer no;
	private String stadiumName;
	private String teamName;
	private Timestamp createDate;
}
