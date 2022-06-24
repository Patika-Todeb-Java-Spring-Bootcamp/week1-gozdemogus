package immutablePack;

import java.awt.*;
import java.util.Date;


//  Immutable Class icin:
//	Class içerisinde tanımlanan değişkenler private olmalı. Çünkü dışarıdan herhangi bir müdahalede bulunulmamalı.
//	Class içerisindeki değişkenlerin setter methodları olmamalı. Bu da dışarıdan gelecek müdahalelere karşı sıkı bir önlem.
//	Değişkenler final olarak işaretlenmeli. Bilindiği üzere final işaretlenen değişkenler ilk değeri aldıktan sonra değiştirilemezler.
//	Final işaretlenen bu alanların ilk değerleri constructur ile verilmeli.
//	Ve son olarak classımızı da final işaretlemeliyiz. Extend edilmemesi gerekiyor.


public final class Car {

    private final int arabaModel;
    private final int yıl;
    private final int kacKisilik;
    private final Date uretimTarihi;
    private final int km;
    private final Color color;

    public Car(int arabaModel, int yıl, int kacKisilik, Date uretimTarihi, int km, Color color) {
        this.arabaModel = arabaModel;
        this.yıl = yıl;
        this.kacKisilik = kacKisilik;
        this.uretimTarihi = uretimTarihi;
        this.km = km;
        this.color = color;
    }


    public int getArabaModel() {
        return arabaModel;
    }

    public int getYıl() {
        return yıl;
    }

    public int getKacKisilik() {
        return kacKisilik;
    }

    public Date getUretimTarihi() {
        return uretimTarihi;
    }

    public int getKm() {
        return km;
    }

    public Color getColor() {
        return color;
    }


}
