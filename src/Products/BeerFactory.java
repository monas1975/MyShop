package Products;

import enums.BeerSize;
import enums.BeerType;

public class BeerFactory {
    public  Beer getBeer(BeerType type, BeerSize size) {
        Beer result = new Beer();
        switch (type) {
            case LIGHT:
                result.setBeerType(BeerType.LIGHT);
                result.setBeerSize(size);
                result.setName("Leszek");
                result.setPrice(setPrice(size));
                result.setForAdult(true);
                break;
            case DARK:
                result.setBeerType(BeerType.DARK);
                result.setBeerSize(size);
                result.setName("Fortuna");
                result.setPrice(setPrice(size));
                result.setForAdult(true);
                break;
            case NONALCO:
                result.setBeerType(BeerType.NONALCO);
                result.setBeerSize(size);
                result.setName("Woda");
                result.setPrice(setPrice(size));
                result.setForAdult(false);
                break;
        }
        return result;
    }

    private BeerSize getSize(BeerSize size){
        return size;
    }

    private int setPrice(BeerSize size){
        int result = 0;
        if(size == BeerSize.SMALL){
            result =5;
        }
        if(size == BeerSize.BIG){
            result =10;
        }
        return result;
    }

}
