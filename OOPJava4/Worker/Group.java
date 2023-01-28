package Worker;

public class Group extends Department {
    
    public Group(String GroupName){
        setDeptName(GroupName);
    }

    public void addPeople(Persona persona){
        personaInDept.add(persona);
    }
  

}
