import java.util.*;

public class Mydate {
    private int date;
    private int month;
    private int year;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
    public void setDate(String date){
        if((date.toLowerCase()).equals("first"))
            this.date = 1;
        if((date.toLowerCase()).equals("second"))
            this.date = 2;
        if((date.toLowerCase()).equals("third"))
            this.date = 3;
        if((date.toLowerCase()).equals("fourth"))
            this.date = 4;
        if((date.toLowerCase()).equals("fifth"))
            this.date = 5;
        if((date.toLowerCase()).equals("sixth"))
            this.date = 6;
        if((date.toLowerCase()).equals("seventh"))
            this.date = 7;
        if((date.toLowerCase()).equals("eighth"))
            this.date = 8;
        if((date.toLowerCase()).equals("ninth"))
            this.date = 9;
        if((date.toLowerCase()).equals("tenth"))
            this.date = 10;
        if((date.toLowerCase()).equals("eleventh"))
            this.date = 11;
        if((date.toLowerCase()).equals("twelfth"))
            this.date = 12;
        if((date.toLowerCase()).equals("thirteenth"))
            this.date = 13;
        if((date.toLowerCase()).equals("fourteenth"))
            this.date = 14;
        if((date.toLowerCase()).equals("fifteenth"))
            this.date = 15;
        if((date.toLowerCase()).equals("sixteenth"))
            this.date = 16;
        if((date.toLowerCase()).equals("seventeenth"))
            this.date = 17;
        if((date.toLowerCase()).equals("eighteenth"))
            this.date = 18;
        if((date.toLowerCase()).equals("nineteenth"))
            this.date = 19;
        if((date.toLowerCase()).equals("twentieth"))
            this.date = 20;
        if((date.toLowerCase()).equals("twenty-first"))
            this.date = 21;
        if((date.toLowerCase()).equals("twenty-second"))
            this.date = 22;
        if((date.toLowerCase()).equals("twenty-third"))
            this.date = 23;
        if((date.toLowerCase()).equals("twenty-fourth"))
            this.date = 24;
        if((date.toLowerCase()).equals("twenty-fifth"))
            this.date = 25;
        if((date.toLowerCase()).equals("twenty-sixth"))
            this.date = 26;
        if((date.toLowerCase()).equals("twenty-seventh"))
            this.date = 27;
        if((date.toLowerCase()).equals("twenty-eighth"))
            this.date = 28;
        if((date.toLowerCase()).equals("twenty-ninth"))
            this.date = 29;
        if((date.toLowerCase()).equals("thirtieth"))
            this.date = 30;
        if((date.toLowerCase()).equals("thirty-first"))
            this.date = 31;
    }


    public void setMonth(String month){
        switch (month.toLowerCase()){
            case "january":
                this.month = 1;
                break;

            case "february":
                this.month = 2;
                break;

            case "march":
                this.month = 3;
                break;

            case "april":
                this.month = 4;
                break;

            case "may":
                this.month = 5;
                break;

            case "june":
                this.month = 6;
                break;

            case "july":
                this.month = 7;
                break;

            case "august":
                this.month = 8;
                break;

            case "september":
                this.month = 9;
                break;

            case "october":
                this.month = 10;
                break;

            case "november":
                this.month = 11;
                break;

            case "december":
                this.month = 12;
                break;

            default:
                break;
        }
    }


    public void setYear(String year) {
        switch (year.toLowerCase()) {
            case "twenty-twenty":
                this.year = 2020;
                break;

            case "twenty-nineteen":
                this.year = 2019;
                break;

            case "twenty-eighteen":
                this.year = 2018;
                break;

            case "twenty-seventeen":
                this.year = 2017;
                break;

            case "twenty-sixteen":
                this.year = 2016;
                break;

            case "twenty-fifteen":
                this.year = 2015;
                break;

            default:
                break;
        }
    }

    //Constructor without parameters
    public Mydate() {
    }

    //Constructor with parameters
    public Mydate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public void inputDate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        String d = sc.nextLine();
        this.setDate(d);

        System.out.print("Enter month: ");
        String m = sc.nextLine();
        this.setMonth(m);

        System.out.print("Enter year: ");
        String y = sc.nextLine();
        this.setYear(y);
    }

    public void printDate(){
    
        System.out.print("My date (dd/mm/yyyy) is: ");
       
        System.out.println(this.getDate() + "/" + this.getMonth() + "/" + this.getYear());
    }

    public static void main(String[] args) {
    	Mydate dateList[] = new Mydate[4];

        dateList[0] = new Mydate(17, 7, 2020);
        dateList[1] = new Mydate(26, 3, 2019);
        dateList[2] = new Mydate(13, 10, 2017);
        
        for(int i = 0; i < dateList.length; i++)
            dateList[i].printDate();

    }
}