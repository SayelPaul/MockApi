package com.mock.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mock.dto.AlertsDto;
import com.mock.dto.TelemetryDto;

@RestController
@RequestMapping("/v1/api")
@CrossOrigin(origins = "*")
public class Controller {
	

	@GetMapping("alerts")
	public AlertsDto alertsget() {
		AlertsDto payload = new AlertsDto();
		payload.setValue1("1");
		payload.setValue2("2");
		payload.setValue3("3");
		payload.setValue4("4");
		payload.setValue5("5");
		
		return payload;
	}
	
	
	
	
	@PostMapping("alerts")
	public AlertsDto alerts(@RequestBody AlertsDto payload)
	{
		RestTemplate restTemplate = new RestTemplate();
//		restTemplate.getForObject(url, String.class);
		
		payload.setValue1("1");
		payload.setValue2("2");
		payload.setValue3("3");
		payload.setValue4("4");
		payload.setValue5("5");
		
//		HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON);
//		headers.set("X-API-Key",api_key);
//		HttpEntity<String> entity = new HttpEntity<>("message", headers);
//		restTemplate.exchange(url, HttpMethod.POST, entity,
//				String.class);
		
		return payload;
		
	}
	
	@PostMapping("/telemetry")
	public TelemetryDto telemetry(@RequestHeader String url, @RequestHeader String api_key, @RequestBody TelemetryDto payload)
	{
		RestTemplate restTemplate = new RestTemplate();
//		restTemplate.getForObject(url, String.class);
		
		payload.setValue1("1");
		payload.setValue2("2");
		payload.setValue3("3");
		payload.setValue4("4");
		payload.setValue5("5");
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("X-API-Key",api_key);
		HttpEntity<String> entity = new HttpEntity<>("message", headers);
		restTemplate.exchange(url, HttpMethod.POST, entity,
				String.class);
		
		return payload;
		
	}
	
	
	
}
