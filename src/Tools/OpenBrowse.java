package Tools;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/***
 * @author Aaron Chen
 */
public class OpenBrowse {
    /***
     * open browse
     * @param url
     * @throws URISyntaxException
     * @throws IOException
     */
    public static void open(String url) throws URISyntaxException, IOException {
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            Desktop.getDesktop().browse(new URI(url));
        }
    }
}
