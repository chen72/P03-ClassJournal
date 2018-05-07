package sg.edu.rp.c346.p03_classjournal;

import java.io.Serializable;

public class WeekCag implements Serializable {

    private String week;
    private String CAG;
    private String Image;

    public WeekCag(String week, String CAG, String image) {
        this.week = week;
        this.CAG = CAG;
        Image = image;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getCAG() {
        return CAG;
    }

    public void setCAG(String CAG) {
        this.CAG = CAG;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
