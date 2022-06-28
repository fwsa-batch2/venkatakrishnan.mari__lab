class TodosController < ApplicationController
  def index
        
  end
  def create 
    todo = Todo.new(user_params)
    if todo.save
      redirect_to "/todos/lists"
    else
      render plain: "Failure"
    end
  end


     def list
      @todos = Todo.all.map {|todo| todo}
      render "list"
     end 

     def destroy
      id = params[:id]
      todo = Todo.find(id)
      todo.destroy
      todo.save  
      redirect_to todos_lists
  end
     
  private
  def user_params
    params.require(:todos).permit(:task,:date,:completed)
  end

end
