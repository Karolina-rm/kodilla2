package Food2Door;

public class OrderCompanies {

    public static String EXTRAFOODSHOP = "EXTRAFOODSHOP";
    public static String GLUTENFREESHOP = "GLUTENFREESHOP";
    public static String HEALTHYSHOP = "HEALTHYSHOP";

    public OrderCompanies(String EXTRAFOODSHOP, String GLUTENFREESHOP, String HEALTHYSHOP) {
        this.EXTRAFOODSHOP = EXTRAFOODSHOP;
        this.GLUTENFREESHOP = GLUTENFREESHOP;
        this.HEALTHYSHOP = HEALTHYSHOP;

    }

    public static String getEXTRAFOODSHOP() {
        return EXTRAFOODSHOP;
    }

    public static String getGLUTENFREESHOP() {
        return GLUTENFREESHOP;
    }

    public static String getHEALTHYSHOP() {
        return HEALTHYSHOP;
    }
}
