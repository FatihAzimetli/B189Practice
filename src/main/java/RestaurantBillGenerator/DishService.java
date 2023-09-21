package RestaurantBillGenerator;

import java.util.ArrayList;
import java.util.List;

//4-Dish objeleri ile ilgili işlemler
public class DishService {

        //5-yiyecekleri bir listeye koyalım

    private List<Dish> dishList=new ArrayList<>();

    //5-a-yiyecekleri oluşturup listeye ekleme
    public DishService(){

        fillDishList();


    }

    private void fillDishList() {
        Dish dish1=new Dish(100,"Adana Kebabı",250.99);
        Dish dish2=new Dish(101,"Urfa Kebabı",200.0);
        Dish dish3=new Dish(102,"Çökertme Kebabı",200.0);
        Dish dish4=new Dish(200,"Baklava",100.0);
        Dish dish5=new Dish(201,"Kadayıf",85.0);
        Dish dish6=new Dish(202,"Künefe",75.0);
        Dish dish7=new Dish(300,"Yayık Ayranı",30.0);
        Dish dish8=new Dish(301,"Kola",35.0);
        Dish dish9=new Dish(302,"Çay",15.0);
        Dish dish10=new Dish(303,"Su",7.5);
        dishList.add(dish1);
        dishList.add(dish2);
        dishList.add(dish3);
        dishList.add(dish4);
        dishList.add(dish5);
        dishList.add(dish6);
        dishList.add(dish7);
        dishList.add(dish8);
        dishList.add(dish9);
        dishList.add(dish10);
    }

        //....

}
