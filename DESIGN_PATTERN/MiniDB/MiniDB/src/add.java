import minidb.xmlParser.*;
import constants.*;
public class add extends Command{

    @Override
    public void execute(DatabaseFile CurrentDb,RegistryFile registry,String[] cmdArgs) {
        if (CurrentDb != null) {
            CurrentDb.addData(cmdArgs[1]);
        } else {
            print(errors.NO_DATABASE_SELECTED);
        }
    }

}