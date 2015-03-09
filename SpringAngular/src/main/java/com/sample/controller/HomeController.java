package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(value="addTask", method = RequestMethod.POST)
	@ResponseBody
	public int addTask(@RequestBody Task newtask){
		return taskDao.add(newtask);
	}
	
	@RequestMapping("findByTaskArchived")
	@ResponseBody
	public List<Task> listTask(){
		List<Task> listResult = taskDao.listAll();
		return listResult;
	}
}
