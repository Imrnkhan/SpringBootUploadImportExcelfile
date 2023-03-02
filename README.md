
<h1>Spring Boot Upload/Download File to/from Database</h1>


Create Spring Boot Application to upload multipart files and get files’ information with static folder  download via Restful API.


Spring Boot Rest APIs for uploading Files to Database

Our Spring Boot Application will provide APIs for:

uploading File to PostgreSQL/MySQL database

downloading File database with the link

getting list of Files’ information (file name, url, type, size)

These are APIs to be exported:

Methods	Urls	Actions

POST	/upload	upload a File

GET	/files	get List of Files (name, url, type, size)

GET	/files/[fileId]	download a File

![image](https://user-images.githubusercontent.com/95843558/222312285-c14d26a0-9df2-46d7-ab2c-a6938a654c24.png)

![image](https://user-images.githubusercontent.com/95843558/222313902-f4145e35-30e1-46c4-a30e-2d50e377f34e.png)


1.POST Method

http://localhost:8087/api/excel/upload

![image](https://user-images.githubusercontent.com/95843558/222312547-d4d4d0f7-48ac-4c05-8e98-c899a1789666.png)

get some message



2. GET MEthod Lsit All

http://localhost:8087/api/excel/listAll

![image](https://user-images.githubusercontent.com/95843558/222313348-4382e5aa-d2f0-48bd-94a9-ec5d3f726c7f.png)


Retrieve list of Files’ information:


3. Get Method  Download Excel file

http://localhost:8087/api/excel/download

This way to Download file of get method in excel foemat all data.

