//Method Overloading
package edge_day4.newpackage;



    class Time{
        
        private int hour, minute, second;
        
        void Time(){
            //hour = h;
            //minute = m;
            //second = s;
            timeShow();
        }
        
        void Time(int h, int m, int s){
            hour = h;
            minute = m;
            second = s;
            timeShow();
        }
        
        void Time(int h){
            hour = h;
            timeShow();
        }
        
        void timeShow(){
            System.out.println(hour+" : "+ minute+" : " + second);
        }
    }
    public class TimeExample1 {
        
        public static void main(String[] Args){
            Time t1 = new Time();
            t1.Time();
            Time t2 = new Time();
            t2.Time(40,20,30);
            Time t3 = new Time();
            t3.Time(40);
            Time t4 = new Time();
            t4.Time(t2);
        }
}
/*Method Overloading
package edge_day4.newpackage;



    class Time{
        
        private int hour, minute, second;
        
        void Time(){
            //hour = h;
            //minute = m;
            //second = s;
            timeShow();
        }
        
        void Time(int h, int m, int s){
            hour = h;
            minute = m;
            second = s;
            timeShow();
        }
        
        void Time(int h){
            hour = h;
            timeShow();
        }
        
        void timeShow(){
            System.out.println(hour+" : "+ minute+" : " + second);
        }
    }
    public class TimeExample1 {
        
        public static void main(String[] Args){
            Time t1 = new Time();
            t1.Time();
            Time t2 = new Time();
            t2.Time(40,20,30);
            Time t3 = new Time();
            t3.Time(40);
            Time t4 = new Time();
            t4.Time(t2);
        }
}
package edge_day4.newpackage;

class Time {
    private int hour, minute, second;

    // Default constructor
    Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
        timeShow();
    }

    // Constructor with hour, minute, second
    Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
        timeShow();
    }

    // Constructor with only hour
    Time(int h) {
        this.hour = h;
        this.minute = 0; // Default minute and second
        this.second = 0;
        timeShow();
    }

    // Method to display time
    void timeShow() {
        System.out.println(hour + " : " + minute + " : " + second);
    }

    // If you want to overload with a Time object, you could have a method like this:
    void setTime(Time t) {
        this.hour = t.hour;
        this.minute = t.minute;
        this.second = t.second;
        timeShow();
    }
}

public class TimeExample1 {
    public static void main(String[] Args) {
        // Using the default constructor
        Time t1 = new Time(); // Output: 0 : 0 : 0

        // Using the constructor with hour, minute, second
        Time t2 = new Time(40, 20, 30); // Output: 40 : 20 : 30

        // Using the constructor with hour
        Time t3 = new Time(40); // Output: 40 : 0 : 0

        // Using the method to copy time from another object
        Time t4 = new Time(); // Using the default constructor
        t4.setTime(t2); // Output: 40 : 20 : 30
    }
}
*/