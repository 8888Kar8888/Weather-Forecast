public class WeatherForecast {

    public boolean isRainyDay(int chanceOfRain, boolean isCloudy) {
        return chanceOfRain > 50 && isCloudy;
    }

    public String getTemperatureAdvice(int temperature, boolean isWindy) {
        if (temperature < 0) {
            return isWindy ? "It's freezing and windy, wear heavy winter clothes and a hat." : "It's freezing, wear heavy winter clothes.";
        } else if (temperature < 20) {
            return isWindy ? "It's chilly and windy, wear a coat and a scarf." : "It's chilly, wear a coat.";
        } else {
            return "It's warm, dress lightly.";
        }
    }

    public boolean isSunnyDay(int uvIndex, int cloudCoverage) {
        return uvIndex > 5 && cloudCoverage < 20;
    }

    public String getWindSpeedAdvice(int windSpeed, boolean isRainy) {
        if (windSpeed > 50) {
            return isRainy ? "Very windy and rainy, it's stormy, better stay indoors." : "Very windy, be careful if going outside.";
        } else {
            return "Normal wind conditions.";
        }
    }
}
