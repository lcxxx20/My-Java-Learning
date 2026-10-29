package com.lj;

public class Teacher {

        String name;
        int age;
        String teachcourses;
        private Teacher(){
        }
        public Teacher(String name,int age,String teachcourses){
            this.name=name;
            this.age=age;
            this.teachcourses=teachcourses;
        }
        public void setName(String name){
            this.name=name;
        }
        public void setAge(int age){
            this.name=name;
        }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 获取
     * @return teachcourses
     */
    public String getTeachcourses() {
        return teachcourses;
    }

    /**
     * 设置
     * @param teachcourses
     */
    public void setTeachcourses(String teachcourses) {
        this.teachcourses = teachcourses;
    }

    public String toString() {
        return "Teacher{name = " + name + ", age = " + age + ", teachcourses = " + teachcourses + "}";
    }
}
