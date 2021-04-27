package com.hxy.service;

import com.hxy.dao.BookMapper;
import com.hxy.pojo.Books;

import java.util.List;

public class BookServiceIpmI implements BookService {

    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return this.bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return this.bookMapper.deleteBookById(id);
    }

    public int updateBook(Books book) {
        return this.bookMapper.updateBook(book);
    }

    public Books queryBookById(int id) {
        return this.bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return this.bookMapper.queryAllBook();
    }
}
