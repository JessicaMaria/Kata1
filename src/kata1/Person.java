package kata1;

import java.util.Date;

public class Person {

    private final String name;
    private final Date birthday;
    private final long MILLISECONDS_PER_YEAR;
    private final Date now;
    
    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
        this.MILLISECONDS_PER_YEAR = 1000 * 60 * 60 * 24 * 365;
        this.now = new Date();
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return millisecondsToYears(getAgeInMilliseconds());
    }
    
    private int millisecondsToYears(long milliseconds){
        return (int) (milliseconds / MILLISECONDS_PER_YEAR);
    }
    
    private long getAgeInMilliseconds(){
        return now.getTime() - birthday.getTime();
    }
    
}
