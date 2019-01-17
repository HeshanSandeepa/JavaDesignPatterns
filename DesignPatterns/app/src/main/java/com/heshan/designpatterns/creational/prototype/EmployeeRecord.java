/*

Prototype Pattern says that cloning of an existing object instead of creating new one and can also
be customized as per the requirement.

This pattern should be followed, if the cost of creating a new object is expensive and
resource intensive.

---------Advantage of Prototype Pattern

1. It reduces the need of sub-classing.
2. It hides complexities of creating objects.
3. The clients can get new objects without knowing which type of object it will be.
4. It lets you add or remove objects at runtime.

---------Usage of Prototype Pattern

1. When the classes are instantiated at runtime.
2. When the cost of creating an object is expensive or complicated.
3. When you want to keep the number of classes in an application minimum.
4. When the client application needs to be unaware of object creation and representation.
*/

package com.heshan.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRecord implements Cloneable {

    private List<String> empList;

    public EmployeeRecord() {
        empList = new ArrayList<String>();
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public  EmployeeRecord(List<String> list) {
        this.empList = list;
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() {
        List<String> temp = new ArrayList<String>(this.getEmpList());
        return new EmployeeRecord(temp);
    }
}
