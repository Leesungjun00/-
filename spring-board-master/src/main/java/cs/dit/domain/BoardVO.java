package cs.dit.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {

	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private Date updateDate;

//	public void setTitle(String string) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public Long getBno() {
//		return bno;
//	}
//
//	public void setBno(Long bno) {
//		this.bno = bno;
//	}
//
//	public String title() {
//		return title;
//	}
//
//	public void title(String title) {
//		this.title = title;
//	}
//
//	public String content() {
//		return content;
//	}
//
//	public void content(String content) {
//		this.content = content;
//	}
//
//	public String writer() {
//		return writer;
//	}
//
//	public void writer(String writer) {
//		this.writer = writer;
//	}
//
//	public Date regDate() {
//		return regDate;
//	}
//
//	public void regDate(Date regDate) {
//		this.regDate = regDate;
//	}
//
//	public Date updateDate() {
//		return updateDate;
//	}
//
//	public void updateDate(Date updateDate) {
//		this.updateDate = updateDate;
//	}
//
//	public void setContent(String string) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public void setWriter(String writer) {
//		// TODO Auto-generated method stub
//
//	}

}