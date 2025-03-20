package B8.book_service.controller;

import B8.book_service.service.BookService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import B8.book_service.dto.Book;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@Slf4j
public class BookController {

    @Autowired
    private BookService bookService;

    @SneakyThrows
    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book savedBook = bookService.addBook(book);
        log.info("BookController::addBook request {}", new ObjectMapper().writeValueAsString(book));
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @SneakyThrows
    @GetMapping
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> books = bookService.getBooks();
        log.info("BookController::getBooks response {}", new ObjectMapper().writeValueAsString(books));
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
