package lunatechlabs.springworkshop.service;

import lunatechlabs.springworkshop.model.Office;
import lunatechlabs.springworkshop.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeService {

    @Autowired
    OfficeRepository officeRepository;

    public List<Office> getAll(){
        return this.officeRepository.findAll();
    }
}
