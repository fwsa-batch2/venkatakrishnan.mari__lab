class Student_s
    def initialize(roll_no, name)
      @roll_no = roll_no
      @name = name
      @is_enrolled = false
    end
  
    # Setter
    def enroll
      @is_enrolled = true
    end
  
    # Getter
    def is_enrolled?
      @is_enrolled
    end
  
    # Getter
    def name
      @name
    end
   
    # Getter
    def roll_no
      @roll_no
    end
  end

  str = Student_s.new(35, "Haiden")
  puts str.name 
  puts str.roll_no
  puts str.enroll