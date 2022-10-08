package mx.uabc.cursojava.memorymanagement;

public class Metadata {
    private String url;
    private Integer width;
    private Integer height;
    private Long fileSizeInBytes;

    public Metadata(String url, Integer width, Integer height, Long fileSizeInBytes) {
        this.url = url;
        this.width = width;
        this.height = height;
        this.fileSizeInBytes = fileSizeInBytes;
    }

    public String toString() {
        return new StringBuilder()
                .append("Width ").append(width)
                .append(", Height: ").append(height)
                .append(", Size: ").append(fileSizeInBytes)
                .toString();
    }
}