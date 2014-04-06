
public class ScoreCounter
{

    private int score;

    public void increase()
    {
        score++;
    }

    public void init()
    {
        score = 0;
    }

    public int getScore()
    {
        return score;
    }
}
