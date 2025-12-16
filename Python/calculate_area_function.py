# AnshumanSarma_WAP to calculate area of shapes using functions


def circle_area(radius):
    pi = 3.14
    return pi * radius * radius

def rectangle_area(length, breadth):
    return length * breadth

def triangle_area(base, height):
    return 0.5 * base * height

r = float(input("Enter the radius of a circle: "))
print("Area of the circle: ", circle_area(r))
print()

l = float(input("Enter the length of a rectangle: "))
b = float(input("Enter the breadth of a rectangle: "))
print("Area of the Rectangle: ", rectangle_area(l, b))
print()

base = float(input("Enter the base of the triangle: "))
height = float(input("Enter the height of the triangle: "))
print("Area of the triangle: ", triangle_area(base, height))
print()
