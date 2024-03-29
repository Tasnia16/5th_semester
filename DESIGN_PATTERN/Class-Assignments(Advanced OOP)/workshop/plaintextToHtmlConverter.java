package workshop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class plaintextToHtmlConverter {
    String source;
    int i;
    List<String> result;
    List<String> convertedLine;
    String characterToConvert;

    public String toHtml() throws Exception {
        return basicHtmlEncode(read());
    }

    protected String read() throws IOException {
        return new String(Files.readAllBytes(Paths.get("sample.txt")));
    }

    private String basicHtmlEncode(String source) {
        result = new ArrayList<>();
        convertedLine = new ArrayList<>();
        //characterToConvert = stashNextCharacterAndAdvanceThePointer();
        convertion(source);

        addANewLine();
        String finalResult = String.join("<br />", result);
        return finalResult;
    }

    public void convertion(String source)
    {
        this.source = source;
        i=0;
        while (i <= this.source.length()) {
            switch (characterToConvert) {
                case "<":
                    convertedLine.add("&lt;");
                    break;
                case ">":
                    convertedLine.add("&gt;");
                    break;
                case "&":
                    convertedLine.add("&amp;");
                    break;
                case "\n":
                    addANewLine();
                    break;
                default:
                    convertedLine.add(characterToConvert);;
            }
            characterToConvert= String.valueOf(source.charAt(i));
                    i++;
        }
    }


    private void addANewLine() {
        String line = String.join("", convertedLine);
        result.add(line);
        convertedLine = new ArrayList<>();
    }


}