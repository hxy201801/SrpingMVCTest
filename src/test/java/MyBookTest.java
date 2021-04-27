import com.hxy.pojo.Books;
import com.hxy.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyBookTest {

    @Test
    public void testBookServiceUpdate () {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Object bookMapper = context.getBean("bookMapper");
        System.out.println(bookMapper);

        Object bookController = context.getBean("bookController");
        System.out.println(bookController);

        BookService bookService = (BookService) context.getBean("bookService");
        List<Books> bookList = bookService.queryAllBook();
        System.out.println(bookList);
        for(Books book : bookService.queryAllBook()) {
            System.out.println(book);
        }
    }
}
