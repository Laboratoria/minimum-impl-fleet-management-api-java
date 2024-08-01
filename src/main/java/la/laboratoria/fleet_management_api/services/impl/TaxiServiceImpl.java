package la.laboratoria.fleet_management_api.services.impl;

import la.laboratoria.fleet_management_api.dto.TaxiDto;
import la.laboratoria.fleet_management_api.entities.Taxi;
import la.laboratoria.fleet_management_api.mappers.TaxiMapper;
import la.laboratoria.fleet_management_api.repositories.TaxiRepository;
import la.laboratoria.fleet_management_api.services.TaxiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaxiServiceImpl implements TaxiService {
    @Autowired // funciona si esté o no esté
    private TaxiRepository taxiRepository;

    public TaxiServiceImpl(TaxiRepository taxiRepository) {
        this.taxiRepository = taxiRepository;
    }

    @Override
    public List<TaxiDto> getTaxisWithPagination(int pageNumber, int pageSize, String plate) {
        Page<Taxi> taxisList = taxiRepository.findAll(PageRequest.of(pageNumber, pageSize));
        return taxisList.stream()
                .map(taxis -> TaxiMapper.mapToTaxisDto(taxis))
                .collect(Collectors.toList());
    }
}