package code.selwyn.controller

import code.selwyn.domain.Author
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import code.selwyn.domain.Book
/**
 * Created by Selwyn on 5/19/2017.
 */
@RestController
class BookStoreController{
    @RequestMapping("/books")
    fun all(@RequestParam(value="name")name: String): Map<String, Any> {
        var author1 = Author(name="author1", age= Integer(27))
        var book1 = Book(id=1, name="book1", author = author1)
        var book2 = Book(id=2, name="book2", author = Author("author2", Integer(35)))

        return mapOf("books" to arrayListOf(book1, book2))
    }
}