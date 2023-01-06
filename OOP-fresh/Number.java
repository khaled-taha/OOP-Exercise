public class Number {
    private int num;
    private static int even_count = 0;
    private boolean odd = true;

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
    
    private void even_counter(){
        if(num % 2 == 0 && odd) {
                even_count++;
                this.odd = false;

        }else if(!odd){
                even_count--;
                this.odd = true;
        }
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

        Number number = new Number(1);
        Number number2 = new Number(2);
        Number number3 = new Number(2);
        Number number4 = new Number(2);

        System.out.println(Number.even_count); // 3
        number.setNum(2); // 4
        System.out.println(Number.even_count); // 4
        number4.setNum(1); // 3
        System.out.println(Number.even_count); // 3
        number4.setNum(2); // 4
        System.out.println(Number.even_count); // 4
    }
}
