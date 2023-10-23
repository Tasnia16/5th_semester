import minidb.xmlParser.*;
public class list extends Command{

    @Override
    public void execute(DatabaseFile CurrentDb,RegistryFile registry,String[] cmdArgs) {
        registry.listAllDatabases();
    }


}
