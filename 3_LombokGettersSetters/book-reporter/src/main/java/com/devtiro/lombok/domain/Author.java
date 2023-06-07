package com.devtiro.lombok.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * An Author of one or more {@link Book books}.
 *
 * Demonstrating on-variable @Getter and @Setter.
 */
public class Author {

    @Getter
    @Setter
    private String givenName;

    @Getter
    @Setter
    private String familyName;

    @Getter
    @Setter
    private Integer age;

    public Author() {
    }

    public Author(final String givenName, final String familyName, final Integer age) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(givenName, author.givenName) && Objects.equals(familyName, author.familyName) && Objects.equals(age, author.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(givenName, familyName, age);
    }

    @Override
    public String toString() {
        return "Author(" +
                "givenName=" + givenName +
                ", familyName=" + familyName +
                ", age=" + age +
                ')';
    }
}
