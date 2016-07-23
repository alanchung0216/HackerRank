package com.java_string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
    String pattern = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
Pattern r = Pattern.compile(pattern,Pattern.MULTILINE+Pattern.CASE_INSENSITIVE);

input =input.replaceAll(m.group(),m.group(1));

I find it is very helpful to go through the Java tutorial to understand the grouping concept: https://docs.oracle.com/javase/tutorial/essential/regex/groups.html
The pattern above basically means to capture any pattern where a word ((\w+)) is followed by non-word character (e.g., space) then by itself again (\1 is the backreference to (\w+) earlier).
So for the example input"Goodbye bye bye world world world", the matcher will find 3 patterns:
1) Goodbye
2) bye bye
3) world world world
Then for each of them, we can call replaceAll to replace the whole group with the first group (i.e., the first word - m.group(1)).
Hope this helps.

this is test input
5
Goodbye bye bye world world world
Swapnil went went to to to his business
Rana is is the the best player in eye eye game
in inthe
Hello hello Ab aB
*/
public class regex_DuplicateWords
{
    public static void main(String[] args) throws FileNotFoundException{

        //String pattern = ~~~Complete this line~~~
        //String pattern = "([A-Z][a-z])(.+)"
        String pattern = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
        //Pattern r = Pattern.compile(pattern, ~~~Complete this line~~~);
        Pattern r = Pattern.compile(pattern, Pattern.MULTILINE+Pattern.CASE_INSENSITIVE);
        File file = new File(args[0]);
        Scanner in = new Scanner(file);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String input = in.nextLine();
            Matcher m = r.matcher(input);
            boolean findMatch = true;
            while(m.find( )){
                input = input.replaceAll(m.group(),m.group(1));
                findMatch = false;
            }
            System.out.println(input);
            testCases--;
        }
    }
}
