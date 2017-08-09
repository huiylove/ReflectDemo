package com.huiy.javaannotation;

import java.util.HashMap;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

/** 
 * 类功能描述
 * @author : yuanhui 
 * @date   : 2017年3月17日
 * @version 1.0
 *@SupportedAnnotationTypes注解描述了Processor要解析的注解的名字。
 *process 函数的annotations参数表示 表示待处理的注解集，env表示当前或是之前的运行环境。
 *process函数的返回值表示annotations中的注解是否被这个Processor接受
 *
 */
@SupportedAnnotationTypes({ "com.huiy.javaannotation.Description" })
public class MethodInfoProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {
        HashMap<String, String> map = new HashMap<String, String>();
        for (TypeElement typeElement : annotations) {
            for (Element element : env.getElementsAnnotatedWith(typeElement)) {
            	Description desc = element.getAnnotation(Description.class);
                map.put(element.getEnclosingElement().toString(), desc.value());
            }
        }
        return false;
    }
}
