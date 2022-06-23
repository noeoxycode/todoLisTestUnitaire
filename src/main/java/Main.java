import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        User newUser = User.createUser();
        System.out.println(newUser.getName());
        System.out.println(newUser.getSurname());
        System.out.println(newUser.getPassword());
        Items newItem = Items.createItem();
        System.out.println("nouvel item : " + newItem.getName());
        System.out.println("nouvel item : " + newItem.getContent());
        newUser.getTodolist().addItem(newItem);
        System.out.println(newUser.getTodolist());
    }

}
