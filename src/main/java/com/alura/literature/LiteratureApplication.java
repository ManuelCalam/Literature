package com.alura.literature;

import com.alura.literature.client.BookApiClient;
import com.alura.literature.dto.GutendexResponseDTO;
import com.alura.literature.service.JsonParserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteratureApplication implements CommandLineRunner {

    public static void main(String[] args) {
		SpringApplication.run(LiteratureApplication.class, args);
	}

    @Override
    public void run(String... args) {

        BookApiClient client = new BookApiClient();
        JsonParserService parser = new JsonParserService();

        String url = "https://gutendex.com/books/";

        String json = client.fetchBooks(url);

        GutendexResponseDTO response =
                parser.parse(json, GutendexResponseDTO.class);

        response.results().forEach(book ->
                System.out.println(book.title())
        );

    }
}
