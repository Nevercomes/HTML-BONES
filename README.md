# HTML-BONES
see http://www.nevercome.net  
or http://www.nevercome.cn

A website that supports converting web page design drafts and hand-drawn sketches into HTML code
> Simple，convenient，efficient，your html code generation assistant —— P2C  

#### Main Web Tech

- Spring MVC
- Apache Shiro

#### NN and DP Framework

- CNN
- LSTM
- TensorFlow
- Keras.js

#### Environment and Version

- JDK 1.8
- Maven 3.2
- Tomcat 8.5
- Spring 4.1.9
- Apache Shiro 1.2.3

#### Package Structure

- version 2018.11.19

```
--main /*all source*/
	--java /*source code*/
		--com.p2c.html_bones /*root package*/
			--common /*common code*/
				--annotation /*spring customize annotation*/
				--cache /*cache class files*/
				--config /*global project config,load .properties files*/
				--utils /*common utils*/
				--web /*common utils about http and servlets*/
			--modules /*module code*/
				--back /*background management page*/
					--domain /*pojo*/
					--exception /*customize exception*/
					--persistence /*layer of dao and persistence*/
					--service /*layer of service*/
					--web /*layer of controller*/
				--main /*html-bones trunk page*/
					--domain /*pojo*/
					--exception /*customize exception*/
					--persistence /*layer of dao and persistence*/
					--service /*layer of service*/
					--web /*layer of controller*/
				--sys
					--interceptor /*interceptor for system*/
					--listener /*customize webContextListener*/
				--python /*python script call*/
				--model /*model modules*/
	--resources /*source config*/
	--webapp /*web project root*/
	    --model /*tensorflow.js model*/
	        --pix2code /*screen-hot style model structure and weights*/
	        --sketch2code /*drawn style model structure and weights*/
	    --static
	        ...
	        --js
	            --model /*tensorflow.js for model inference*/
	        ...
--test /*single test source code*/
```



