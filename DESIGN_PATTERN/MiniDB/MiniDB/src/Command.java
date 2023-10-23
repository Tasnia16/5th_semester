import minidb.xmlParser.*;
public abstract class Command{
   
   
   public abstract void execute(DatabaseFile CurrentDb,RegistryFile registry,String[] cmdArgs);
   protected void print(String x) {
        System.out.println(x);
    }

}