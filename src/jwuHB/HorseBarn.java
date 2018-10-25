package jwuHB;

public class HorseBarn {

    private Horse[] spaces;

    public HorseBarn(Horse[] spaces)
    {
        this.spaces = spaces;
    }

    public int findHorseSpace(String name)
    {
        for(int i = 0; i < this.spaces.length; i++)
        {
            if (this.spaces[i]!= null && name.equals(this.spaces[i].getName()))
            {
                return i+1;
            }
        }
        return -1;
    }

    public void consolidate()
    {
        List<Horse> horseList = new ArrayList<Horse>();
        for (Horse h : this.spaces)
        {
            if(h != null) horseList.add(h);
        }
        for(int i = 0; i < this.spaces.length; i++)
        {
            this.spaces[i] = null;
        }
        for(int i = 0; i < horseList.size(); i++)
        {
            this.spaces[i] = horseList.get(i);
        }
    }

    public String toString()
    {
        String result = "";
        for(int i = 0; i < this.spaces.length; i++)
        {
            result += "[" + this.spaces[i] + "] ";
        }
        return result;
    }
}
