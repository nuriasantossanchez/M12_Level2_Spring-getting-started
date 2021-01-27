package springBootInitialDemo_Level_II.repository;

import springBootInitialDemo_Level_II.dto.GreetingResponseDto;

/**
 * Interface de la capa Repository
 *
 */
public interface IGreetingRepository {

    public GreetingResponseDto getGreeting(String greeting);

}
