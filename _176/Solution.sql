#通过两次max函数找到第二大的
select max(Salary) as SecondHighestSalary from Employee where Salary<(Select max(Salary) from Employee);