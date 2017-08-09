package com.huiy.javaannotation;

import java.util.HashMap;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

/** 
 * �๦������
 * @author : yuanhui 
 * @date   : 2017��3��17��
 * @version 1.0
 *@SupportedAnnotationTypesע��������ProcessorҪ������ע������֡�
 *process ������annotations������ʾ ��ʾ�������ע�⼯��env��ʾ��ǰ����֮ǰ�����л�����
 *process�����ķ���ֵ��ʾannotations�е�ע���Ƿ����Processor����
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
