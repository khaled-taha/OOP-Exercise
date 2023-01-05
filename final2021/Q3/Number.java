package final2021.Q3;

public class Number {

    private int num;

    public Number(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    /*
    A factor is a number that divides the given number without any
    remainder. Factors of a number can be referred to as numbers or
    algebraic expressions that evenly divide a given number/expression.
    The factors of a number can either be positive or negative.
    For example, let's check for the factors of 8. Since 8 can be
    factorized as 1 × 8 and 2 × 4 and we know that the product of two
    negative numbers is a positive number only. Therefore, the factors
    are 8 are actually 1, -1, 2, -2, 4, -4, 8 and -8. But when it comes to
    problems related to the factors, only positive numbers are
    considered, that too a whole number and a non-fractional number
     */
    public void printFactors() {
        for(int i = 1; i <= this.num / 2; i++){
            if(num % i == 0) System.out.println(i + " ");
        }
        System.out.println(num);
    }
    
    public boolean isArmStrong(){
        // Solution 1
        int result = 0;
        String num = String.valueOf(this.num);
        for(int i = 0; i < num.length(); i++){
            result += Math.pow((num.charAt(i) - '0'), 3);
        }
        if(this.num == result) return true;
        return false;
        
        /*
        // Solution 2
        int result = 0;
        int copy = this.num;
        
        while(copy != 0){
            result += Math.pow(copy % 10, 3);
            copy /= 10;
        }
        if(this.num == result) return true;
        return false;
        
        */
    }
   
    
    public static void main(String[] args) {
        Number n = new Number(371);
        System.out.println(n.isArmStrong());
        n.printFactors();
    }
}
