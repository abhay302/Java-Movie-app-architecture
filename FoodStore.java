package Application;

// enum to specify the type of Dish to be distributed by the FoodStore
enum Dish {
    DOSA, DAL_MAKHNI, PEPPER_STEAK;
}

// The FoodStore will give dishes to the customers
class FoodStore {

    // returns dish depending upon the type of movie
    public Dish getFirstDish(Type type) {
        switch(type) {
        case TOLLYWOOD: return Dish.DOSA;
        case BOLLYWOOD: return Dish.DAL_MAKHNI;
        case HOLLYWOOD: return Dish.PEPPER_STEAK;
        default: return null;
        }
    }

}
