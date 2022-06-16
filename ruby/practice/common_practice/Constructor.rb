class Student
    def initialize(roll_no, name)
      @roll_no = roll_no
      @name = name
      @is_enrolled = false
    end
    def roll_no
        @roll_no
    end
    def name
        @name
    end
  end

  Students = Student.new(36, "Venkata krishnan") 
  puts Students.roll_no
  puts Students.name