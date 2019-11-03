package Java_ProjectHobby;

public abstract class Hobby {
    private String hobby_name;
    private int cost_per_year;

    public String getHobby_name() {
        return hobby_name;
    }

    public void setHobby_name(String hobby_name) {
        this.hobby_name = hobby_name;
    }

    public int getCost_per_year() {
        return cost_per_year;
    }

    public void setCost_per_year(int cost_per_year) {
        this.cost_per_year = cost_per_year;
    }

    public Hobby(String hobby_name, int cost_per_year) {
        this.hobby_name = hobby_name;
        this.cost_per_year = cost_per_year;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "hobbyname='" + hobby_name + '\'' +
                ", costperyear=" + cost_per_year +
                '}';
    }
    public abstract void tell_about_hobby(int variable) throws hobby_exception  ;


}
