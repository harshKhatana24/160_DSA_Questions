//important question
//group data of employee in List, College Wise


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

record Employee(int id,String name,String college){}


public class Day227052026 {
    public static void main(String[] args) {
//        List<Employee> employeeList= List.of(new Employee(1, "A", "IIT"),
//                new Employee(2, "B", "NIT"),
//                new Employee(3, "C", "IIT"),
//                new Employee(4, "D", "IIT"),
//                new Employee(5, "E", "IIIT"),
//                new Employee(6, "F", "IIT"),
//                new Employee(7, "G", "IIT"),
//                new Employee(8, "H", "IIIT"),
//                new Employee(9, "I", "NIT"),
//                new Employee(10, "J", "NIT"),
//                new Employee(11, "K", "IIT"),
//                new Employee(12, "L", "IIT"),
//                new Employee(13, "M", "IIIT"),
//                new Employee(14, "N", "IIT"),
//                new Employee(15, "O", "NIT"),
//                new Employee(16, "P", "IIIT"));
//
//
//        //Group data ko according to their college
//        Map<String, List<Employee>> list=employeeList
//                .stream()
//                .collect(Collectors.groupingBy(e -> e.college()));
//
//        list.forEach((college,emp)->{
//            System.out.println(college);
//            emp.forEach(e-> System.out.println(e.id()+" "+e.name()));
//            System.out.println("-----------------------------------------------");
//        });










//        List<String> list=List.of("abcd","flight","fight","till","last","breath");
//        day39JavaInterviewQuestion obj = new day39JavaInterviewQuestion();
//        obj.convertListToMap_(list);













        List<Integer> list=List.of(3,2,1,4,5,2,8,20);
        day40 obj=new day40();
        obj.day40(list);

    }
}




//Convert List into map such that String is the key and value is the length of the string

class day39JavaInterviewQuestion{
    void convertListToMap_(List<String> list){



        //Method 1 - easy one no marks
//        Map<String,Integer> map=new HashMap<>();
//
//        list.stream()
//                .forEach(i -> {
//                    map.put(i,i.length());
//                });
//
//        map.forEach((str,len) -> System.out.println(str + " " + len));





        //Method 2 : Good one

        Map<String,Integer> map=list
                .stream()
                .collect(Collectors.toMap(val -> val, val -> val.length()));

        System.out.println(map);

    }



    //Day 40 Java interview question -> check whether anyMatch,noMatch,allMatch




}


class day40{
    void day40(List<Integer> list){
        boolean anyMatch=list.stream()
                .anyMatch(i -> i%2==0);
        boolean allMatch=list.stream()
                .allMatch(i -> i%2==0);
        boolean noMatch=list.stream()
                .noneMatch(i->i%2==0);


        System.out.println(anyMatch+ " "+ allMatch+ " "+noMatch);
    }
}