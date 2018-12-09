import Products.ShopItem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    private User user;
    private AdultObserver adultObserver;
    List<ShopItem> itemList = new ArrayList<>();

    public ShoppingBasket(User user) {
        this.user = user;
    }

    void insertItem(ShopItem item) {
        this.itemList.add(item);
        if(item.ifForadult()){
            notifyAdultObserver();
        }

        }


    public List<ShopItem> getItemList() {
        return itemList;
    }

    public int getTotalPrice() {
        int result = 0;


        for (ShopItem anItemList : itemList) {
            result = result + anItemList.getPrice();
        }
        return result;
    }


    public void subscribeAdultObserver(AdultObserver observer) {
        this.adultObserver = observer;
    }

    public void notifyAdultObserver() {
        if (adultObserver != null) {
            adultObserver.upDate(user);


        }
    }

}
