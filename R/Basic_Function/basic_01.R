#1
a=c(80,60,70,50,90)
#2
mean(a)

#3
b=mean(a)
b

v_character <- c('���','������','���','������','���','������','������')
v_character
v_factor<-factor(v_character)
v_factor
mode(v_factor)
class(v_factor)
str(v_factor)

#
ex_label <- c("����","����","��","�߻�","���")

ordered_factor <- factor(ex_label, order=T)

ordered_factor 

factor(ex_label, levels=c("����","����","��","�߻�","���"))



#1
data4 <- seq(from = as.Date('2015-01-01'), to = as.Date('2015-01-31'), by=1)
data4

#2
vec1 <- c("���","��","��","����","������")
vec1
vec1[-3]

#3
vec1 <- c("��","����","����","�ܿ�")
vec2 <- c("��","����","�ʿ���","�ʰ���")
setdiff(vec1,vec2)
union(vec1,vec2)

#4
v1<-c(1:10)
v1

#5
v1[1:5]

#6
v1[3:7]

#7
v1[-c(3:7)]

#8
v1[3]<-0
v1[6]<-0
v1

#9
v1[9]<-0
v1

#10
class(v1)
v1<-as.numeric(v1)
class(v1)
v1

# v1�� �� �տ� 0�� �߰��Ͽ� ���(v1�� �������� ����)
v1<-c(0,v1)
v1

# v1�� 11��°�� 11�� �߰�. v1�� ������
v1[11]<-11
v1

# v1�� �� �ڿ� 14~20�� �߰�. v1�� ������
v1<-c(v1,14:20)
v1

# v1���� ������ �߰��� 11�� 14���̿� 12, 13�� �߰�.
v1<-c(v1[1:11],12,13,v1[12:18])
v1

# v2�� 100�� ����
v2<-100

# v1�� v2�� ���ϱ�
v1+v2

# v2�� 100, 200, 300�� ����
v2<-c(100,200,300)

# v1�� v2�� ���ϱ�
v1+v2

# v1�� v2�� ������ ����ϱ�
union(v1,v2)

# v1���� v2�� ������ ����ϱ�
setdiff(v1,v2)

# v2���� v1�� ������ ����ϱ�
intersect(v1,v2)

# v2�� �� �̸� (A, B, C) �����ϱ�
names(v2)<-c("A","B","C")
v2

# v3�� 5���� 5�� �������� 50���� �Ҵ�
v3<-seq(5,50,5)

# v4�� 5 6 5 6 5 6 �� �Ҵ�
v4<-c(5,6,5,6,5,6)

# v5�� -1 -1 -1 0 0 0 1 1 1 �� �Ҵ�
v5<-c(-1,-1,-1,0,0,0,1,1,1)

# v5�� ���� ���
length(v5)

# v3�� 15�� �ִ��� �˻�
v3==15
v3[3]

# v3�� 55�� �ִ��� �˻��Ͽ� ����� ���� vv�� ����
vv<-v3[3]
vv



#
list1 <- list(
name = 'James Seo',
address='Seoul',
tel = '010-8706-4712',
pay = 500)
list1
list1[[1]]
list1[[2]]
list1[[3]]

df_midterm <- data.frame(english=c(90,80,60,70), math = c(50,60,100,20), class = c(1,1,2,2))
df_midterm

sales2 <- matrix(c(1,'Apple',500,5,
                          2,'Peach',200,2,
                          3,'Banana',100,4,
                          4,'Grape',50,7),nrow=4,byrow=T)
sales2
df1 <- data.frame(sales2)  
df1
names(df1) <- c('NO','NAME','PRICE','QTY') 
df1
