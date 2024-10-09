
package zrecords;
import java.util.Scanner;

public class ZRECORDS {

    
    public static void main(String[] args) {
Scanner in = new Scanner (System.in);
        

        System.out.println("|| ZOMBIE VARIANTS ||");
        System.out.println("1. ADD ZOMBIE");
        System.out.println("2. VIEW ZOMBIE");
        System.out.println("3. EXIT ");
        
        System.out.println("Enter action: ");
        int action = in.nextInt();
        
        while(action>3){
            System.out.println("Please enter again: ");
            action = in.nextInt();
        }
        
        switch(action){
       
            case 1:
               ZRECORDS z = new ZRECORDS();
               z.addzom();
               
               
                break;
                
            case 2:

                System.out.println("VIEW VARIANTS");
                System.out.println("1. SHOW SPEFICIF");
                System.out.println("2. SHOW ALL");
                
                System.out.println("Enter action:  ");
                int ac = in.nextInt();
                
                switch (ac){
                    case 1:
                            ZRECORDS zz = new ZRECORDS();
                            zz.viewprod();
                        break;
                        
                    case 2:
                       config another = new config();
            String tests = "SELECT * FROM ZOMBIE";
                String[] headerss = {"ID", "NAME", "LEVEL", "LOCATION", "ESTIMATED"};
                String[] Columnss = {"ID", "NAME", "LEVEL", "LOCATION", "ESTIMATED"};

                another.viewZOMBIE(tests, headerss, Columnss);
                        break;
                    
                }
                
                break;
                
            case 3:
                System.exit(0);
                break;
            
            
        
    }
    
}
    
    public void addzom(){
        Scanner in = new Scanner(System.in);
        config conf = new config();
        
        
         System.out.println("||INPUT VARIANTS||");
         
                System.out.print("ZOMBIE NAME: ");
                String name = in.next();
                System.out.print("DANGER LEVEL: ");
                String level = in.next();
                System.out.print("LOCATION: ");
                String location = in.next();
                System.out.print("ESTIMATED NO: ");
                String est = in.next();
                
                String sql = "INSERT INTO ZOMBIE (NAME, LEVEL, LOCATION, ESTIMATED) VALUES (?, ?, ?, ?)";
                
                conf.addRecord(sql, name, level, location, est);
                
    }
    
    
    public void viewprod(){
        Scanner in = new Scanner(System.in);
        config con = new config();
        
        System.out.println("Enter name to show the details: ");
        String llname = in.next();
        
        String sql = "SELECT * FROM ZOMBIE WHERE NAME  = ?";
       
                String[] headers = { "ID","NAME", "LEVEL", "LOCATION", "ESTIMATED"};
                String[] Columns = { "ID","NAME", "LEVEL", "LOCATION", "ESTIMATED"};

                con.viewzoom(sql, headers, Columns, llname);
        
        
    }
}