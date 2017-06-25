package org.offer.controller;

import org.offer.http.APIStatus;
import org.offer.http.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
public class ErrorPagesController {

	@RequestMapping(value = "/404")
	@ResponseBody
	public JSONObject _404() {
		return ApiResponse.jsonData(APIStatus.NOT_FOUND_404);
	}

	@RequestMapping(value = "/500")
	@ResponseBody
	public JSONObject _500() {
		return ApiResponse.jsonData(APIStatus.ERROR_500);
	}

	@RequestMapping(value = "/400")
	@ResponseBody
	public JSONObject _400() {
		return ApiResponse.jsonData(APIStatus.ERROR_400);
	}
}