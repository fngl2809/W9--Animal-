package package1.data;

public class Category {
    private String id;
    private boolean expensive;

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public boolean isExpensive(){
        return this.expensive;
    }

    public void setExpensive(boolean expensive){
        this.expensive = expensive;
    }
}
