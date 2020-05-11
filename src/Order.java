package Order;


/**
* @generated
*/
public class Order extends Customer {
    
    /**
    * @generated
    */
    private Dish dishList<>;
    
    /**
    * @generated
    */
    private Integer ID;
    
    /**
    * @generated
    */
    private Integer cost;
    
    /**
    * @generated
    */
    private Boolean done;
    
    
    /**
    * @generated
    */
    private Service service;
    
    /**
    * @generated
    */
    private Set<Dish> dishes;
    
    
    /**
    * @generated
    */
    public Dish getDishList<>() {
        return this.dishList<>;
    }
    
    /**
    * @generated
    */
    public Dish setDishList<>(Dish dishList<>) {
        this.dishList<> = dishList<>;
    }
    
    /**
    * @generated
    */
    public Integer getID() {
        return this.ID;
    }
    
    /**
    * @generated
    */
    public Integer setID(Integer ID) {
        this.ID = ID;
    }
    
    /**
    * @generated
    */
    public Integer getCost() {
        return this.cost;
    }
    
    /**
    * @generated
    */
    public Integer setCost(Integer cost) {
        this.cost = cost;
    }
    
    /**
    * @generated
    */
    public Boolean getDone() {
        return this.done;
    }
    
    /**
    * @generated
    */
    public Boolean setDone(Boolean done) {
        this.done = done;
    }
    
    
    /**
    * @generated
    */
    public Dish getDishes() {
        return this.dishes;
    }
    
    /**
    * @generated
    */
    public Dish setDishes(Dish dishes) {
        this.dishes = dishes;
    }
    
    /**
    * @generated
    */
    public Service getService() {
        return this.service;
    }
    
    /**
    * @generated
    */
    public Service setService(Service service) {
        this.service = service;
    }
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public calculateCost() {
        //TODO
    }
    /**
    * @generated
    */
    public addDish() {
        //TODO
    }
    /**
    * @generated
    */
    public removeDish() {
        //TODO
    }
    
}
