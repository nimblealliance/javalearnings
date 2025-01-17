public class University {

    static class Department{
        private String name;

        public Department(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Department{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }


    private String universityName;
    private Department department;

    public University(String universityName, String departmentName) {
        this.universityName = universityName;
        this.department = new Department(departmentName);
    }

    public void displayDetails(){
        System.out.println("University="+universityName+" , "+"Department name="+department.getName());
    }
}
