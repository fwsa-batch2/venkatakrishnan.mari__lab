require "./connect_db.rb"
connect_db!

ActiveRecord::Migration.create_table(:todos) do |rec|
  rec.column :todo_text, :text
  rec.column :due_date, :date
  rec.column :completed, :bool
end