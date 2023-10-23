import minidb.xmlParser.*;
public class use extends Command{

    @Override
    public void execute(DatabaseFile CurrentDb,RegistryFile registry,String[] cmdArgs) {
        String path = registry.getDatabasePath(cmdArgs[1], false);
        print(path);
        if (path != null) {
            CurrentDb = new DatabaseFile(path);
            CurrentDb.EditMode();
            print("Successfully loaded Database named: " + cmdArgs[1]);
        } else {
            print("Database not found");
        }  
    }


}
