package br.com.prenatal.validator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import br.com.prenatal.entity.Gestante;
 
@Component
public class UserValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Gestante.class.equals(aClass);
    }
 
    @Override
    public void validate(Object obj, Errors errors) {
 
        Gestante gestante = (Gestante) obj;
 
        if (gestante.getDataNascimento() == null) {
            errors.rejectValue("dataNascimento", "required.dataNascimento");
        }
    }
}