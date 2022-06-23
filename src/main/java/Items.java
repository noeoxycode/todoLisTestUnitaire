import java.util.Date;
import java.util.Scanner;

public class Items {
    private String name;
    private String content;
    private Date addDate;

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", addDate=" + addDate +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public Date getAddDate() {
        return addDate;
    }




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

    static boolean verifContentlenght(String content){
        return content.length()<1000;
    }

    static Items createItem(){
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Quel est le nom de l'item ?");
        String name = scan.nextLine();
        System.out.println("Quel est la description de l'item (peut être vide) ?");
        String content = scan.nextLine();
        if (!Items.verifContentlenght(content)){
            return null;
        }
        Items items = new Items(name, content);
        return (items);
    }
}
