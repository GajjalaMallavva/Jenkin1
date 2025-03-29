class Student:
    def __init__(self, name, rollno, department):
        self.name = name
        self.rollno = rollno
        self.department = department

    def display_info(self):
        print("Student Information:")
        print(f"Name: {self.name}")
        print(f"Roll Number: {self.rollno}")
        print(f"Department: {self.department}")


# Static values for student details
name = "Madhavi"
rollno = 45
department = "IT"

# Create a Student object with static values
student = Student(name, rollno, department)

# Display the student information
student.display_info()

