package com.app.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiError {

	private Integer errorCode;
	private String errorName;
	private Date errorDate;
	
}
