import java.util.ArrayList;
import java.util.Date;

public class Todolist {
    private String title;
    private String description;
    private Date date;
    private ArrayList<Items> items;


    public Todolist(String title,String description, Date date, ArrayList items){
        this.title = title;
        this.description = description;
        this.title=title;
        this.date=new Date();
    }

    public ArrayList getItems() {
        return items;
    }

    public Todolist(){
        this.title = "default";
        this.description = "default";
        this.title = "default";
        this.date=new Date();
        this.items = new ArrayList();
    }

    static void showtable(Todolist totolist){
        int i = 0;

        for (i=0; i<totolist.getItems().size(); i++){
            System.out.println("item : "  + totolist.getItems().get(i).toString());
        }
    }
    public ArrayList addItem(Items item){
        int value = 10 - this.items.size();
        if (this.items.size() < 10){
            this.items.add(item);
            System.out.println("Your item has been added!!!");
            if(this.items.size() >= 8){
                System.out.println("Attention, il ne vous reste plus que " +  (10 - this.items.size()) +" places de dispo");
            }
            return this.items;
        }
        else if (this.items.size() >= 10){
            System.out.println("You cannot add more items it's already fulled!!!");
            return items;
        }
        return items;
    }

    public void removeItem(int index){
        this.items.remove(index);
    }
}
