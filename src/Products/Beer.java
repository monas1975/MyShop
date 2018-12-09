package Products;


import enums.BeerSize;
import enums.BeerType;


public class Beer implements ShopItem {

    private  String name;
    private int price;
    private BeerType beerType;
    private BeerSize beerSize;
    private boolean isForAdult;



    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean ifForadult() {
        return false;
    }

    public void setForAdult(boolean forAdult) {
        isForAdult = forAdult;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BeerType getBeerType() {
        return beerType;
    }

    public void setBeerType(BeerType beerType) {
        this.beerType = beerType;
    }

    public BeerSize getBeerSize() {
        return beerSize;
    }

    public void setBeerSize(BeerSize beerSize) {
        this.beerSize = beerSize;
    }
}
