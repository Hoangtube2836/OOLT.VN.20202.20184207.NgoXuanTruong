public class DateTest {
    public static void main(String[] args) {
        MyDate dateList[] = new MyDate[3];

        dateList[0] = new MyDate(17, 8, 2021);
        dateList[1] = new MyDate(26, 03, 2020);
        dateList[2] = new MyDate(13, 10, 2021);
        
        DateUtils.SortDates(dateList);

      
        for(int i = 0; i < dateList.length; i++)
            dateList[i].printDate();
        for(int i = 0; i < dateList.length; i++)
            dateList[i].printDate1();
        for(int i = 0; i < dateList.length; i++)
            dateList[i].printDate2();
        DateUtils.SortDates(dateList);

    }
}
