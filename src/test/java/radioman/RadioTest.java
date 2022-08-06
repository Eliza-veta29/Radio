package radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    Radio station = new Radio();
    private int currentRadioStation;

    @Test
    public void currentRadioStation() {

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
        @ParameterizedTest
        @CsvSource({"0,0", "-1,0", "10,0", "1,1", "8,8", "9,9",  })
        public void shouldSetStation(int inStation, int expected) {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(inStation);
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @ParameterizedTest
        @CsvSource({"1,2", "8,9", "9,0", "0,1", "-1,1", "10,1"})
        public void shouldNextStation(int inStation, int expected) {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(inStation);
            radio.nextRadioStation();
            int actual = radio.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @ParameterizedTest
        @CsvSource({"0,9", "9,8", "-1,9","1,0", "8,7", "10,9"})
        public void shouldPrevStation(int inStation, int expected) {
            Radio radio = new Radio();
            radio.setCurrentRadioStation(inStation);
            radio.prevRadioStation();
            int actual = radio.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @ParameterizedTest
        @CsvSource({"9,9", "10,10", "-1,0", "0,0", "1,1",  "11,0"})
        public void shouldSetVolume(int inVolume, int expected) {
            Radio radio = new Radio();
            radio.setCurrentVolume(inVolume);
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @ParameterizedTest
        @CsvSource({"0,1", "1,2", "-1,1", "11,1", "9,10", "10,10",})
        public void shouldIncreaseVolume(int inVolume, int expected) {
            Radio radio = new Radio();
            radio.setCurrentVolume(inVolume);
            radio.volumeUp();
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @ParameterizedTest
        @CsvSource({"0,0", "1,0", "-1,0", "9,8", "10,9", "11,0"})
        public void shouldDecreaseVolume(int inVolume, int expected) {
            Radio radio = new Radio();
            radio.setCurrentVolume(inVolume);
            radio.volumeDown();
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

    }