import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WeatherForecastTest {
    WeatherForecast forecast = new WeatherForecast();

    // Tests for isRainyDay
    @Test
    void testIsRainyDay() {
        assertTrue(forecast.isRainyDay(60, true));
        assertFalse(forecast.isRainyDay(40, true));
        assertFalse(forecast.isRainyDay(60, false));
        assertFalse(forecast.isRainyDay(40, false));
    }

    // Tests for getTemperatureAdvice
    @Test
    void testGetTemperatureAdvice() {
        assertEquals("It's freezing and windy, wear heavy winter clothes and a hat.", forecast.getTemperatureAdvice(-5, true));
        assertEquals("It's freezing, wear heavy winter clothes.", forecast.getTemperatureAdvice(-5, false));
        assertEquals("It's chilly and windy, wear a coat and a scarf.", forecast.getTemperatureAdvice(10, true));
        assertEquals("It's chilly, wear a coat.", forecast.getTemperatureAdvice(10, false));
        assertEquals("It's warm, dress lightly.", forecast.getTemperatureAdvice(25, true));
        assertEquals("It's warm, dress lightly.", forecast.getTemperatureAdvice(25, false));
    }

    // Tests for isSunnyDay
    @Test
    void testIsSunnyDay() {
        assertTrue(forecast.isSunnyDay(6, 10));
        assertFalse(forecast.isSunnyDay(4, 10));
        assertFalse(forecast.isSunnyDay(6, 30));
        assertFalse(forecast.isSunnyDay(4, 30));
    }

    // Tests for getWindSpeedAdvice
    @Test
    void testGetWindSpeedAdvice() {
        assertEquals("Very windy and rainy, it's stormy, better stay indoors.", forecast.getWindSpeedAdvice(60, true));
        assertEquals("Very windy, be careful if going outside.", forecast.getWindSpeedAdvice(60, false));
        assertEquals("Normal wind conditions.", forecast.getWindSpeedAdvice(20, true));
        assertEquals("Normal wind conditions.", forecast.getWindSpeedAdvice(20, false));
    }
}
