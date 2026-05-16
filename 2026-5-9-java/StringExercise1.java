package Day16;

public class StringExercise1 {
    public static void main(String[] args) {
        String A = "abcde";
        String B = "acbed";
        boolean result = check(A, B);
        System.out.println(result);
    }

    //移动
    public static String rotate(String strA){
        String left = strA.substring(0,1);
        String right = strA.substring(1,strA.length());
        return right + left;
    }
    
    public static boolean check(String strA, String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;
    }
}
