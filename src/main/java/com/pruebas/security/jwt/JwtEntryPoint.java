package com.pruebas.security.jwt;

import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class JwtEntryPoint implements AuthenticationEntryPoint{
	
	private final static Logger logger = LoggerFactory.getLogger(JwtEntryPoint.class);
	
	
	
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException e) throws IOException, ServletException {
		
		logger.error("Fail en el metodo commnce");
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "no AUTORIZADO");
	}

}
