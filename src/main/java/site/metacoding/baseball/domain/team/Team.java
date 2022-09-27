package site.metacoding.baseball.domain.team;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import site.metacoding.baseball.web.dto.request.TeamUpdateDto;

@NoArgsConstructor
@Getter
public class Team {
	private Integer id;
	private Integer stadiumId;
	private String teamName;
	private Timestamp createDate;
	
	public void update(TeamUpdateDto teamUpdateDto) {
		this.stadiumId = teamUpdateDto.getStadiumId();
		this.teamName = teamUpdateDto.getTeamName();
	}
}
