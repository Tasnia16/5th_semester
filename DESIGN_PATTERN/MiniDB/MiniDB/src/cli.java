import java.util.HashMap;
import java.util.Scanner;
import minidb.xmlParser.*;
import constants.*;
public class cli {

    static RegistryFile registry;
    static DatabaseFile CurrentDb;
    static HashMap<String, Object> commands;

    public void run() {
        print(constants.HEADING);
        //APPLIED SINGLETON
        registry = RegistryFile.GetRegistryFile(constants.DATA_XML_PATH);
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print(constants.CMD_PREFIX);
            String currentCmd = input.nextLine();
            // break if user wants to exit
            if (currentCmd.equals("exit;")) {
                break;
            }
            long startTime = System.nanoTime();
            cliInputs(currentCmd);
            long endTime = System.nanoTime();

            long exeTime = (endTime - startTime) / 1000000;
            print("\nExecution Time: " + exeTime + "ms");
        }
        input.close();
    }
    private static void cliInputs(String input) {
        
        String[] cmdArgs = input.split(" ");
        try {
            ((Command)commands.get(cmdArgs[0])).execute(CurrentDb,registry,cmdArgs);
        }catch(Exception e)
        {
            Command command = new Notfound();
            command.execute(CurrentDb,registry,cmdArgs);
        }
    }
    private static void print(String x) {
        System.out.println(x);
    }
    public void setCommandList(HashMap<String, Object> commands) {
        this.commands = commands;
    }
}