package Java_ProjectHobby;

public class Fishing extends Hobby {
    private float fishweight;

    public Fishing(String hobbyname, int costperyear) {
        super(hobbyname, costperyear);
    }

    @Override
    public String toString() {
        return "Fishing{" + super.toString() +
                "fishweight=" + fishweight +
                '}';
    }

    public float getFishweight() {
        return fishweight;
    }

    public void setFishweight(float fishweight) {
        this.fishweight = fishweight;
    }

    public Fishing (float fishweight, String hobby_name, int cost_per_year) {
        super(hobby_name, cost_per_year);
        this.fishweight = fishweight;
    }

    @Override
    public void tell_about_hobby() {
        System.out.println(this.toString());
        System.out.println("My favorite hobby is fishing");
    }
}
