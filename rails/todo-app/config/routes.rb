Rails.application.routes.draw do
  get 'todos/index'
  match '/a', :to=> 'todos#create', :via=>:post
  match 'todos/lists', :to=> 'todos#list', :via=> :get
  delete 'todos/:id', to: 'todos#destroy'
  # For details on the DSL available within this file, see https://guides.rubyonrails.org/routing.html
end
