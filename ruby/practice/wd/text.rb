puts "Enter your todo"
todo = gets
File.open("my_todos.txt", "a") {|f| f.write(todo)}