import minidb.xmlParser.*;

public class New extends Command{

    @Override
    public void execute(DatabaseFile CurrentDb,RegistryFile registry,String[] cmdArgs) {
        
        registry.createNewDatabase(cmdArgs[1]);
    }


}