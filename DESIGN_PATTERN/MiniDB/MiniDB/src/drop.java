import minidb.xmlParser.*;
public class drop extends Command{

    @Override
    public void execute(DatabaseFile CurrentDb,RegistryFile registry,String[] cmdArgs) {   
        registry.deleteDatabase(cmdArgs[1]);
    }
}
