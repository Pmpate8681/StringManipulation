import java.util.Arrays;

public class StringManipulation{
  
  // A method that reverses a String
  public String reverseString(String word)
  {
      char[] enteredWord = word.toCharArray();
      char[] reversedWord = new char[word.length()];
      int controlledIndex = 0;
    
    if(isString(word.length()))
    {
      for(int i = enteredWord.length-1; i >= 0; i--)
      {
        reversedWord[controlledIndex] = enteredWord[i];
        controlledIndex++;
      }
    }
    return new String(reversedWord);
    
  }
  
  // A method that checks to see if a String is classified as a Palindrome
  public boolean isPalindrome(String word)
  {
     String reversedWord = "";
     
     for(int i = word.length()-1; i >= 0; i--)
     {
       reversedWord += word.charAt(i);
     }
     
     return reversedWord.equals(word);
   }
  
  // A method that checks to see if a String is empty
  private boolean isString(int size){
    return size > 0;
  }
}