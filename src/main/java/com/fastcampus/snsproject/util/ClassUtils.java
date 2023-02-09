package com.fastcampus.snsproject.util;

import java.util.Optional;

public class ClassUtils {

    public static <T>Optional<T> getSageCastInstance(Object o, Class<T> clazz){
        return clazz != null && clazz.isInstance(o) ? Optional.of(clazz.cast(o)) : Optional.empty();
    }
}