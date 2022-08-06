package radioman;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

        public void setCurrentRadioStation(int station) {
            if (station < 0) {
                return;
            } else if (station > 9) {
                return;
            } else {
                this.currentRadioStation = station;
            }
        }

        public int getCurrentRadioStation() {
            return currentRadioStation;
        }

        public void nextRadioStation() {
            if (currentRadioStation == 9) {
                currentRadioStation = 0;
            } else {
                this.currentRadioStation++;
            }
        }

        public void prevRadioStation() {
            if (currentRadioStation == 0) {
                currentRadioStation = 9;
            } else {
                currentRadioStation--;
            }
        }

        public void setCurrentVolume(int volume) {
            if (volume < 0) {
                return;
            } else if (volume > 10) {
                return;
            } else {
                this.currentVolume = volume;
            }
        }

        public int getCurrentVolume() {
            return currentVolume;
        }

        public void volumeUp() {
            if (currentVolume < 10) {
                this.currentVolume++;
            }
        }

        public void volumeDown() {
            if (currentVolume > 0) {
                this.currentVolume--;
            }
        }

}
