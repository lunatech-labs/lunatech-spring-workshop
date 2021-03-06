package lunatechlabs.springworkshop.controller;

import lunatechlabs.springworkshop.model.Office;
import lunatechlabs.springworkshop.service.OfficeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/offices")
public class OfficeController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private OfficeService officeService;

    @GetMapping("")
    public List<Office> getOffices(){

        log.debug("Entering getOffices");
        return this.officeService.getAll();
    }
}
