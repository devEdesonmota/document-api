package com.br.domain.repository.spec;

import com.br.domain.model.Departamento;
import com.br.domain.model.User;

import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;
public class TemplateSpec {

    @And({
            @Spec(path = "nome", spec = Like.class),
            @Spec(path = "sigla", spec = Equal.class),
            @Spec(path = "departmentId", spec = Equal.class)
    })
    public interface UserSpec extends Specification<User> {}

    @And({
            @Spec(path = "nome", spec = Like.class),
            @Spec(path = "sigla", spec = Equal.class)
    })
    public interface DepartmentSpec extends Specification<Departamento> {}

}