package Command;

import java.util.ArrayList;
import java.util.List;

public class CommandProcess {
    List<Command> commands = new ArrayList<>();
    public  CommandProcess addCommand(Command command){
        commands.add(command);
        return this;
    }
    public void execute(){
        for (Command command :commands){
            command.execute();;
        }
    }
}
