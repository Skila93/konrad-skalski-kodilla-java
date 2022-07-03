package com.kodilla.stream;

//import com.kodilla.stream.beautifier.PoemBeautifier;
//import com.kodilla.stream.iterate.NumbersGenerator;
//
//import com.kodilla.stream.person.People;
//
//import java.util.List;
//import java.util.Map;

//import com.kodilla.stream.book.BookDirectory;
//import com.kodilla.stream.book.Book;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultForumUsers = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getYearOfBirth() < 2002)
                .filter(user -> user.getQuantityOfPublishedPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUniqueUserIdentifier, user -> user));


        theResultForumUsers.entrySet().stream().map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        /*BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/

        /*BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));
        System.out.println("# elements: "+ theResultListOfBooks.size());
        theResultListOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/


        /*People.getList().stream()
                .map(s -> s.toUpperCase())
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);*/


        /*System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/

        /*PoemBeautifier poemBeautifier = new PoemBeautifier();
        String beautifulText = poemBeautifier.beautify("Example Text to upper case", (text -> text.toUpperCase()));
        System.out.println(beautifulText);

        String beautifulText2 = poemBeautifier.beautify("Example Text to add abc", (text -> "ABC " + text + " ABC"));
        System.out.println(beautifulText2);

        String beautifulText3 = poemBeautifier.beautify("Example Text to add exclamations mark", (text -> text.replace(" ", " !!! ")));
        System.out.println(beautifulText3);

        String beautifulText4 = poemBeautifier.beautify("Example Text to lowe case", (text -> text.toLowerCase()));
        System.out.println(beautifulText4);
    }*/
    }
}