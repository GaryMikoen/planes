package nl.capgemini.academy.planes.repository;


import nl.capgemini.academy.planes.models.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "plane")
public interface PlaneRepository extends JpaRepository<Plane, Long> {
    Iterable<Plane> findAllByName(String name);
}
