package lunatechlabs.springworkshop.service;

import lunatechlabs.springworkshop.model.Office;
import lunatechlabs.springworkshop.repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeService {

    @Autowired
    private OfficeRepository officeRepository;

    public List<Office> getAll(){
        return this.officeRepository.findAll();
    }

    public void add(Office office) {
        this.officeRepository.save(office);
    }

    public Office getById(String id) {
        return this.officeRepository.findById(id).get();
    }
}
