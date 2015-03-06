package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.dao.TaskDao;
import com.sample.entity.Task;

@Controller
@RequestMapping("")
public class HomeController {
	
	@Autowired
	TaskDao taskDao;
	
	@RequestMapping("")
	public String home(){
		return "home";
	}
	
	@RequestMapping("listTask")
	@ResponseBody
	public List<Task> listTask(){
		List<Task> listResult = taskDao.listAll();
		return listResult;
	}
}
