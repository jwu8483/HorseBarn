package jwuHB;

public class Mustang implements Horse{

    private String name;
    private int weight;

    public Mustang(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString()
    {
        return name;
    }
}
