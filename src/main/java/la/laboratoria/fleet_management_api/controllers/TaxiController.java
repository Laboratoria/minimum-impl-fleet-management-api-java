package la.laboratoria.fleet_management_api.controllers;

import la.laboratoria.fleet_management_api.dto.TaxiDto;
import la.laboratoria.fleet_management_api.services.TaxiService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/taxis")
public class TaxiController {

    private TaxiService taxisService;

    public TaxiController(TaxiService taxiService) {
        this.taxisService = taxiService;
    }

    @GetMapping
    public ResponseEntity<List<TaxiDto>> getTaxisController(@RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "10") Integer limit, @RequestParam(defaultValue = "") String plate) {
        if (page < 0 || limit < 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
        List<TaxiDto> taxisPage = taxisService.getTaxisWithPagination(page, limit, plate);
        return ResponseEntity.ok(taxisPage);
    }

}
