package ssm;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.service.BookService;

public class TestBookService extends BaseTest {
	@Autowired
	private BookService bookService;

	@Test
	public void testQueryBookNameById() throws Exception {
		long bookId = 1001;
		String bookName = bookService.queryBookNameById(bookId);
		System.out.println(bookName);

	}
}
