package org.hdcd.domain;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
@AllArgsConstructor
public class Member {
	
	private final String userId;
	private final String password;
	private String userName;
}
