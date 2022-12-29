package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest(){
        //Given
        Book book1 = new Book("Sienkiewicz", "Quo Vadis", 2002, "AFANA778899");
        Book book2 = new Book("Tolkien", "Wladca Pierscieni", 1999, "BBCCD123123");
        Book book3 = new Book("Tyrmand", "Zły", 2015, "SZOLO555000");
        Set<Book> bookSet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        //Then
        int calculated = medianAdapter.publicationYearMedian(bookSet);
        assertEquals(calculated, 2002);
    }
}
