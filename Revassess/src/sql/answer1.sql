select * from app_user left join user_role on user_role.role_id = app_user.role_id where user_role.name = 'BASIC_USER';
