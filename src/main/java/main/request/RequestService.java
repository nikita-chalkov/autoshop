package main.request;

import main.history.HistorySale;
import main.history.HistorySaleDTO;
import main.history.HistorySaleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RequestService {
    private final HistorySaleRepository repository;
    private final ModelMapper mapper = new ModelMapper();

    public RequestService(HistorySaleRepository repository) {
        this.repository = repository;
    }

    public ResponseRevenue getRevenueForPeriod(RequestPeriod period) {
        Long revenue = repository.findAllByDatePeriod(period.getStart(), period.getEnd()).stream().map(HistorySale::getPrice).mapToLong(Long::longValue).sum();
        return new ResponseRevenue(revenue);
    }

    public List<HistorySaleDTO> getHistory() {
        return repository.findAll(sort()).stream().map(this::toDTO).collect(Collectors.toList());
    }
    private Sort sort() {
        //упорядоченный по дате заказа, внутри даты по ФИ клиента, внутри клиента по сумме заказа
        List<Sort.Order> sorts = new ArrayList<>();
        sorts.add(Sort.Order.asc("date"));
        sorts.add(Sort.Order.asc("client.fio"));
        sorts.add(Sort.Order.asc("price"));
        return Sort.by(sorts);
    }

    private HistorySaleDTO toDTO(HistorySale historySale){
        return mapper.map(historySale, HistorySaleDTO.class);
    }
}
