/*
 * Name: [YOUR NAME HERE]
 * South Hills Username: [YOUR SOUTH HILLS USERNAME HERE]
 */

import java.util.Scanner;

public class Main
{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        String quizName = givemeQuizName();
        while(!quizName.equalsIgnoreCase("quit"))
        {
            quizName = detailLoop(quizName);
        }
        endofJob();
    }
    public static String givemeQuizName()
    {
        return prompting("Enter");
    }
    public static String detailLoop(String quizNm)
    {
        System.out.println(quizNm);
        int parts = 5;
        int questions = 3;
        String partLabel = "Part ";
        String line = "._____";
        for(int i=0;i<parts;i++)
        {
            System.out.println(partLabel + i);
            for(int j = 0;j<questions;j++)
            {
                System.out.println(j + line);
            }
        }
        quizNm = prompting("Enter next");
        return quizNm;
    }

    public static String prompting(String msg)
    {
        System.out.print(msg + " quiz name or enter 'quit' to quit: ");
        return input.nextLine();
    }
    public static void endofJob()
    {
        input.close();
    }
}