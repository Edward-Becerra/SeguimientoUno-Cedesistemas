package co.edu.cedesistemassophos.seguimientoUno.repository;

import co.edu.cedesistemassophos.seguimientoUno.model.Speciality;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
public interface SpecialityRepository extends R2dbcRepository<Speciality, Integer> {

    Flux<Speciality> findBySpecialityIdIn(List<Integer> specialityIds);
}
