package kata1;

import java.util.Date;

public class Person {

    private final String name;
    private final Date birthday;
    
    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return (int) (((((((getYear() / 1000) / 60) / 60) / 24) / 365)));
    }

    private long getYear() {
        Date now = new Date();
        return now.getTime() - birthday.getTime();
    }
    
}
