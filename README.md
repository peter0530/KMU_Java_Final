程式碼僅供參考，不保證其正確性:stuck_out_tongue_winking_eye:


## 目錄
01.	[字串資料之比對(二技四技)](#字串資料之比對)
02.	[**:lollipop:因數分解**](#因數分解)
03.	[判斷輸入字串是否連續](#判斷輸入字串是否連續)
04.	[計算最大連續非遞減的數字長度](#計算最大連續非遞減的數字長度)
05.	[字串之統計](#字串之統計)
06.	[數學算式之求解](#數學算式之求解)
07.	[**:lollipop:楊暉三角塔（或稱巴斯卡三角型）**](#楊暉三角塔或稱巴斯卡三角型)
08.	字串處理
09.	[**:lollipop:身份證的驗證**](#身份證的驗證)
10.	隨機選取
11.	[**:lollipop:3*3的方陣相乘**](#3X3的方陣相乘)
12.	萬年曆
13.	魔術方塊
14.	[**:lollipop:給定a, b 計算其最大公因數GCD及最小公倍數 lcm**](#Q14)
15.	[**:lollipop:請寫一個程式，包含一個類別Dates，在建構元中初始化一個含有七個元素的字串陣列，分別對應到週日到週六的中文。提供一個方法String askDate(int d)，可接受1-7的數字，傳此數字對應星期的中文名。**](#Q15)
****

### 字串資料之比對

說明：計算兩等長之字串有多少個字元相同且同位置（以mA表示），以及多少個字元相同但不同位置（以nB表示）；  
	其中m與n為整數。輸入字串的字元範圍為A～Z，輸入的字元不可重覆，若是有小寫的字元，則需將所輸入的字元都轉成大寫來做判斷。兩字串之間以一個空白個區隔。先列A再列B，若無A或B則略之，若均無則輸出“無相同字元”。若是只輸入一個字串，則必須輸出“非兩個字串”，然後要求重新輸入。若是輸入的兩個字串不等長也必須輸出“不等長”。當輸入一字元“0”時即結束此程式。  
畫面輸出結果：

輸入：ABG  BZJG  
輸出：3B  
輸入：ABGJ　CBJG  
輸出：1A2B  
輸入：ABGI　ATGI  
輸出：3A  
輸入：ABGI　CYHK  
輸出：無相同字元  
輸入：ABGJ　BJG  
輸出：不等長  
輸入：ABGJ  
輸出：非兩個字串  
輸入：0 <-代表程式結束。


___

#### 因數分解

說明：請寫一個程式，輸入一個介於於1～100正整數，先把質數找出()，再求其質因數分解。程式中必須有須有判斷範圍的程式，若是超出題目所訂定的數值範圍則要求重新輸入。當輸入一字元“0”時即結束此程式。

畫面輸出結果：  
輸入：101  
輸出：範圍錯誤，請重新輸入。

輸入：72  
輸出：  
質數：2,  3,  5,  7,  11,  13,  17,  19,  23,  29,  31,  37,  41,  43,  47,  53,  59,  61,  67,  71,  
質因數  72=2(3)3(2)  

輸入：0 <-代表程式結束。

+ [Q2程式碼](./Q2.java)
___


#### 判斷輸入字串是否連續
說明：輸入五個阿拉伯數字組成數字集合A，若A集合中的數字不重複，且恰巧可組成連續的數字序列則輸出此一數字集合排序後的序列，否則輸出“不含連續不重複數字序列”。當輸入一字元“0”時即結束此程式。  
(1).如輸入84576  
輸出　連續序列　45678  
(2).如輸入23445  
輸出　不含連續不重複序列


畫面輸出結果：  
INPUT==>84576  
OUTPUT ==> 45678

INPUT==>12356  
OUTPUT==>不含連續不重複序列

INPUT==>23445  
OUTPUT==>不含連續不重複序列

INPUT==>0 <-代表程式結束。


___


#### 計算最大連續非遞減的數字長度

說明：求輸入大於0的正整數N(最多為十個位數)，輸出最大連續非遞減的數字長度。程式中必須有須有判斷範圍的程式，若是超出題目所訂定的字串長度則要求重新輸入。當輸入一字元“0”時即結束此程式。  
(1).如輸入8 4 5 7 2 6 8 8 0 2  
輸出  4  
(2).如輸入1 2 3 4 5 6 7 8 9 0  
輸出 9  
畫面輸出結果：  
INPUT==>12345678901  
OUTPUT ==>輸出：範圍錯誤，請重新輸入。

INPUT==>8457268802  
OUTPUT ==> 4

INPUT==>1234567890  
OUTPUT ==> 9

INPUT==>0 <-代表程式結束。


___


#### 字串之統計
說明：輸入一字串，該字串的字元總個數最多為15，且該字串內的字元僅含大寫英文字母、小寫英文字母、或數字，請計算每個字元出現的次數，累計並依次列出。程式中必須有須有判斷範圍的程式，若是超出題目所訂定的字串長度則要求重新輸入。當輸入一字元“0”時即結束此程式。  
畫面輸出結果：

輸入：1234567890123456  
輸出：範圍錯誤，請重新輸入。

輸入：6Aa886aBAa88  
輸出：111122212334

輸入：1234asd111223  
輸出：1111111234232  

輸入：0 <-代表程式結束


___


#### 數學算式之求解
說明：輸入一數學運算式，該運算式的運算元皆介於1～9，而運算子最多僅含“+”及“*”兩種，且該運算式的字元總個數（即運算元的個數加上運算子的個數）最多為15，則請輸出該數學運算式的最後結果值。程式中必須有須有判斷範圍的程式，若是超出題目所訂定的字串長度則要求重新輸入。當輸入一字元“0”時即結束此程式。
畫面輸出結果：  
輸入：1+2*8+9*7+5*6*5+7  
輸出：範圍錯誤，請重新輸入。

輸入：8  
輸出：8

輸入：1+9  
輸出：10

輸入：2*6  
輸出：12

輸入：1+4*6*5+9  
輸出：130

輸入：2+3*4+7*6*5+9  
輸出：233  

輸入：0 <-代表程式結束


___


#### 楊暉三角塔（或稱巴斯卡三角型）

說明：請寫出由第a階到第b階之楊暉三角塔（或稱巴斯卡三角型）。請注意：三角塔之排列須對偁，不可為倒三角或倒梯形，否則不予計分。輸入的數值範圍為0～10。程式中必須有須有判斷範圍的程式，若是超出題目所訂定的數值範圍則要求重新輸入。當輸入一字元“0”時即結束此程式。  
註：第n階之楊暉三角塔： ![C](https://raw.githubusercontent.com/peter0530/KMU_Java_Final/master/img/C.jpg "C") 

畫面輸出結果：  
請寫出a階到b階之楊暉三角塔：  
請輸入a  
11  
範圍錯誤，請重新輸入。

請輸入a  
6  
請輸入b  
4

1 4 6 4 1  
1 5 10 10 5 1  
1 6 15 20 15 6 1

請輸入a  
2  
請輸入b  
10

1  2  1    
1  3  3  1    
1  4  6  4  1  
1  5  10  10  5  1  
1  6  15  20  15  6  1  
1  7  21  35  35  21  7  1  
1  8  28  56  70  56  28  8  1  
1  9  36  84  126  126  84  36  9  1  
1  10  45  120  210  252  210  120  45  10  1  

請輸入a  
0  <-代表程式結束

+ [Q7程式碼](./Q7.java)

___


#### 身份證的驗證
輸入一個身份證字號，判斷該身份證號碼是否合法。身份證號碼最後一個數字是檢查碼，檢查碼的算法如下：  
(1)英文代號以下表轉換成數字  

| A=10 台北市   | J=18 新竹縣   | S=26 高雄縣   |
| ---------- | -----------| -----------|
| B=11 台中市   | K=19 苗栗縣   | T=27 屏東縣   |
| C=12 基隆市   | L=20 台中縣   | U=28 花蓮縣   |
| D=13 台南市   | M=21 南投縣   | V=29 台東縣   |
| E=14 高雄市   | N=22 彰化縣   | W=32 金門縣   |
| F=15 台北縣   | O=35 新竹市   | X=30 澎湖縣   |
| G=16 宜蘭縣   | P=23 雲林縣   | Y=31 陽明山   |
| H=17 桃園縣   | Q=24 嘉義縣   | Z=33 連江縣   |
| I=34 嘉義市   | R=25 台南縣   |             |  


(2)英文轉成的數字，個位數乘９再加上十位數  
(3)各數字從右到左依次乘１、２、３、４．．．．８  
(4)求出(2)，(3)之和  
(5)求出(4)除10後之餘數，用10減該餘數，結果就是檢查碼，若餘數為3，則檢查碼就是3  
註：程式中必須有須有判斷範圍的程式，若是超出題目所訂定的數值範圍則要求重新輸入。當輸入一字元“0”時即結束此程式。

例  
當輸入身分證號碼是 W100232736  
輸出：正確  
當輸入身份證號碼是 D021839328  
輸出：錯誤  
當輸入身份證號碼是 0  <-代表程式結束


INPUT:a123456789  
OUTPUT:範圍錯誤，第一個字母須為大寫英文，字串長度須為10，請重新輸入。

INPUT:W100232736 
OUTPUT:正確

INPUT: D021839328  
OUTPUT:錯誤

INPUT: 0  <-代表程式結束

+ [Q9程式碼](./Q9.java)

___


#### 3X3的方陣相乘

說明：由學生輸入2個3*3方陣(共18個矩陣因子)。進行矩陣相乘。程式最後詢問使用者是否還要繼續，輸入”０”則結束此程式。

![3*3](https://raw.githubusercontent.com/peter0530/KMU_Java_Final/master/img/3_3..jpg "3*3") 


畫面輸出結果：  
請輸入第一個方陣：  
請輸入第1個因子：1  
請輸入第2個因子：2  
請輸入第3個因子：3  
請輸入第4個因子：4  
請輸入第5個因子：5  
請輸入第6個因子：6  
請輸入第7個因子：7  
請輸入第8個因子：8   
請輸入第9個因子：9

請輸入第二方陣：  
請輸入第1個因子：1  
請輸入第2個因子：2  
請輸入第3個因子：3  
請輸入第4個因子：4  
請輸入第5個因子：5  
請輸入第6個因子：6  
請輸入第7個因子：7  
請輸入第8個因子：8  
請輸入第9個因子：9

第一個方陣：  
1	2	3  
4	5	6  
7	8	9

第二個方陣：  
1	2	3  
4	5	6  
7	8	9

方陣乘積：  
30	36	42  
66	81	96  
10*2	126	150

是否還要繼續(按'0'結束,按’1’繼續)：0  <-代表程式結束
 

+ [Q11程式碼](./Q11.java)

___


#### Q14
+ [Q14程式碼](./Q14.java)
___


#### Q15
+ [Q15程式碼](./Q15.java)
