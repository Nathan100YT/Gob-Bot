package com.rezzedup.gob.command.usable;

import com.rezzedup.gob.command.Command;
import com.rezzedup.gob.util.Text;
import net.dv8tion.jda.core.entities.Message;

public class InfoCommand extends Command
{
    public InfoCommand()
    {
        super(new String[]{"info", "about"});
        setDescrption("Displays information about Gob-bot.");
    }
    
    @Override
    public void execute(String[] args, Message message)
    {
        String send = Text.formattedResponse
        (
            "A little bit about me",
            "Created by: **RezzedUp**",
            "GitHub repository: <https://github.com/RezzedUp/Gob-Bot>",
            "Uses __JDA__: <https://github.com/DV8FromTheWorld/JDA>"
        );
        
        try
        {
            message.getChannel().sendMessage(send);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
