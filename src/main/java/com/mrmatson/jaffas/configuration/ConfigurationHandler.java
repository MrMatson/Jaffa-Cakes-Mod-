package com.mrmatson.jaffas.configuration;

import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        //Create da conf object from da given conf file
        Configuration configuration = new Configuration(configFile);

        try
        {
            // Load conf file
            configuration.load();

            //Read in props from conf file
            boolean configValue = configuration.get("Rundom staff", "configValue", true, "This is something a coonfiig and i am becoming freee!").getBoolean(true);
        }
        catch (Exception e)
        {
            //Log the exc
        }
        finally
        {
            //SAVE THE FILE
            configuration.save();
        }
    }
}
