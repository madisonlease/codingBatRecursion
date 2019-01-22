public class runner {
    public void main(String args[]){
        //this is where we test all our functions!
        System.out.println(triangle(4));
    }

    public int triangle(int rows) {
        if (rows == 0){
            return 0;
        }
        return rows + triangle (rows-1);
    }

    public int fibonacci(int n) {
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci (n-2);
    }

    public int countHi(String str) {
        if (str.length()<2){
            return 0;
        }
        if (str.substring(0,2).equals("hi")){
            return countHi(str.substring (2)) + 1;
        }
        return countHi(str.substring(1));
    }

    public int sumDigits(int n) {
        if (n==0){
            return 0;
        }
        return n%10 + sumDigits(n/10);
    }

    public String pairStar(String str) {
        if (str.length()==0){
            return str;
        }
        if (str.length()==1){
            return str;
        }
        if (str.substring(0,1).equals(str.substring(1,2))){
            return str.substring(0,1) + "*" + pairStar(str.substring(1));
        }
        return str.substring(0,1) + pairStar(str.substring(1));
    }

    public String noX(String str) {
        if (str.length()==0){
            return str;
        }
        if (str.substring(0,1).equals("x")){
            return noX(str.substring(1));
        }
        return str.substring(0,1) + noX(str.substring(1));
    }

    public String stringClean(String str) {
        if (str.length()==0){
            return str;
        }
        if (str.length()==1){
            return str;
        }
        if (str.substring(0,1).equals(str.substring(1,2))){
            return stringClean(str.substring(1));
        }
        return str.substring(0,1) + stringClean(str.substring(1));
    }


    public String parenBit(String str){
        if (str.length()<2){
            return "";
        }
        if (str.substring(0,1).equals("(")){
            if ( str.substring(str.length()-1).equals(")")){
                return str;
            }
            return parenBit(str.substring(0,str.length()-1));
        }
        return parenBit(str.substring(1));
    }

}
