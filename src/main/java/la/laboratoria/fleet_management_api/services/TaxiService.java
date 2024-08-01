package la.laboratoria.fleet_management_api.services;

import la.laboratoria.fleet_management_api.dto.TaxiDto;

import java.util.List;

public interface TaxiService {

    List<TaxiDto> getTaxisWithPagination(int pageNumber, int pageSize, String plate);

}