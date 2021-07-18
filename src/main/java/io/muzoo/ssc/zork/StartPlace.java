package io.muzoo.ssc.zork;

public class StartPlace extends Map<Stateless> {
    public StartPlace(final World world){
        super(world);
        this.title("Room").addItem(new Axe());
    }
}
