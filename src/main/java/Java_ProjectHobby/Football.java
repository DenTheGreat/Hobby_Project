package Java_ProjectHobby;

public class Football extends Hobby {
    private String favorite_team;
    private int wins_this_season;

    public String getFavorite_team() {
        return favorite_team;
    }

    public void setFavorite_team(String favorite_team) {
        this.favorite_team = favorite_team;
    }

    public int getWins_this_season() {
        return wins_this_season;
    }

    public void setWins_this_season(int wins_this_season) {
        this.wins_this_season = wins_this_season;
    }

    public Football(String hobby_name, int cost_per_year, String favorite_team, int wins_this_season) {
        super(hobby_name, cost_per_year);
        this.favorite_team = favorite_team;
        this.wins_this_season = wins_this_season;
    }

    @Override
    public String toString() {
        return "Football{" +
                "favorite_team='" + favorite_team + super.toString()+ '\'' +
                ", wins_this_season=" + wins_this_season +
                '}';
    }

    @Override
    public void tell_about_hobby(int variable) throws hobby_exception {
        if(variable<20){
            throw new hobby_exception("Footbal error, variable<20");
        }
        System.out.println(this.toString());
        System.out.println("My favorite hobby is football");
    }
}
