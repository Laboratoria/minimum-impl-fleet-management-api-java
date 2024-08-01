package la.laboratoria.fleet_management_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import la.laboratoria.fleet_management_api.entities.Taxi;

@Repository
public interface TaxiRepository  extends JpaRepository<Taxi, Number> {
}