package site.metacoding.baseball.web.dto.response;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class StadiumDto {
	private Integer id;
	private Integer no;
	private String stadiumName;
	private Timestamp createDate;
}
