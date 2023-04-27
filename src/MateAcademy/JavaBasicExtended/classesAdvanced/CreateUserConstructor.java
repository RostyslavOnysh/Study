package MateAcademy.JavaBasicExtended.classesAdvanced;



public class CreateUserConstructor {

        private String firstName;
        private String lastName;
        private String email;
        private int age;

    public CreateUserConstructor(String firstName,String lastName,int age){
this.firstName = firstName;
this.lastName = lastName;
this.age = age;
    }
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


