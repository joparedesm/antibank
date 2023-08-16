package antibank;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("John", "123456789",
                LocalDate.of(2015, Month.JUNE, 1));
        // System.out.println(validateUser(u1));
        System.out.println(validate(u1));
    }
    /*
    public static boolean validateUser(User user){
        if(!user.getName().matches("[A-Za-z ]+")) return false;
        if(!user.getId().matches("[0-9]{9}")) return false;
        return Period.between(user.getBirthDate(), LocalDate.now()).getYears() >= 18;
    }
    */

    // Generic method with reflection
    public static <T> boolean validate(T obj){
        // Find in runtime information about the class
        Class<?> clazz = obj.getClass(); // reflection to find and operate class's data

        // Get the attribute with the annotation
        for (Field f : clazz.getDeclaredFields()) {
            if (f.isAnnotationPresent(AgeRestriction.class)) {
                // Get the annotation
                AgeRestriction ar = f.getAnnotation(AgeRestriction.class);
                // Get the value of the attribute
                try {
                    f.setAccessible(true); // To access private attributes
                    LocalDate birthDate = (LocalDate) f.get(obj); // Get the value of the attribute
                    return Period.between(birthDate, LocalDate.now()).getYears() >= ar.minAge();
                } catch (IllegalAccessException e) {
                    e.printStackTrace(); // To handle exceptions
                }
            }
        }
        return false;
    }

}



