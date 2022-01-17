class person{
    private String name;

public String getname(){
    return name;
}

public void setname(String newName){
    this.name = newName;
}

}

public class encapsulation_3 {
    public static void main(String[] args) {
        person p = new person();
        p.setname("Piyush");
        System.out.println(p.getname());
    }
}
