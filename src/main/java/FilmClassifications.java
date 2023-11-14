public class FilmClassifications {

    public static void main(String[] args) {
        int ageOfViewer = 0;
        System.out.println(getAvailableClassifications(ageOfViewer));
        }

    public static String getAvailableClassifications(int ageOfViewer) {
        String result;

        if (ageOfViewer < 4) {
            result = "No films are available.";
        }else if (ageOfViewer >= 4 && ageOfViewer < 8) {
            result = "U films are available.";
        }else if (ageOfViewer <= 8 && ageOfViewer < 12) {
            result = "U and PG films are available.";
        } else if (ageOfViewer >= 12 && ageOfViewer < 15) {
            result = "U, PG & 12 films are available.";
        } else if (ageOfViewer >= 15 && ageOfViewer < 18) {
            result = "U, PG, 12 & 15 films are available.";
        } else {
                result = "All films are available.";
            }
        return result;
    }
}

