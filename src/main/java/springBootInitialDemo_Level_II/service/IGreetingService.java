package springBootInitialDemo_Level_II.service;

import springBootInitialDemo_Level_II.dto.GreetingResponseDto;

/**
 * Interface de la capa Service
 *
 */
public interface IGreetingService {

    GreetingResponseDto getGreeting(String greeting);
}
