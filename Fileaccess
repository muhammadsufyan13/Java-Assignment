import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class fileaccess
{
    public static void main(String[] args) {
        File f1 = new File("d:\\java\\testtext.txt");
        Scanner inp;
        String dl;
        HashMap<String,Double> hm = new HashMap<>();
        try
        {
            inp = new Scanner(f1);
            dl = inp.nextLine();
            System.out.println(dl);
            String[] parts;
           
            String empID;
            double qty, amt, uPrice;


            while (dl.length() > 0)
            {
                dl = inp.nextLine();
                System.out.println(dl);
                parts = dl.split("\t");
                empID = parts[5];
                qty = Double.parseDouble(parts[3]);
                uPrice = Double.parseDouble(parts[2]);
                amt = qty * uPrice;
                if (hm.containsKey(empID))
                {
                    double prevAmt = hm.get(empID);
                    amt += prevAmt;
                    hm.put(empID, amt);
                }
                else{
                    hm.put(empID, amt);
                }
            }        
        }
        catch(Exception e)
        {
            System.out.println("---------------");
            // for ( Map.Entry<String, Double> entry : hm.entrySet()    
        }
        finally
        {
            for (Map.Entry<String,Double> me: hm.entrySet()) {
            System.out.println(me.getKey()+"---"+me.getValue());
        }

        }
    }
}
