package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

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