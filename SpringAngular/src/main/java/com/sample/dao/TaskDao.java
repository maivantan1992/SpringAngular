package com.sample.dao;

import java.util.List;

import com.sample.entity.Task;

public interface TaskDao {
	int add(Task task);
	Task update(Task task);
	List<Task> listAll();
}
