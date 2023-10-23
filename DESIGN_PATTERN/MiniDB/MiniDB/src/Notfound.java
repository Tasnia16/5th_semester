import minidb.xmlParser.*;
public class Notfound extends Command{

    @Override
    public void execute(DatabaseFile CurrentDb,RegistryFile registry,String[] cmdArgs) {
        print("UNKNOWN COMMAND: " + cmdArgs[0] + "\nType `help;` for commands list");
    }
}
