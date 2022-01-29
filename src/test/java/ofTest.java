import com.irisjane.pojo.Book;
import com.irisjane.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Target;
import java.util.List;

/**
 * @Author: JANE
 * @Date:2022/1/28 - 01 - 28 - 21:09
 * @Description:
 * @Version:1.0
 */
public class ofTest {

    @Test
    public void t1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");

        List<Book> allBooks = bookService.getAllBooks();
        for (Book allBook : allBooks) {
            System.out.println(allBook);
        }
    }
}
