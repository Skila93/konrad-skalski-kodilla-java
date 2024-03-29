package com.kodilla.testing.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {
    @Mock
    private LibraryDatabase libraryDatabaseMock;
    @Test
    void testListBooksWithConditionsReturnList() {
// Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    @Disabled
    void testListBooksWithConditionMoreThan20() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(40, theListOfBooks40.size());
    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
            }
            return resultList;
        }
        @Test
    void testListBooksInHandsOfWhenUserHasSomeNumberOfBooks(){
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> zeroBooks = new ArrayList<>();
            List<Book> oneBook = generateListOfNBooks(1);
            List<Book> fiveBooks = generateListOfNBooks(5);
            LibraryUser marekNieczytalski = new LibraryUser("Marek", "Nieczytalski", "98052277889");
            LibraryUser michalSrednioczytalski = new LibraryUser("Michal", "Srednioczytalski", "92111277889");
            LibraryUser antekDuzoczytalski = new LibraryUser("Antek", "Duzoczytalski", "01040777889");
            when(libraryDatabaseMock.listBooksInHandsOf(marekNieczytalski)).thenReturn(zeroBooks);
            when(libraryDatabaseMock.listBooksInHandsOf(michalSrednioczytalski)).thenReturn(oneBook);
            when(libraryDatabaseMock.listBooksInHandsOf(antekDuzoczytalski)).thenReturn(fiveBooks);
        //When
            List<Book> theListOfBooksInHand0 = bookLibrary.listBooksInHandsOf(marekNieczytalski);
            List<Book> theListOfBooksInHand1 = bookLibrary.listBooksInHandsOf(michalSrednioczytalski);
            List<Book> theListOfBooksInHand5 = bookLibrary.listBooksInHandsOf(antekDuzoczytalski);
            //Then
            Assertions.assertEquals(0,theListOfBooksInHand0.size());
            Assertions.assertEquals(1,theListOfBooksInHand1.size());
            Assertions.assertEquals(5,theListOfBooksInHand5.size());
        }
    }