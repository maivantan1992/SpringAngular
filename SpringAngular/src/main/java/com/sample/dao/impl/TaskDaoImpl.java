package com.sample.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sample.dao.HBSpBasicDAO;
import com.sample.dao.TaskDao;
import com.sample.entity.Task;

@Repository
@Transactional
public class TaskDaoImpl extends HBSpBasicDAO<Task, Integer> implements TaskDao {

	public TaskDaoImpl() {
		super(Task.class);
	}

	@Override
	public int add(Task task) {
		return super.insert(task);
	}

	@Override
	public Task update(Task task){
		return super.update(task);
	}

	@Override
	public List<Task> listAll(){
		return super.getAll();
	}

}
