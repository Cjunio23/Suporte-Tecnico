
import java.util.Arrays;
import java.util.HashSet;
public class Interpretadora {
    private HashSet<String> palavraChave;

    public Interpretadora(){
        palavraChave = new HashSet<>();
    }
  
    public HashSet<String> Dividir(String axx){
        
        String[] ss = axx.split(" ");
        palavraChave.addAll(Arrays.asList(ss));
       return palavraChave; 
        
    }
}
