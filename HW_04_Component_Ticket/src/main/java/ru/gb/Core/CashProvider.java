package ru.gb.Core;

import ru.gb.Interfaces.ICarrierRepo;
import ru.gb.Interfaces.ICashRepo;
import ru.gb.Models.Carrier;
import ru.gb.Models.Ticket;
import ru.gb.Models.User;
import ru.gb.Services.CarrierRepository;
import ru.gb.Services.CashRepository;

/**
 * Класс - провайдер для взаимодействия с банком и базой перевозчиков
 */
public class CashProvider {
    private long cardNumber;
    private boolean isAuthorized = false;
    private ICashRepo cashRepository;
    private ICarrierRepo carrierRepository;

    /**
     * Конструктор класса
     */
    public CashProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
    }

    /**
     * Метод покупки билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     * @throws RuntimeException
     */
    // подсказка  Carrier carrier = carrierRepository.read(1);
    // подсказка  return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    public boolean buy(Ticket ticket) {
        if (isAuthorized) {
            Carrier carrier = carrierRepository.read(1);
            return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
        }
        return false;

        /**
         * Метод авторизации клиента. Здесь должно быть реализовано обращение к банку для подтверждения личности клиента.
         *
         * @param client
         */

    }

    public void authorization(User client) {
    }
}
