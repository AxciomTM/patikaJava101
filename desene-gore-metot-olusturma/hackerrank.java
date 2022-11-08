class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports{
    String getName(){
        return "Soccer Class";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
}
public class Main{
    public static void main(String []args){
        Sports val1 = new Sports();
        Soccer val2 = new Soccer();
        System.out.println(val1.getName());
        val1.getNumberOfTeamMembers();
        System.out.println(val2.getName());
        val2.getNumberOfTeamMembers();
    }
}
