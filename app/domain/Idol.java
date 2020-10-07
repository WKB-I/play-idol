package domain;

import models.IdolEntity;

public class Idol {
    private IdolEntity idol;

    public Idol(IdolEntity idol) {
        this.idol = idol;
    }

    public IdolEntity getIdol() {
        return this.idol;
    }
}
