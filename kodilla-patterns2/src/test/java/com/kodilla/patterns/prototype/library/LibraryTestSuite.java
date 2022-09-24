package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //Given
        Library library = new Library("Library number one");;
        Book book1 = new Book("Gone with the wind", "M. Mitchell", LocalDate.of(1936,05,01));
        Book book2 = new Book("In Desert and Wilderness", "H. Sienkiewicz", LocalDate.of(1911,8,20));
        Book book3 = new Book("Java Programming for beginners", "Will Norton", LocalDate.of(2018,2,2));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library clonedLibarary = null;
        try {
            clonedLibarary = library.shallowCopy();
            clonedLibarary.setName("Library number two - shallow clone");
        }catch (CloneNotSupportedException e)
        {
            System.out.println(e);
        }

        Library deepClonedLibarary = null;
        try {
            deepClonedLibarary = library.deepCopy();
            deepClonedLibarary.setName("Library number three - deep clone");
        }catch (CloneNotSupportedException e)
        {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book3);

        //Then
        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibarary.getBooks().size());
        assertEquals(3, deepClonedLibarary.getBooks().size());
        assertNotEquals(library.getBooks().size(), deepClonedLibarary.getBooks().size());
        assertNotEquals(clonedLibarary.getBooks().size(), deepClonedLibarary.getBooks().size());
        assertEquals(library.getBooks().size(), clonedLibarary.getBooks().size());
        }

}
