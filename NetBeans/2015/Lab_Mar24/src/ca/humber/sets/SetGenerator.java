package ca.humber.sets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class SetGenerator {
    private Set<String> set;
    
    public void generate(String articleName) throws IOException {
        try ( BufferedReader reader = new BufferedReader(new FileReader(articleName))) {
            String line;
            set = new HashSet<>();
            while ( (line = reader.readLine()) != null ) {
                StringTokenizer st = new StringTokenizer(line, " .'\"-,:;()[]{}`/*+");
                while (st.hasMoreTokens()) {
                    final String token = st.nextToken();
                    if( token.length() > 3) {
                        set.add( token.toLowerCase());
                    }
                }
            }
        }
    }

    public Set<String> getSet() {
        return set;
    }
    
    public float compare(Set<String> otherSet) {
        Set<String> intersection = new HashSet<>();
        Set<String> union = new HashSet<>();
        
        intersection.addAll(set);
        union.addAll(set);
        
        intersection.retainAll(otherSet);
        union.addAll(otherSet);
        
        float s1 = intersection.size();
        float s2 = union.size();
        
        return s1/s2;
    }
    
}