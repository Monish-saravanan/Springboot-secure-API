public class PersonDTO {

    private long id;
    private String name;
    private String username;
    private int age;

    // Constructors, getters, and setters

    public PersonDTO() {
    }

    public PersonDTO(long id, String name, String username, int age) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.age = age;
    }

    // Getters and Setters (or use Lombok annotations)

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
