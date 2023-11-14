import org.example.App;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Classification_Tests {

    @Test
    @DisplayName("Check if 2 returns \"No films are available.\"")
    public void checkIf2ReturnsNoFilmsAreAvailable(){
        Assertions.assertEquals("No films are available.", FilmClassifications.getAvailableClassifications(2));
    }

    @Test
    @DisplayName("Check if 6 returns \"U films are available.\"\"")
    public void checkIf6ReturnsUFilmsAreAvailable(){
        Assertions.assertEquals("U films are available.", FilmClassifications.getAvailableClassifications(6));
    }

    @Test
    @DisplayName("Check if 8 returns \"U and PG films are available.\"\"")
    public void checkIf8ReturnsU_PGFilmsAreAvailable(){
        Assertions.assertEquals("U and PG films are available.", FilmClassifications.getAvailableClassifications(8));
    }


    @Test
    @DisplayName("Check if 15 returns \"U, PG, 12 & 15 films are available.\"")
    public void checkIf15ReturnsU_PG_12_15FilmsAreAvailable(){
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", FilmClassifications.getAvailableClassifications(15));
    }

    @Test
    @DisplayName("Check if 18 returns \"All films are available.\"")
    public void checkIf18ReturnsAllFilmsAreAvailable(){
        Assertions.assertEquals("All films are available.", FilmClassifications.getAvailableClassifications(18));
    }


    @ParameterizedTest
    @ValueSource(ints = {19,22,600})
    @DisplayName("Check against 19, 22, 600")
    public void checkAgainst19_22_600(int ageOfViewer){
        Assertions.assertEquals("All films are available.", FilmClassifications.getAvailableClassifications(ageOfViewer));
    }
}
