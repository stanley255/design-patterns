package sk.me.patterns.creational.prototype;

public abstract class Shape implements Clonable {
    protected String type;
    private String id;

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
