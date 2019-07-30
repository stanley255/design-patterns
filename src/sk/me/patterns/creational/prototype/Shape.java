package sk.me.patterns.creational.prototype;

public abstract class Shape implements Clonable {
    private String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return this.type;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract Object clone();

}
