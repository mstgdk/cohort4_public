package liveClass.week7.lamdaa;

public class University {
    private String university;
    private String bolum;
    private  int ogrSyisi;
    private int notOrt;

    public University(String university, String bolum, int ogrSyisi, int notOrt) {
        this.university = university;
        this.bolum = bolum;
        this.ogrSyisi = ogrSyisi;
        this.notOrt = notOrt;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrSyisi() {
        return ogrSyisi;
    }

    public void setOgrSyisi(int ogrSyisi) {
        this.ogrSyisi = ogrSyisi;
    }

    public int getNotOrt() {
        return notOrt;
    }

    public void setNotOrt(int notOrt) {
        this.notOrt = notOrt;
    }

    @Override
    public String toString() {
        return "University{" +
                "univercity='" + university + '\'' +
                ", bolum='" + bolum + '\'' +
                ", ogrSyisi=" + ogrSyisi +
                ", notOrt=" + notOrt +
                '}';
    }
}
