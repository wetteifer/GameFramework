/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wetteifer.gfw;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author wetteifer
 */
public abstract class ResourceLoader<T> {

    private Map<String, T> resources;

    protected ResourceLoader() {
        resources = new HashMap<String, T>();
    }

    protected abstract T load(URL url);

    public T get(String name) {
        T res = resources.get(name);

        if (res == null) {
            res = load(getClass().getClassLoader().getResource(name));
            if (res != null) {
                resources.put(name, res);
            } else {
                System.out.println("Can't load resource: " + name);
            }
        }

        return res;
    }

    public void clear() {
        resources.clear();
    }

}
