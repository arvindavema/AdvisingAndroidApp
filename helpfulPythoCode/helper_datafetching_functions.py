from ftplib import all_errors
import requests
import json

courses_file = open("coursesData.json")

all_courses = json.loads(courses_file.read())

courses_file.close()


# cs_id = "CMSC"
# department_ids = []
# course_ids = []
# cs_courses = []

# for course in all_courses:
#     dept_id = course["dept_id"]

#     department_ids.append(course["dept_id"])

#     if (dept_id == cs_id):
#         cs_courses.append(course)


# with open("cs_courses.json", "w") as outfile:
#     json.dump(cs_courses, outfile)
#     print("cs_courses")
