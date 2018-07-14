package model;


public class Example {

    /** The id. */
    private final int id;

    /** The name. */
    private String    name;

   
    public Example(final int id, final String name) {
        super();
        this.id = id;
        this.name = name;
    }

    
    public int getId() {
        return this.id;
    }

  
    public String getName() {
        return this.name;
    }

    
    public void setName(final String name) {
        this.name = name;
    }

  
    public String toString() {
        return this.getId() + " : " + this.getName();
    }
}
