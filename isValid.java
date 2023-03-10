import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface isValid extends Function<Customer, TypesResult> {
    static isValid isEmailValid() {
        return customer -> customer.getEamil().contains("@") ? TypesResult.SUCCESS : TypesResult.INCORRECT_EMAIL;
    }

    static isValid isPhoneValid() {
        return customer -> customer.getPhone().startsWith("+7") ? TypesResult.SUCCESS : TypesResult.INCORRECT_PHONE;
    }

    static isValid isNameValid() {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ? TypesResult.SUCCESS
                : TypesResult.INCORRECT_PHONE;
    }

    default isValid and(isValid other) {
        return customer -> {
            TypesResult result = this.apply(customer);
            return result.equals(TypesResult.SUCCESS) ? other.apply(customer) : result;
        };
    }

}
