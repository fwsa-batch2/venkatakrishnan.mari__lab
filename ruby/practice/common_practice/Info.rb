class Info
    @@name = "Venkata krishnan"
    def detail
    puts "Hi my name is #{@@name}. My age #{@age}. My roll no is #{@roll_no}"
        
    end
    def age1
        @age = 18
    end
    def roll
        @roll_no = 36
    end    
end
dtr = Info.new
dtr.age1
dtr.roll
dtr.detail
=begin
    
rescue => exception
    
=end