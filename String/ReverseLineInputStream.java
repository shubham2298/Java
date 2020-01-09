import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;
import java.io.FileNotFoundException;
import java.util.Collections;

class ReverseLineInputStream
{
    public static void main(String args[]) throws IOException
    {
try {
    List<String> strLines = Collections.emptyList();
    strLines = Files.readAllLines(Paths.get("/home/gslab/Desktop/java/Assignment/String/sample.txt"));//, StandardCharsets.UTF_8);
    for (int i = strLines.size() - 1; i >= 0; i--) {
        String strLin = strLines.get(i).trim();
        if (strLin.equals("")) {
            System.out.println();
        } else {
            String[] wordArr = strLin.split(" ");
            for (int j = wordArr.length - 1; j >= 0; j--) {
                String eachWord = wordArr[j];
                if (eachWord.length() > 1) {
                    if (eachWord.charAt(eachWord.length() - 1) == '.'
                            || eachWord.charAt(eachWord.length() - 1) == ':'
                            || eachWord.charAt(eachWord.length() - 1) == ',') {
                        StringBuffer sb = new StringBuffer("");
                        sb.append(eachWord.charAt(eachWord.length() - 1));
                        for (int k = 0; k < eachWord.length() - 1; k++) {
                            sb.append(eachWord.charAt(k));
                        }
                        System.out.print(sb);
                    } else {
                        System.out.print(eachWord);
                    }
                }
                if (j != 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
} catch (FileNotFoundException fnf) {
    System.out.println(fnf);
} catch (Exception e) {
    System.out.println(e);
}
    }
}