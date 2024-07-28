package com.org.project.minor_project.DTO;

import com.org.project.minor_project.Model.Author;
import com.org.project.minor_project.Model.Book;
import com.org.project.minor_project.Model.BookType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BookRequest {

    @NotBlank(message = "book Title should not be blank")
    private String bookTitle;

    @NotBlank(message = "book No should not be blank")
    private String bookNo;

    @NotBlank(message = "Author name should not be blank")
    private String authorName;

    @NotBlank(message = "Author Email should not be blank")
    private String authorEmail;

    @NotNull(message = "book type should not be blank")
    private BookType type;

    @Positive(message = "security amount should be positive")
    private int securityAmount;

    public Author toAuthor(){
        return Author.
                builder().
                email(this.authorEmail).
                name(this.authorName).
                build();
    }

    public Book toBook() {
        return Book.
                builder().
                bookNo(this.bookNo).
                title(this.bookTitle).
                securityAmount(this.securityAmount).
                bookType(this.type).
                build();
    }
}
