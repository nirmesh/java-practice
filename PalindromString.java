public class PalindromString {
    public static void main(String[] args) {

        String rev="";
        String s="deepak";
        for (int i=s.length()-1;i>=0;i--){
            rev = rev+ s.charAt(i);

        }
        if(s.equals(rev)){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not palindrom");
        }

    }
//
//    public static boolean checkPalindrome(String s){
//
//
//    }


}

