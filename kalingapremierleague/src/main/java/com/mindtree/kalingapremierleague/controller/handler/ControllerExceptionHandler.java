package com.mindtree.kalingapremierleague.controller.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mindtree.kalingapremierleague.controller.KalingaPremierLeagueController;
import com.mindtree.kalingapremierleague.dto.ErrorDto;
import com.mindtree.kalingapremierleague.exception.ServiceException;

@RestControllerAdvice(assignableTypes= {KalingaPremierLeagueController.class})
public class ControllerExceptionHandler {
	@ExceptionHandler(ServiceException.class)
	public ResponseEntity<ErrorDto> serviceExceptionHandler(Exception e, Throwable cause){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorDto(e.getMessage(), cause));
	}

}