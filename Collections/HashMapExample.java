package Collections;
import java.util.ArrayList;
import java.util.HashMap;

        public class HashMapExample {

            public static void main(String[] args) {

                ArrayList<String> arrList = new ArrayList<String>();

                arrList.add("Vikas");
                arrList.add("Wong");

                //System.out.println(arrList.get(1));

                HashMap<String, String> testMap = new HashMap<String, String>();

                testMap.put("A", "Vikas");
                testMap.put("B", "Vikas");
                testMap.put(null, "Vikas");
                testMap.put(null, "Vikas");

                //System.out.println(testMap);
                //System.out.println(testMap.get(null));

                HashMap<String, Student> studentinfo = new HashMap<String, Student>();
                ArrayList<Student> studentList = new ArrayList<Student>();

                Student s1 = new Student();

                s1.setName("Vikas");
                s1.setClassName(5);
                s1.setCountryName("India");
                s1.setDateOfBirth("23-03-2005");
                s1.setIdValue(1001);
                s1.setFatherName("ABC");

                studentinfo.put("VK1000", s1);
                studentList.add(s1);

                Student s2 = new Student();
                s1.setName("Maryam");
                s1.setClassName(6);
                s1.setCountryName("US");
                s1.setDateOfBirth("23-03-2015");
                s1.setIdValue(1002);
                s1.setFatherName("XYZ");
                studentinfo.put("MR1001", s2);
                studentList.add(s2);

                s1 = new Student();
                studentinfo.put("MO1002", s1);
                studentList.add(s1);

                s1 = new Student();
                studentinfo.put("BK1002", s1);
                studentList.add(s1);

                //System.out.println(studentinfo);

                Student getInfo = studentinfo.get("VK1000");

                System.out.println(getInfo.getName());
                System.out.println(getInfo.getCountryName());

                //If you want to Print all the keys

                for (String j : studentinfo.keySet()) {
                    System.out.println(j);
                }

                for (Student st : studentinfo.values()) {
                    System.out.println(st.getName());
                    //System.out.println(getInfo.getCountryName());
                }


            }

        }

