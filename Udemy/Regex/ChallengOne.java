package Udemy.Regex;


import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChallengOne {

  public static void main(String[] args) {
    String text = "I want a bike." ;
    String text2 = "I want a ball.";
//

    System.out.println(text.matches("I want a bike."));
    System.out.println(text2.matches("I want a \\w+."));
    System.out.println(text.matches("I want a (bike|ball)."));

      Pattern patternOne = Pattern.compile("I want a \\w+.");
      Matcher matcher = patternOne.matcher(text);
    System.out.println(matcher.matches());
    matcher = patternOne.matcher(text2);
    System.out.println(matcher.matches());
    System.out.println("**************Challenge-3**************");
    String challenge4 = "Replace all blanks with underscores.";
    System.out.println(challenge4.replaceAll("\\s","_"));
    System.out.println("**************Challenge-4**************");
    String challenge5 = "aaabccccccccdddefffg";
    System.out.println(challenge5.matches("[a-g]+"));
    System.out.println("**************Challenge-5**************");
    String challenge6 = "aaabccccccccdddefffg";
    System.out.println(challenge6.matches("^a{3}bc{8}d{3}ef{3}g$"));

    System.out.println("**************Challenge-6**************");
    String challenge7 = "abcd.135";
    System.out.println(challenge7.matches("^\\w+\\.\\d+$"));
    String testc7 = "a5.12a";
    System.out.println(testc7.matches("^\\w+\\.\\d+$"));
    System.out.println(testc7.matches("^[A-Z][a-z]\\.\\d+$"));
    System.out.println("**************Challenge-7**************");
    String testc8 = "abcd.135uvqz.7tzik.999";
    //Pattern testc8pattern = Pattern.compile("([a-d]).(\\d+)(\\w+).(\\d+)(\\w+).(\\d+)");
    Pattern testc8pattern2 = Pattern.compile("[a-zA-Z]+\\.(\\d+)");
    Matcher matcher1 = testc8pattern2.matcher(testc8);

    while(matcher1.find()){

      System.out.println("Occurences " + matcher1.group(1));

    }
    System.out.println("**************Challenge-8**************");

    String testc9 = "abcd.135\tuvqz.7\ttzik.999\n";
    Pattern patterntestc9 = Pattern.compile("[a-zA-z]+\\.(\\d+)\\s");
    Matcher matcher2 = patterntestc9.matcher(testc9);
    while(matcher2.find()){

      System.out.println("Occurrences :"+matcher2.group(1));
    }


    System.out.println("**************Challenge-9**************");

    String testc11 = "abcd.135\tuvqz.7\ttzik.999\n";
    Pattern patterntestc10 = Pattern.compile("[a-zA-z]+\\.(\\d+)\\s");
    Matcher matcher3 = patterntestc10.matcher(testc11);
    while(matcher3.find()){

      System.out.println("Occurrences : "+matcher3.group(1)+ " ,start indices :"
          + matcher3.start(1)+ " ,end indices :"+ (matcher3.end(1)-1));
    }


    System.out.println("**************Challenge-10**************");


    String testc12 = "{0,2},{0,5},{2,4},{12,16}";
    Pattern patterntestc11 = Pattern.compile("\\{(.+?)\\}");
   // Pattern patterntestc11 = Pattern.compile("\\{([0-9]+),([0-9]+)\\}");
    Matcher matcher4 = patterntestc11.matcher(testc12);
    while(matcher4.find()){

     // System.out.println(matcher4.group(1)+ " " +matcher4.group(2));
      System.out.println(matcher4.group(1));
    }


    System.out.println("**************Challenge-11**************");


    String zipcode = "80002" ;
    Pattern patternzip = Pattern.compile("^\\d{5}$");
    Matcher matcher5 = patternzip.matcher(zipcode);
    System.out.println(matcher5.matches());


    System.out.println("**************Challenge-12**************");


    String zipcode2 = "80002-1234" ;
    Pattern patternzip2 = Pattern.compile("^\\d{5}-\\d{4}");
    Matcher matcher52 = patternzip2.matcher(zipcode2);
    System.out.println(matcher52.matches());


    System.out.println("**************Challenge-13**************");


    String zipcode3 = "8000" ;
    Pattern patternzip3 = Pattern.compile("(^\\d{5}|^\\d{5}-\\d{4})");
    Matcher matcher523 = patternzip3.matcher(zipcode3);
    System.out.println(matcher523.matches());


    String number = String.valueOf(19);

    String value = String.valueOf(19);
    String[] stringarr = value.split("");
    System.out.println(stringarr[1]);






  }

}
