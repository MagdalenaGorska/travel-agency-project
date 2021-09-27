package pl.sda.controller.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;

// Za pomocą beanów typu ControllerAdvice "mówimy", co stanie się dalej z żądaniami,
// podczas obsługi których zostanie wyrzucony wyjątek.

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {
    // Kiedy podczas obsługi żadania zostanie wyrzucony wyjątek typu RuntimeException
    // (lub typu go rozszerzającego) zostanie w dalszej kolejności takie żądanie
    // obsłużone za pomocą poniższej metody.
    @ExceptionHandler(RuntimeException.class)
    public String handle(RuntimeException e) {
        // Zwróćmy uwagę, że gdybyśmy chcieli, możemy odwołać się
        // do danych wyrzuconego wyjątku:
        // e.XXX();
        return "error-page";
    }

}
