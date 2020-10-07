package controllers.form;

public class IdolForm {
    protected int id;
    protected String name;
    protected String unitname;

    public IdolForm() {
        super();
    }

    public IdolForm(int id) {
        super();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }
}
