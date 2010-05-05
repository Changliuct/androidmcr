lass <code>Audiveris</code> is simply the entry point to OMR, which
 * delegates the call to {@link omr.Main#main}.
 *
 * @author Herv&eacute; Bitteur
 * @version $Id: Audiveris.java,v 1.14 2007/07/27 15:15:53 hbitteur Exp $
 */
public final class Audiveris
{
    //~ Constructors -----------------------------------------------------------

    //-----------//
    // Audiveris //
    //-----------//
    /** To avoid instantiation */
    private Audiveris ()
    {
    }

    //~ Methods ----------------------------------------------------------------

    //------//
    // main //
    //------//
    /**
     * The main entry point, which just calls {@link omr.Main#main}
     *
     * @param args These args are simply passed to Main
     */
    public static void main (final String[] args)
    {
    	//String[] my_args = {"-batch", "-step", "score", "-sheet", "../omr/example/twinkle.jpg"};
    	//String[] my_args = {"-sheet", "../omr/example/twinkle.jpg"};
    	String[] my_args = {"-batch", "-script", "../audiveris/twinkle.script"};
        omr.Main.main(my_args);
    }
}
