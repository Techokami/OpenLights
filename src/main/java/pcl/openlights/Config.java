package pcl.openlights;

import net.minecraftforge.common.Configuration;

/**
 * @author Caitlyn
 *
 */
public class Config
{
    private int defaultPrinterID = 890;
    public final int printerBlockID;
    	
	private boolean defaultEnableMUD = true;
	public final boolean enableMUD;

    public Config(Configuration config)
    {
        config.load();
        printerBlockID = config.get("blocks", "PrinterID", defaultPrinterID).getInt(defaultPrinterID);
        enableMUD = config.get("options", "enableMUD", true, "Enable the Update Checker? Disabling this will remove all traces of the MUD.").getBoolean(true);
        if( config.hasChanged() )
        {
            config.save();
        }
    }
}
