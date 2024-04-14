public class CharSearchInString {
    public static void main(String[] args) {
        String name="Adheesh";
        char element='A';
        int ans=CharSearch(name,element);
        boolean ANS=CharSeach(name,element);
        System.out.println("index="+ans+"\n"+ANS);
    }
    static int CharSearch(String str,char element){
        if(str.isEmpty()){
            return -1;
        }
        for (int index = 0; index <str.length() ; index++) {
            if (element==str.charAt(index)){
                return index;
            }
        }
        return -1;
    }
    static boolean CharSeach(String str,char element) {
        if (str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (element == str.charAt(i)) {
                return true;
            }
        }
        return false;

    }
    static boolean CharSeach2(String str,char element) {
        if (str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (element == c) {
                return true;
            }
        }
        return false;

    }
}
