package metaio;

/**
 * Created by msproteo on 08/12/15.
 */
public class StaticHelp {
    public static String getHelpxml() {
        return helpxml;
    }

    private static final String helpxml;

    static {
        helpxml = "<help>\n.. class:: infomark\n\n**Authors** helpauthorsnames helpauthorsemails\n\n---------------------------------------------------\n\n.. class:: infomark\n\n**Please cite** helpcitation\n\n---------------------------------------------------\n\n==============\nhelptoolname\n==============\n\n-----------\nDescription\n-----------\n\n helpdescription\n\n\n-----------------\nWorkflow position\n-----------------\n\n**Upstream tools**\n\nhelpupstreamtools\n\n\n**Downstream tools**\n\nhelpdownstreamtools\n\n\n-----------\nInput files\n-----------\n\nhelpinputfiles\n\n\n----------\nParameters\n----------\n\nhelpinputfilesparameters\n\n\n------------\nOutput files\n------------\n\nhelpoutputfiles\n\n\t\n---------------------------------------------------\n\n---------------\nWorking example\n---------------\n\nInput files\n===========\n\nhelpinputfilesexample\n\n\t\t\nParameters\n==========\n\nhelpinputfilesexampleparameters\n\n\nOutput files\n============\n\nhelpoutputfilesexample\n\t\n---------------------------------------------------\n\n.. class:: infomark\n\nhelpmoreinformations\n</help>\n</tool>";
    }
}
