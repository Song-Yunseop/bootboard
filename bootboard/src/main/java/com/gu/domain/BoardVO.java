package com.gu.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	
	private int id;
	private String title;
	private String content;
	private Date create_at;
	private Date update_at;
	private int view_count; 
	private int good_count;
	private int user_id;

}
