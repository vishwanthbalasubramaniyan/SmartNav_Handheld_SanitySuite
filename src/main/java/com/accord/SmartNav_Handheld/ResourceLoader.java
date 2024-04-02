package com.accord.SmartNav_Handheld;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ResourceLoader {

    public static String getResourcePath(String resourceName) {
        ClassLoader classLoader = ResourceLoader.class.getClassLoader();
        if (classLoader == null) {
            // If the class loader is null, use the system class loader
            classLoader = ClassLoader.getSystemClassLoader();
        }

        // Try to load the resource using the class loader
        URL resourceUrl = classLoader.getResource(resourceName);

        if (resourceUrl != null) {

            try {
                Path path = Paths.get(resourceUrl.toURI());
                return  path.toString();
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
            // If the resource is found, return its path
        } else {
            // Resource not found
            throw new RuntimeException("URL is empty");
        }
    }

}
