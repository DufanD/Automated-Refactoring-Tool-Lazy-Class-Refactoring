package com.finalproject.automated.refactoring.tool.lazy.classes.refactoring.service.implementation;

import com.finalproject.automated.refactoring.tool.lazy.classes.refactoring.service.ClassAnalysis;
import com.finalproject.automated.refactoring.tool.model.ClassModel;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

@Service
public class ClassAnalysisImpl implements ClassAnalysis {
    @Override
    public Boolean isMainClass(ClassModel classModel) {
        Pattern pattern = Pattern.compile("static\\s+\\w+\\s+main\\(", Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(classModel.getFullContent());
        while(matcher.find()){
            return true;
        }
        return false;
    }
}
