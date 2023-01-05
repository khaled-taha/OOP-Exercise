public class Date {
    private int day; // 1 - 31
    private int month; // 1 - 12
    private int year; // 1000 - 9999

    private int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int day, int month, int year) throws Exception{
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) throws Exception {
        if(! (day >= 1 && day <= this.month_days[this.month - 1]))
            throw new Exception("Invalid Day {"+ (this.month_days[this.month - 1] + 1) +"} for month {"+this.month+"}");
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) throws Exception {
        if(! (month >= 1 && month <= 12))
            throw new Exception("Invalid Month {"+this.month+"}");
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws Exception {
        if(! (year >= 1000 && year <= 9999))
            throw new Exception("Invalid Year {"+this.year+"}");
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date data = (Date) o;
        return day == data.day && month == data.month && year == data.year;
    }

    @Override
    public String toString() {
        return "Data{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public void addDay() throws Exception {
        if(this.month_days[this.month - 1] >= this.day + 1)
            this.day += 1;

        else {
            this.addMonth();
            this.day = 1;

        }
    }

    public void subDay() throws Exception {
        if(this.day - 1 <= 0){
            this.subMonth();
            this.day = this.month_days[this.month - 1];
        }
        else
            this.day -= 1;

    }


    private void addMonth() throws Exception {
        if(this.month + 1 >= 13){
            this.addYear();
            this.month = 1;
        }
        else
            this.month += 1;
    }

    private void addYear() throws Exception{
        if(this.year + 1 > 9999)
            throw new Exception("Invalid year 10000 \n Year must be between 1000 and 9999");
        else
            this.year += 1;
    }

    private void subMonth() throws Exception {
        if(this.month - 1 <= 0){
            this.subYear();
            this.month = 12;
        }
        else
            this.month -= 1;
    }

    private void subYear() throws Exception{
        if(this.year - 1 < 1000)
            throw new Exception("Invalid year 999 \n Year must be between 1000 and 9999");
        else
            this.year -= 1;
    }

    public boolean isMagic(){
        String date = "" + this.day + "" + this.month + "" + this.year;
        for(int i  = 0; i < date.length() - 1; i++){
            if(date.charAt(i) != date.charAt(i + 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            Date date = new Date(28, 12, 9999);
            System.out.println(date.toString());
            date.addDay();
            System.out.println(date.toString());
            date.addDay();
            System.out.println(date.toString());
            date.addDay();
            System.out.println(date.toString());
            date.addDay();
            System.out.println(date.toString());
            date.addDay();
            System.out.println(date.isMagic());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

