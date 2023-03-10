// This file contains material supporting section 2.8 of the textbook:
// "Object-Oriented Software Engineering" and is issued under the open-source license

package postalcode;

/**
 * This class defines an exception that will be thrown if a postal
 * code is invalid.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public class PostalCodeException extends Exception
{
    //Constructors ******************************************************

    /**
     * Default constructor.  Does not provide details.
     */
    public PostalCodeException() {}

    /**
     * Constructor that provides more details as to what caused the
     * exception to be thrown.
     *
     * @param message The message giving details about the cause of
     *                the exception.
     */
    public PostalCodeException(String message)
    {
        super(message);
    }
}

