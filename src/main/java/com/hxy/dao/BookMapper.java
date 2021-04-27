package com.hxy.dao;

import com.hxy.pojo.Books;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookMapper {

    int addBook(Books book);

    int deleteBookById(int id);

    int updateBook(Books book);

    Books queryBookById(int id);

    List<Books> queryAllBook();
}
