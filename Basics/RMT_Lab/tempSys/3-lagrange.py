import sympy
import numpy as np
class Lagrange:
    def __init__(self):
        self.procedure()
    
    def matrix_solve(self,x,y,fxx,fyy,fxy,fyx,gx,gy):
        n_array = np.array([[fxx, fxy,gx], [fyx, fyy,gy],[gx,gy,0]])
        det = np.linalg.det(n_array)
        if(int(det)>0):
            self.user_defined_function(x,y,1)
        else:
            self.user_defined_function(x,y,0)
    
    def procedure(self):
        x,y,alpha=sympy.symbols('x y alpha')
        objective_function=((x*x+y*y))+alpha*(1-x-y)
        constraint=x+y-1
        diff_x=sympy.diff(objective_function,x)
        double_diff_x=sympy.diff(objective_function,x,2)
        diff_y=sympy.diff(objective_function,y)
        double_diff_y=sympy.diff(objective_function,y,2)
        diff_alpha=sympy.diff(objective_function,alpha)
        diff_x_y=sympy.diff(diff_x,y)
        diff_y_x=sympy.diff(diff_y,x)
        constraint_diff_x=sympy.diff(constraint,x)
        constraint_diff_y=sympy.diff(constraint,y)
        diff_x_eq=sympy.Eq(diff_x,0)
        diff_y_eq=sympy.Eq(diff_y,0)
        diff_alpha_eq=sympy.Eq(diff_alpha,0)
        answers=sympy.solve((diff_x_eq,diff_y_eq,diff_alpha_eq),(x,y,alpha))
        x=answers[x]
        y=answers[y]
        alpha=answers[alpha]
        
        # print(constraint_diff_x)
        self.matrix_solve(x,y,int(double_diff_x),int(double_diff_y),int(diff_x_y),int(diff_y_x),int(constraint_diff_x),int(constraint_diff_y))
        # return x,y,alpha
        
    
    def user_defined_function(self,x,y,type_func):
        if(type_func==1):
            print(f"maximum value is :- {(x*x+y*y)}")
        else:
            print(f"minimum value is :- {(x*x+y*y)}")
    
    # def user_defined_constraint(self,x,y):
    #     return x+y-72
    
L=Lagrange()
    
    
    
    