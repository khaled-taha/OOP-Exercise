public class Number {
    private int num;
    private static int even_count = 0;

    public Number(int num) {
        this.num = num;
        this.even_counter();
    }

    private void even_counter(){
        if(num % 2 == 0) even_count++;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        this.even_counter();
    }

    public static int getEven_count() {
        return even_count;
    }

    public int sumOfDigits(){
        String num = String.valueOf(this.num);
        int sum = 0;
        for(int i = 0; i < num.length(); i++){
            sum += (num.charAt(i) - '0'); // ASCII for [0 : 9] = [48 : 57]
        }
        return sum;
    }

    // Another Solution with integer.

//    public int sumOfDigits(){
//        int numCopy = num;
//        int sum = 0;
//        while(numCopy != 0){
//            sum += (numCopy % 10);
//            numCopy /= 10;
//        }
//        return sum;
//    }

    public static void main(String[] args) {
        Number number = new Number(123);
        System.out.println(number.sumOfDigits()); // 6

        Number number2 = new Number(12);
        Number number3 = new Number(10);
        Number number4 = new Number(11);

        System.out.println(Number.getEven_count()); // 2
    }
}
