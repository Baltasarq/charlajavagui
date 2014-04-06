
public class SelectionController {

    private SelectionGUI myView;

    public SelectionController(SelectionGUI myView)
    {
        this.myView = myView;
    }

    public static void main(String[] args)
    {
        SelectionGUI myView = new SelectionGUI();
        SelectionController myCont = new SelectionController( myView );
        myView.registerController( myCont );
    }

    public void select()
    {
        String mySel = myView.giveSelection();

        if ( myView.biscuitSelected() ) {
            mySel = mySel.concat( " Biscuit" );
        }
        
        if ( myView.breadSelected() ) {
            mySel = mySel.concat( " Bread" );
        }
        myView.setResult( mySel );
    }
}
