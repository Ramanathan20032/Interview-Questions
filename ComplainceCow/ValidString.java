package ComplainceCow;

public class ValidString {
    public static void main(String[] args) {
        String str = "this is not not not is";
        System.out.println(isValid(str));
    }

    static boolean isValid(String str) {
        int isCount = 0;
        int notCount = 0;

        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == 'i' && str.charAt(i+1) == 's'){
                isCount++;
            }
        }
        for (int i = 0 ; i < str.length() ; i++){
            if (str.charAt(i) == 'n' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 't'){
                notCount++;
            }
        }
        if(isCount == notCount){
            return true;
        }
        return false;
    }
}
