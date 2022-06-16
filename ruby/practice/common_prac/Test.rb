class Test
    attr_accessor :cls1name
    attr_accessor :cls1constname

    @cls1name = "Venkat"
    @@cls1constname = "Krishnan"
end

cls1 = Test.new
cls2 = Test.new


cls1.cls1name = "Mari"
puts cls1.cls1name
puts cls2.cls1name

cls1.cls1constname = "Venky"
puts cls1.cls1constname
puts cls2.cls1constname

cls2.cls1constname = "Krish"
puts cls2.cls1constname