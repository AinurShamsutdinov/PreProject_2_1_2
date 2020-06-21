import java.util.UUID;

public class Cat {
    private UUID id;
    public Cat(UUID id){
        this.id = id;
    }

    public UUID getId(){
        return id;
    }
}
