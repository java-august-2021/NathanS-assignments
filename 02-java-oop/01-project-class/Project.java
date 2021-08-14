public class Project {
    //Fields (Private)
    private String name;
    private String desc;
    //method elevatorPitch
    public String elevatorPitch() {
        return this.name + "; " + this.desc;
    }
    //Constructors
    //first overload, nothing passed in
    public Project() {
        this.name = "Enter a name, please!";
        this.desc = "Enter a description, please!";
    } 
    //second overload, name field passed in
    public Project(String name) {
        this.name = name;
        this.desc = "Enter a description, please!";
    }
    //third overload, name & desc field passed in
    public Project(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    //Getters
    public String getName() {
        return this.name;
    }
    public String getDesc() {
        return this.desc;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
