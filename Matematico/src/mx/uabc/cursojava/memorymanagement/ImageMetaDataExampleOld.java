package mx.uabc.cursojava.memorymanagement;

public class ImageMetaDataExampleOld {
    public static void main(String[] args) {
        try {
            final String url = "C:\\Users\\cachavez\\Downloads\\rc_large.jpeg";
            for (int i = 0; i < 2000; i ++) {
                Metadata metadata = ImageMetadataUtilsOld.getMetadataLocalFile(url);
                System.out.println(String.format("Count %d URL: %s, metadata: %s", i, url, metadata.toString()));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
