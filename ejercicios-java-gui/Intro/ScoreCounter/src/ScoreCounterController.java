
public class ScoreCounterController
{

    private ScoreCounter scoreCounter;              // modelo
    private ScoreCounterGUI scoreCounterGUI;        // vista

    public ScoreCounterController(ScoreCounter m, ScoreCounterGUI w)
    {
        scoreCounter = m;
        scoreCounterGUI = w;
    }

    public static void main(String[] args)
    {

        ScoreCounter scoreCounter = new ScoreCounter();
        ScoreCounterGUI scoreCounterGUI = new ScoreCounterGUI();
        ScoreCounterController cont = new ScoreCounterController( scoreCounter, scoreCounterGUI );
        scoreCounterGUI.registerController( cont );
        scoreCounterGUI.updateScore( scoreCounter.getScore() );
    }

    public void bumbUp()
    {
        scoreCounter.increase();
        scoreCounterGUI.updateScore( scoreCounter.getScore() );
    }

    public void zero()
    {
        scoreCounter.init();
        scoreCounterGUI.updateScore( scoreCounter.getScore() );
    }
}
