import minidb.xmlParser.*;
import constants.*;

public class help extends Command{

    @Override
    public void execute(DatabaseFile CurrentDb,RegistryFile registry,String[] cmdArgs) {
        print(constants.HELP_COMMANDS);
    }
}