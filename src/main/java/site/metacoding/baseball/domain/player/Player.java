package site.metacoding.baseball.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Player {
	private Integer id;
	private String playerName;
	private Integer teamId;
	private String position;
	private Timestamp createDate;
	
	// 엔티티가 아닌 필드
	private Integer no;
	private String teamName;
}
