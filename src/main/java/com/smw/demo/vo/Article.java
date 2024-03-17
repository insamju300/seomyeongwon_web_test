package com.smw.demo.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Article {
	private int id;
	private String regDate;
	private String updateDate;
	private String title;
	private String body;
}
