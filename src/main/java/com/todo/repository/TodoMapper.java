package com.todo.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
import com.todo.service.Todo;

@Mapper
public interface TodoMapper {
    @Select("SELECT * FROM todos") // SQL文を直接記述
    List<Todo> findAll();
}
