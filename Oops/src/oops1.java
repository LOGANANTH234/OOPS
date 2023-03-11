public class oops1 {
    public static void main(String[] args) {
        Student student1 = new Student(22,"logananth ");
        student1.welcome();
        student1.changeName("ahal");

        System.out.println(student1.name );
        System.out.println(student1.roll );
        Student student2 = new Student();

        System.out.println(student2.name );
        System.out.println(student2.roll );
        Student random= new Student(student1);
        System.out.println(random.roll);
//      final   Student one =new Student(99,"kji");
//        System.out.println(one.name);
//        one.name="kk";
//        //one=new Student(99,"koga");
//        System.out.println(one.name);

        for (int i = 0; i < 100000000; i++) {
            Student n=new Student();
        }

    }
}

    class Student{
         int roll = 1234567;
        String name ="default";
void welcome(){
    System.out.println("hi"+" "+name);
}
void changeName(String name){
    this.name=name;
}
        Student(int r,String f ){
            this.roll=r;
            this.name=f;
        }
        Student( Student other){
this.name=other.name;
        }
        Student(){

        }

//        @Override
//        protected void finalize() throws Throwable {
//            System.out.println("desrotyed");
//        }
    }
