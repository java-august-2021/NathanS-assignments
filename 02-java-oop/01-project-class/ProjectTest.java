public class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project();
        // System.out.println(project1.getName());
        // System.out.println(project1.getDesc());
        // System.out.println(project1.elevatorPitch());

        Project project2 = new Project("Leon");
        // System.out.println(project2.getName());
        // System.out.println(project2.getDesc());
        // System.out.println(project2.elevatorPitch());        

        Project project3 = new Project("Claire", "brother of Chris"); 
        System.out.println(project3.elevatorPitch());
        project3.setName("Ada");
        project3.setDesc("FBI agent");
        System.out.println(project3.getName());
        System.out.println(project3.getDesc());
    }
}
