package studio.countingCharaaters.java;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void characterCount(String inputString){
//    String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";


    HashMap<Character, Integer> characterCount = new HashMap<Character, Integer>();
    Scanner input = new Scanner(System.in);
        char[] charactersInString = inputString.toCharArray();

        //checking each char of strArray

        for (char t : charactersInString)
        {
            if(characterCount.containsKey(t))
            {
                //If char 'c' is present in charCountMap, incrementing it's count by 1

                characterCount.put(t, characterCount.get(t)+1);
            }
            else
            {
                //If char 'c' is not present in charCountMap,
                //putting 'c' into charCountMap with 1 as it's value

                characterCount.put(t, 1);
            }
        }
        System.out.println(inputString+"\n : "+characterCount);
    }

  public static void main(String[] args)
    {
        characterCount("If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there");

    }
    }



