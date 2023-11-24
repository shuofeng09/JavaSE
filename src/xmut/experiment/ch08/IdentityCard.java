package xmut.experiment.ch08;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author 朔风
 * @date 2023-11-24 10:50
 */
public class IdentityCard {
    private String idCard;

    private Integer age;

    private LocalDate birth;

    public IdentityCard(String idCard) throws ParseException {
        this.idCard = idCard;
        String dateStr = idCard.substring(6, 14);
        Integer year = Integer.valueOf(dateStr.substring(0, 4));
        Integer mouth = Integer.valueOf(dateStr.substring(4, 6));
        Integer day = Integer.valueOf(dateStr.substring(6));
        this.birth = LocalDate.of(year, mouth, day);
        LocalDate now = LocalDate.now();
        this.age = birth.until(now).getYears();
    }


    public void printAge() {
        System.out.println("年龄：" + this.age);
    }

    public void printBirth() {
        String format = this.birth.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日"));
        System.out.println("生日：" + format);
    }


}

