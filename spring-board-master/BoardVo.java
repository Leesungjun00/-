package cs.dit.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardVo {

	private long bno;
	private String title, content, writer;
	private Date regdate, updatedate;
}
