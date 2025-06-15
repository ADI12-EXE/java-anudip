class computer
{
    public void playMusic()         // this is where you will define what is behaviour of this particular method
    {
        System.out.println("Music Playing..");
    }


    public String getmeAPen(int cost)
    {
        return "Pen";
    }

}

public class Method
{
    public static void main(String[] args) 
    {
        computer obj = new computer();
        obj.playMusic();
        String str = obj.getmeAPen(2);
        obj.getmeAPen(10);
        
    }
}

