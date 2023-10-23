import minidb.xmlParser.*;
import constants.*;
public class read extends Command{

    @Override
    public void execute(DatabaseFile CurrentDb,RegistryFile registry,String[] cmdArgs) {
        
        if (CurrentDb != null) {
            if (cmdArgs.length == 1) {
                CurrentDb.readData();
            } else {
                CurrentDb.readData(cmdArgs[1]);
            }
        } else {
            print(errors.NO_DATABASE_SELECTED);
        }
    }


}
