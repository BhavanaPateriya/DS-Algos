package PlayFairCypher;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;


public class Encrypt {

  // This functions work in creating a final string with key
  // and rest of alphabets
  // This is main entry point for the encrypt and decrypt methods

  public String generate5dString(String key, String text, String flag) {

    String stringWithoutIJ = "abcdefghklmnopqrstuvwxyz";
    String stringWithI = "abcdefghiklmnopqrstuvwxyz";
    String[] splitValue;

    if (key.toLowerCase().contains("i") || key.toLowerCase().contains("j")) {
      String newKeyWithJ = key + stringWithoutIJ;
      splitValue = newKeyWithJ.split("");

    } else {
      String newKeyWithI = key + stringWithI;
      splitValue = newKeyWithI.split("");
    }
    LinkedHashSet<String> distinctWord = new LinkedHashSet<>();
    for (int i = 0; i < splitValue.length; i++) {

      distinctWord.add(splitValue[i]);

    }
    String[][] matrix = create5dMatrix(distinctWord);
    // Calling encrypt and decrypt based on method
    if (!flag.equals("yes")) {
      return getEncryptRule(text, matrix);
    } else {

      return getDecryptRule(text, matrix);
    }
  }

 // After creating string from the above method ,
 // 2d matrix is poplulated by this method
  private String[][] create5dMatrix(LinkedHashSet<String> word) {

    List<String> convertToArray = new ArrayList<>(word);

    String[][] matrix = new String[5][5];
    int counter = 0;
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        String getWord = convertToArray.get(counter);
        matrix[row][col] = getWord;
        counter++;

      }
    }

    //System.out.println(Arrays.deepToString(matrix));
    return matrix;

  }

 // This function implement encrypt rule
  public String getEncryptRule(String text, String[][] matrix) {

    // The plaintext is split into pairs of two letters (digraphs).
    // If there is an odd number of letters, a Z is added to the last letter.

    String inputWord = text.replaceAll("\\s", "");
    StringBuilder stringBuilder = new StringBuilder(inputWord);
    int counter = 0;
    for (int i = 0; i < inputWord.length() - 1; i++) {

      if (inputWord.charAt(i) == inputWord.charAt(i + 1)) {

        stringBuilder.insert(i + 1 + counter, 'x');
        counter++;
      }
    }
    inputWord = stringBuilder.toString();
    String replacedWord;
    if (inputWord.length() % 2 != 0) {
      replacedWord = inputWord + "x";
    } else {
      replacedWord = inputWord;
    }

    // take two characters each and pass to the rule block
    String[] splitReplacedWord = replacedWord.split("");
    String result;
    StringBuilder sb = new StringBuilder();
    for (int index = 0; index < splitReplacedWord.length - 1; index++) {
      String firstChar = splitReplacedWord[index];
      String secondChar = splitReplacedWord[index + 1];
      // calling encrypt rule block here
      result = doEncrypt(firstChar, secondChar, matrix);
      sb.append(result);
      index++;
    }

    return sb.toString();

  }

  // this is entry point for implementing decrypt rule
  public String getDecryptRule(String encryptText, String[][] matrix) {

    // take two characters each and pass to the rule block
    String[] splitEncryptText = encryptText.split("");
    String result;
    StringBuilder sb = new StringBuilder();
    for (int index = 0; index < splitEncryptText.length - 1; index++) {
      String firstChar = splitEncryptText[index];
      String secondChar = splitEncryptText[index + 1];
      // decrypt method is called here
      result = doDecrypt(firstChar, secondChar, matrix);
      sb.append(result);
      index++;
    }
    //for loop to make sure that no x which was added earlier should be removed
    for (int i = 0; i < sb.length(); i++) {

      int positionOfX = sb.toString().indexOf('x');
      if (positionOfX != -1 && positionOfX != sb.toString().length() - 1
          && sb.charAt(positionOfX - 1) == sb.charAt(positionOfX + 1)
      ) {

        sb.deleteCharAt(positionOfX);

      }
    }
    // If the length is not even , then the x is added at the last
    // removing by this block of code
    if (sb.charAt(sb.length() - 1) == 'x') {

      sb.deleteCharAt(sb.length() - 1);
      return sb.toString();
    }
    return sb.toString();
  }

// Encrypt rules applied here
  private String doEncrypt(String firstWord, String secondWord, String[][] matrix) {

    int row1 = 0;
    int row2 = 0;
    int col1 = 0;
    int col2 = 0;
    String resultantOne;
    String resultantTwo;
    if (firstWord.equals(secondWord)) {

      System.out.println(firstWord + "" + secondWord);
    }

    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix.length; col++) {
        if (matrix[row][col].equals(firstWord)) {
          row1 = row;
          col1 = col;
        } else if (matrix[row][col].equals(secondWord)) {
          row2 = row;
          col2 = col;
        }
      }
    }
    //  If both the letters are in the same row
    // Take the letter to the right of each one
    // (going back to the leftmost if at the rightmost position).

    if (row1 == row2) {
      if (col1 == 4) {

        resultantOne = matrix[row1][0];
        resultantTwo = matrix[row2][col2 + 1];
        return resultantOne + resultantTwo;


      } else if (col2 == 4) {
        resultantOne = matrix[row1][col1 + 1];
        resultantTwo = matrix[row2][0];
        return resultantOne + resultantTwo;
      } else {

        resultantOne = matrix[row1][col1 + 1];
        resultantTwo = matrix[row2][col2 + 1];
        return resultantOne + resultantTwo;
      }
      // If both the letters are in the same column:
      // Take the letter below each one
      // (going back to the top if at the bottom).

    } else if (col1 == col2) {
      if (row1 == 4) {

        resultantOne = matrix[0][col1];
        resultantTwo = matrix[row2 + 1][col2];
        return resultantOne + resultantTwo;

      } else if (row2 == 4) {
        resultantOne = matrix[row1 + 1][col1];
        resultantTwo = matrix[0][col2];
        return resultantOne + resultantTwo;
      } else {

        resultantOne = matrix[row1 + 1][col1];
        resultantTwo = matrix[row2 + 1][col2];
        return resultantOne + resultantTwo;
      }
    //If neither of the above rules is true:
    } else {
      resultantOne = matrix[row1][col2];
      resultantTwo = matrix[row2][col1];
      return resultantOne + resultantTwo;
    }

  }
  //Decrypt rule is applied here
  public String doDecrypt(String firstWord, String secondWord, String[][] matrix) {

    int row1 = 0;
    int row2 = 0;
    int col1 = 0;
    int col2 = 0;
    String resultantOne;
    String resultantTwo;
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix.length; col++) {
        if (matrix[row][col].equals(firstWord)) {
          row1 = row;
          col1 = col;
        } else if (matrix[row][col].equals(secondWord)) {
          row2 = row;
          col2 = col;
        }
      }

    }

    //If both the letters are in the same row:
    // Take the letter to the left of each one
    // (going back to the rightmost if at the leftmost position).
    if (row1 == row2) {
      if (col1 == 0) {

        resultantOne = matrix[row1][4];
        resultantTwo = matrix[row2][col2 - 1];
        return resultantOne + resultantTwo;

      } else if (col2 == 0) {
        resultantOne = matrix[row1][col1 - 1];
        resultantTwo = matrix[row2][4];
        return resultantOne + resultantTwo;
      } else {

        resultantOne = matrix[row1][col1 - 1];
        resultantTwo = matrix[row2][col2 - 1];
        return resultantOne + resultantTwo;
      }
    } else if (col1 == col2) {

      if (row1 == 0) {
        resultantOne = matrix[4][col1];
        resultantTwo = matrix[row2 - 1][col2];
        return resultantOne + resultantTwo;

      } else if (row2 == 0) {
        resultantOne = matrix[row1 - 1][col1];
        resultantTwo = matrix[4][col2];
        return resultantOne + resultantTwo;
      } else {

        resultantOne = matrix[row1 - 1][col1];
        resultantTwo = matrix[row2 - 1][col2];
        return resultantOne + resultantTwo;
      }
    } else {
      resultantOne = matrix[row1][col2];
      resultantTwo = matrix[row2][col1];
      return resultantOne + resultantTwo;
    }

  }

}

























