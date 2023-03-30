package crudBook;

import java.util.List;

public interface BookDAO {
public void createBook(List <Book> list, Book book);
public void updateBook(List <Book> list,int id);
public void deleteBook(List <Book> list,int id);
public void findBook(List <Book> list,int id);
public void printBook (List <Book> list);
}
