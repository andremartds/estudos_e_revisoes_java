package linguagem.cronometro;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Teste {
	

	    public static void main(String[] args) throws Exception
	    {
	        while(true)
	        {
	            System.out.println(new SimpleDateFormat("H:m:ss").format(new Date()));
	            Thread.sleep(1000);
	        }
	    }
	}
