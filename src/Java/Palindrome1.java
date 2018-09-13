package Java;

public class Palindrome1 {
    Palindrome1 palindrome1;
    public String reverseInput(String input)
    {
        String revString="";
        if(input==null)
            return null;
        for(int index=input.length()-1;index>=0;index--)
            revString=revString+input.charAt(index);
        return revString;
    }
    public String checkPalindrome(String input)
    {
        palindrome1=new Palindrome1();
        String revString=palindrome1.reverseInput(input);
        if(revString.equals(input))
            return "yes";
        else
            return "no";
    }
}
