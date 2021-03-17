
public class DateTest {
	public static void main(String[] args) {
	Mydate dateList[] = new Mydate[4];

    dateList[0] = new Mydate(17, 7, 2020);
    dateList[1] = new Mydate(26, 3, 2019);
    dateList[2] = new Mydate(13, 10, 2017);

    for(int i = 0; i < dateList.length; i++)
        dateList[i].printDate();

}
}
