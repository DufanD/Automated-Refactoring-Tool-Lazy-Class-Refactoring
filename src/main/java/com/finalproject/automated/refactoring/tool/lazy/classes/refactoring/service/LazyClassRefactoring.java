package com.finalproject.automated.refactoring.tool.lazy.classes.refactoring.service;

import com.finalproject.automated.refactoring.tool.model.ClassModel;
import lombok.NonNull;

import java.util.List;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

public interface LazyClassRefactoring {
    String refactor(@NonNull ClassModel targetClass, @NonNull ClassModel lazyClass);

    List<String> refactor(@NonNull List<ClassModel> targetClasses, @NonNull List<ClassModel> lazyClasses);
}
