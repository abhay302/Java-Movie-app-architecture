package Application;

// enum to specify the type of Dish to be distributed by the FoodStore
enum Dish {
    DOSA, DAL_MAKHNI, PEPPER_STEAK;
}

// The FoodStore will give dishes to the customers
class FoodStore {
    
    // returns dish depending upon the type of movie
    public Dish getFirstDish(Type type) {
        if (type.equals(Type.TOLLYWOOD)) {
            return Dish.DOSA;
        }
        if (type.equals(Type.BOLLYWOOD)) {
            return Dish.DAL_MAKHNI;
        }
        if (type.equals(Type.HOLLYWOOD)) {
            return Dish.PEPPER_STEAK;
        }
        return null;
    }
    
    // returns dish on demand
    public Dish getDish(Dish dish) {
        // Some computation, processing or any other algorithm 
        return dish;
    }
}
