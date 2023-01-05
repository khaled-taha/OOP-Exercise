public enum Months {
    January(31),
    February(28),
    March(31),
    April(30),
    May(31),
    June(30),
    July(31),
    August(31),
    September(30),
    October(31),
    November(30),
    December(31);

    private int days;
    private static final Months[] months = Months.values();

    private Months(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public static Months of(int month) throws Exception {
        if (month < 1 || month > 12) {
            throw new Exception("Invalid value for MonthOfYear: " + month);
        }
        return months[month - 1];
    }


    @Override
    public String toString() {
        return "Month{" +
                "Name=" + this.name() + ", " + 
                "Days=" + this.getDays() +
                '}';
    }

    public static void main(String[] args) {
        try {
            Months month = Months.of(1);
            System.out.println(month.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
