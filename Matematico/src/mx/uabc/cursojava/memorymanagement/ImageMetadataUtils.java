package mx.uabc.cursojava.memorymanagement;

import com.drew.imaging.ImageMetadataReader;
import com.drew.metadata.Directory;
import com.drew.metadata.bmp.BmpHeaderDirectory;
import com.drew.metadata.exif.ExifIFD0Directory;
import com.drew.metadata.gif.GifHeaderDirectory;
import com.drew.metadata.jpeg.JpegDirectory;
import com.drew.metadata.png.PngDirectory;
import com.google.common.collect.ImmutableMap;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.UtilityClass;

import java.io.File;
import java.util.Map;
import java.util.Set;

@UtilityClass
public class ImageMetadataUtils {
    @Data
    @Builder
    private static class NeededImageTag {
        private int height;
        private int width;
    }
    private static final Map<Class<? extends Directory>, NeededImageTag> SUPPORTED_TYPES_MAP
            = new ImmutableMap.Builder<Class<? extends Directory>, NeededImageTag>()
            .put(JpegDirectory.class, NeededImageTag.builder().height(JpegDirectory.TAG_IMAGE_HEIGHT).width(JpegDirectory.TAG_IMAGE_WIDTH).build())
            .put(PngDirectory.class, NeededImageTag.builder().height(PngDirectory.TAG_IMAGE_HEIGHT).width(PngDirectory.TAG_IMAGE_WIDTH).build())
            .put(GifHeaderDirectory.class, NeededImageTag.builder().height(GifHeaderDirectory.TAG_IMAGE_HEIGHT).width(GifHeaderDirectory.TAG_IMAGE_WIDTH).build())
            .put(BmpHeaderDirectory.class, NeededImageTag.builder().height(BmpHeaderDirectory.TAG_IMAGE_HEIGHT).width(BmpHeaderDirectory.TAG_IMAGE_WIDTH).build())
            .put(ExifIFD0Directory.class, NeededImageTag.builder().height(ExifIFD0Directory.TAG_IMAGE_HEIGHT).width(ExifIFD0Directory.TAG_IMAGE_WIDTH).build())
            .build();
    private static final Set<Class<? extends Directory>> SUPPORTED_TYPES = SUPPORTED_TYPES_MAP.keySet();

    public static Metadata getMetadata(String url) {
        try {
            final File outputFile = new File(url);
            final long fileSize = outputFile.length();
            final com.drew.metadata.Metadata metadata = ImageMetadataReader.readMetadata(outputFile);
            for (final Class<? extends Directory> type : SUPPORTED_TYPES) {
                if (metadata.containsDirectoryOfType(type)) {
                    final Directory directory = metadata.getFirstDirectoryOfType(type);
                    final NeededImageTag tag = SUPPORTED_TYPES_MAP.get(type);
                    return new Metadata(url, directory.getInt(tag.width), directory.getInt(tag.height), fileSize);
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(String.format("[ERROR] Get metadata from url %s: %s", url, e.getMessage()));
            return null;
        }
    }
}
