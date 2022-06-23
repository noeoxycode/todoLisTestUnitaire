import java.util.Scanner;

public class User {
    private String name;
    private String surname;
    private String password;
    private Todolist todolist;
    public void setTodolist(Todolist todolist) {
        this.todolist = todolist;
    }



    public User(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.todolist = new Todolist();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public Todolist getTodolist() {
        return todolist;
    }

    public static User createUser(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Quel est le nom du nouvel utilisateur ?");
        String name = sc.nextLine();
        System.out.println("Quel est le prenom du nouvel utilisateur ?");
        String surname = sc.nextLine();
        System.out.println("Quel est le password du nouvel utilisateur ?");
        String pwd = sc.nextLine();
        return new User(name, surname, pwd);
    }
}
