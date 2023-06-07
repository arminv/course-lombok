package com.devtiro.lombok.domain;

import lombok.*;

import java.util.Objects;

/**
 * A Book written by an {@link Author}.
 *
 * Demonstrating on-class @Getter and @Setter.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Book {

    private String title;

    private Integer yearPublished;

    private Author author;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(yearPublished, book.yearPublished) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, yearPublished, author);
    }

}
