public class DiceController {
  private Dice model;
  private DiceGUI myView;

  public DiceController(Dice model, DiceGUI myView) {
    this.model = model;
    this.myView = myView;
  }
  public static void main(String[] args) {
    Dice myDice = new Dice();
    DiceGUI myView = new DiceGUI();
    DiceController cont = new DiceController(myDice, myView);
    myView.registerController(cont);
  }
  public void myCast() {
    myView.putResult(model.givePip());
  }
}
