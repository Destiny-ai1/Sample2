package com.example.demo.board;

import lombok.*;

@AllArgsConstructor
@Getter
@ToString
public class Board {
	private long bno;
	private String title;
	private String content;
	private String nickname;
}
