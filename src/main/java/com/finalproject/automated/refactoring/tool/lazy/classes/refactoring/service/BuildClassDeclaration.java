package com.finalproject.automated.refactoring.tool.lazy.classes.refactoring.service;

import com.finalproject.automated.refactoring.tool.model.ClassModel;
import lombok.NonNull;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

public interface BuildClassDeclaration {
    String declare(@NonNull ClassModel targetClass, @NonNull ClassModel lazyClass);
}
