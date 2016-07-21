package com.taobao.rigel.rap.project.bo;

import java.util.Comparator;

import com.taobao.rigel.rap.common.utils.StringUtils;

public class ParameterComparator implements Comparator<Parameter> {

    public int compare(Parameter o1, Parameter o2) {
    	if(StringUtils.isNotBlank(o1.getSort()) && StringUtils.isNotBlank(o2.getSort())){
    		int sort1 = Integer.parseInt(o1.getSort());
    		int sort2 = Integer.parseInt(o2.getSort());
    		return sort1 < sort2 ? -1 : 1;
    	}
        return o1.getId() < o2.getId() ? -1 : 1;
    }

}
