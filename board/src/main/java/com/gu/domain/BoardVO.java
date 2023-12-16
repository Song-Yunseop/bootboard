package com.gu.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {

/*
	create table board(
		bno number not null,              
		title varchar2(200) not null,    
		content varchar2(4000),          
		writer varchar2(50) not null,    
		regdate date default sysdate,     
		viewcnt number default 0,
		img varchar2(400),      
		primary key(bno)  
	);
	
	CREATE SEQUENCE TMP_SEQ START WITH  1 INCREMENT BY 1 MAXVALUE 9999 NOCYCLE NOCACHE;
 */
	
	private int bno; 
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private int viewCnt;
	private String img;
}
