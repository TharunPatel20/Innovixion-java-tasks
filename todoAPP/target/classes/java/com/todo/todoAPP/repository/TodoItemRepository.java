package com.todo.todoAPP.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.todo.todoAPP.models.TodoItem;


@Repository
public interface TodoItemRepository  extends JpaRepository<TodoItem,Long>{

}
