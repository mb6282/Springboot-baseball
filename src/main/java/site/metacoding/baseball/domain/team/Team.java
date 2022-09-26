package site.metacoding.baseball.domain.team;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Team {
	private Integer id;
	private Integer stadiumId;
	private String teamName;
	private Timestamp createDate;
}
