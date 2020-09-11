select stu_no,stu_name,class_name from t_class,t_student where t_class.id = t_student.class_id;
select class_no,class_name,t1.stu_count from t_student left join (select class_id,count(*)  stu_count from t_student group by class_id)t1
 on t1.class_id = t_student.id;