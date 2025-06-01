
package edge_day4;


class EDGE_DAY4 {
    
    private String name;
    private int id;
    private static String dpt = "EEE";
    
    EDGE_DAY4(String name,int id){
        
        this.name = name;
        this.id = id;
        this.dpt = dpt;
        Display();
    }
    void Display(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + dpt);
    }
}


