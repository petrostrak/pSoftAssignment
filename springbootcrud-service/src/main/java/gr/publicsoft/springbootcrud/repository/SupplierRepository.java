package gr.publicsoft.springbootcrud.repository;

import gr.publicsoft.springbootcrud.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author petros_trak
 */
@CrossOrigin(origins = "http://localhost:9000")
@RepositoryRestResource
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    
    Supplier findByCompanyName(String companyName);
    Supplier findByVatNumber(String vatNumber);
}
