package PlayFairCypher;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

// Main class to call methods
  public static void main(String[] args) {

    Encrypt encrypt = new Encrypt();
    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter key :");
    String key = scan.next();
    scan.nextLine();
    System.out.print("Please enter message to encrypt :");
    String text = scan.nextLine();
    String[] splitText = text.split("");
    Map<Integer, String> map = new HashMap<>();
    for (int i = 0; i < splitText.length; i++) {
      if (splitText[i].equals("j") && !key.contains("j")) {
        text = text.replace('j', 'i');
        map.put(i, splitText[i]);
      }
      if ((splitText[i].equals("i")) && (key.contains("j"))) {
        text = text.replace('i', 'j');
        map.put(i, splitText[i]);
      }
    }
    String encryptedString = encrypt.generate5dString(key, text, "no");
    System.out.println(encryptedString);
    System.out.print("Do you want to decrypt (yes/no) :");
    String decryptFlag = scan.nextLine();
    if (decryptFlag.equals("yes")) {
      if (!map.isEmpty()) {
        String returnedString = encrypt.generate5dString(key, encryptedString, "yes");
        StringBuilder stringval = new StringBuilder(returnedString);
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
          int position = entry.getKey();
          String value = entry.getValue();
          if (value.equals("j")) {

            stringval.setCharAt(position, 'j');

          }
          if (value.equals("i")) {
            stringval.setCharAt(position, 'i');
          }
        }
        System.out.println(stringval.toString());
      } else {
        System.out.println(encrypt.generate5dString(key, encryptedString, "yes"));
      }
    }

  }

}
