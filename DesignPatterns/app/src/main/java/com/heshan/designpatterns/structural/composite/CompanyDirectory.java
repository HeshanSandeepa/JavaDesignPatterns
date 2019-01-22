/*
The Composite Pattern has four participants:

       Component – Component declares the interface for objects in the composition and for accessing
       and managing its child components. It also implements default behavior for the interface
       common to all classes as appropriate.

       Leaf – Leaf defines behavior for primitive objects in the composition. It represents leaf
       objects in the composition.

       Composite – Composite stores child components and implements child related operations in the
       component interface.

       Client – Client manipulates the objects in the composition through the component interface.


-------When to use Composite Design Pattern?

       01. Composite Pattern should be used when clients need to ignore the difference between compositions
       of objects and individual objects. If programmers find that they are using multiple objects
       in the same way, and often have nearly identical code to handle each of them, then composite
       is a good choice, it is less complex in this situation to treat primitives and composites as
       homogeneous.

       02. Less number of objects reduces the memory usage, and it manages to keep us away from
       errors related to memory like java.lang.OutOfMemoryError.
       Although creating an object in Java is really fast, we can still reduce the execution time of
       our program by sharing objects.

-------When not to use Composite Design Pattern?

       01. Composite Design Pattern makes it harder to restrict the type of components of a composite.
       So it should not be used when you don’t want to represent a full or partial hierarchy of objects.

       02. Composite Design Pattern can make the design overly general. It makes harder to restrict
       the components of a composite. Sometimes you want a composite to have only certain components.
       With Composite, you can’t rely on the type system to enforce those constraints for you.
       Instead you’ll have to use run-time checks.
*/


//composite

package com.heshan.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee {

    private List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public void showEmployeeDetails() {
        for(Employee emp : employeeList) {
            emp.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employeeList.remove(emp);
    }
}
