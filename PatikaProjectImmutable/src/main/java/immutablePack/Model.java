package immutablePack;

public enum Model {


    MERCEDES(1),
    TOYOTA(2),
    HONDA(3),
    NISSAN(4),
    AUDI(5),
    SKODA(6),
    HYUNDAI(7);

    private int model;

    Model(int model) {
        // TODO Auto-generated constructor stub
        this.model = model;
    }

    public int getModel() {
        return this.model;
    }


}
