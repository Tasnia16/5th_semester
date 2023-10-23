import minidb.xmlParser.*;
import constants.*;
public class schema extends Command{

    @Override
    public void execute(DatabaseFile CurrentDb,RegistryFile registry,String[] cmdArgs) {
        
        if (CurrentDb != null) {
            String xy = cmdArgs[1];
        
            if (xy.equals("show")) {
                print(CurrentDb.getSchema());
            } else {
                String[] schemaVals = xy.split(",");
                if (schemaVals.length > 1) {
                    CurrentDb.createSchema(xy);
                } else {
                    print("There should be atleast 2 columns of data");
                }
            }
        
        } else {
            print(errors.NO_DATABASE_SELECTED);
        }
    }



}





