import java.util.Date;
import java.util.Scanner;

public class Items {
    private String name;
    private String content;
    private Date addDate;


    public Items(String name,String content){
        this.name=name;
        if (this.verifContentlenght(content)){
            this.content=content;
        }else{
            this.content="";
        }
        this.content=content;
        this.addDate=new Date();
    }

    public boolean verifContentlenght(String content){
        return content.length()<1000;
    }

    public Items createItem(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Quel est le nom de l'item ?");
        String name = myObj.nextLine();
        System.out.println("Quel est la description de l'item (peut être vide) ?");
        String content = myObj.nextLine();
        if (!this.verifContentlenght(content)){
            return null;
        }
        Items items = new Items(name, content);
        return (items);
    }
}
