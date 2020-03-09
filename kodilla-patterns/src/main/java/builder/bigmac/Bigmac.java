package builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private final String bun;
    private final int burgersQuantity;
    private final String sauce;
    private final List<String> ingredients;

    public Bigmac(String bun, int burgersQuantity, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgersQuantity = burgersQuantity;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public static class BigmacBuilder {
        private String bun;
        private int burgersQuantity;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgersQuantity(int burgersQuantity) {
            this.burgersQuantity = burgersQuantity;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgersQuantity, sauce, ingredients);
        }

    }

    public String getBun() {
        return bun;
    }

    public int getBurgersQuantity() {
        return burgersQuantity;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                "burgers='" + burgersQuantity + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
