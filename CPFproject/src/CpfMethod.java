import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CpfMethod {
    private final String CPF;


    public CpfMethod(String CPF) {
        this.CPF = CPF;
    }

//123.456.789-92
    public boolean Validatecpf () {
        Pattern p = Pattern.compile("^\\d{3}([.\\s-]?)\\d{3}\\1\\d{3}([.\\s-]?)\\d{2}$");
        Matcher m = p.matcher(CPF);

        return m.matches();

    }

}
