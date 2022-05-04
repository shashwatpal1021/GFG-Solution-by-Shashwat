import java.util.ArrayList;

public class Amazon {
    public static void main(String[] args) {
        
            
        ArrayList<Integer>power=new ArrayList<>();

        power.add(1);
        power.add(2);
        power.add(3);
        int armor=1;
        int ans=0;
        for (int i = 0; i < power.size(); i++) {
            power.set(i,power.get(i)-i);
        }
        power.set(power.size()-1,power.get(0)+armor);

        for (int i = 0; i < power.size(); i++) {
            ans+=power.get(i);
        }

        System.out.println(ans);

    }
}
