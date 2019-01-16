1.	字串資料之比對
2.	因數分解
3.	判斷輸入字串是否連續
4.	計算最大連續非遞減的數字長度
5.	字串之統計
6.	數學算式之求解
7.	楊暉三角塔（或稱巴斯卡三角型）
8.	字串處理
9.	身份證的驗證
10.	隨機選取
11.	3*3的方陣相乘
12.	萬年曆
13.	魔術方塊
14.	給定a, b 計算其最大公因數GCD及最小公倍數 lcm
15.	請寫一個程式，包含一個類別Dates，在建構元中初始化一個含有七個元素的字串陣列，分別對應到週日到週六的中文。提供一個方法String askDate(int d)，可接受1-7的數字，傳此數字對應星期的中文名。
 
題目：字串資料之比對(二技四技)

說明：計算兩等長之字串有多少個字元相同且同位置（以mA表示），以及多少個字元相同但不同位置（以nB表示）；其中m與n為整數。輸入字串的字元範圍為A～Z，輸入的字元不可重覆，若是有小寫的字元，則需將所輸入的字元都轉成大寫來做判斷。兩字串之間以一個空白個區隔。先列A再列B，若無A或B則略之，若均無則輸出“無相同字元”。若是只輸入一個字串，則必須輸出“非兩個字串”，然後要求重新輸入。若是輸入的兩個字串不等長也必須輸出“不等長”。當輸入一字元“0”時即結束此程式。
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
輸入：０ <-代表程式結束。



 
題目：因數分解	
說明：請寫一個程式，輸入一個介於於1～100正整數，先把質數找出()，再求其質因數分解。程式中必須有須有判斷範圍的程式，若是超出題目所訂定的數值範圍則要求重新輸入。當輸入一字元“0”時即結束此程式。
畫面輸出結果：
輸入：101
輸出：範圍錯誤，請重新輸入。

輸入：72
輸出：
質數：2,  3,  5,  7,  11,  13,  17,  19,  23,  29,  31,  37,  41,  43,  47,  53,  59,  61,  67,  71,  
質因數  72=2(3)3(2)

輸入：0	代表程式結束。



 
題目：判斷輸入字串是否連續(二技四技)	
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

INPUT==>０	代表程式結束。



 
題目：計算最大連續非遞減的數字長度(二技四技)	
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

INPUT==>０	代表程式結束。



 
題目：字串之統計(二技四技)	
說明：輸入一字串，該字串的字元總個數最多為15，且該字串內的字元僅含大寫英文字母、小寫英文字母、或數字，請計算每個字元出現的次數，累計並依次列出。程式中必須有須有判斷範圍的程式，若是超出題目所訂定的字串長度則要求重新輸入。當輸入一字元“0”時即結束此程式。
畫面輸出結果：

輸入：1234567890123456
輸出：範圍錯誤，請重新輸入。

輸入：6Aa886aBAa88
輸出：111122212334

輸入：1234asd111223
輸出：1111111234232

輸入：０	代表程式結束


 
題目：數學算式之求解	
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

輸入：0	代表程式結束

 
題目：楊暉三角塔（或稱巴斯卡三角型）	
說明：請寫出由第a階到第b階之楊暉三角塔（或稱巴斯卡三角型）。請注意：三角塔之排列須對偁，不可為倒三角或倒梯形，否則不予計分。輸入的數值範圍為0～10。程式中必須有須有判斷範圍的程式，若是超出題目所訂定的數值範圍則要求重新輸入。當輸入一字元“0”時即結束此程式。
註：第n階之楊暉三角塔：          ……   
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
0   代表程式結束


 
題目：身份證的驗證	
說明：輸入一個身份證字號，判斷該身份證號碼是否合法。身份證號碼最後一個數字是檢查碼，檢查碼的算法如下：
(1)英文代號以下表轉換成數字 
A=10 台北市	J=18 新竹縣	S=26 高雄縣
B=11 台中市	K=19 苗栗縣	T=27 屏東縣
C=12 基隆市	L=20 台中縣	U=28 花蓮縣
D=13 台南市	M=21 南投縣	V=29 台東縣
E=14 高雄市	N=22 彰化縣	W=32 金門縣
F=15 台北縣	O=35 新竹市	X=30 澎湖縣
G=16 宜蘭縣	P=23 雲林縣	Y=31 陽明山
H=17 桃園縣	Q=24 嘉義縣	Z=33 連江縣
I=34 嘉義市	R=25 台南縣	
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
當輸入身份證號碼是 0	代表程式結束


INPUT:a123456789
OUTPUT:範圍錯誤，第一個字母須為大寫英文，字串長度須為10，請重新輸入。

INPUT:W100232736
OUTPUT:正確

INPUT: D021839328
OUTPUT:錯誤

INPUT: 0	代表程式結束




 
題目：隨機選取	
說明：請由50位學生中抽出40位學生，抽出來的座號不可重覆，假設學生的座號是由1號到50號。輸出在螢幕上，輸出包括排序前及排序後的學生座號，以tab隔開。若有排序指令，不得使用排序指令。
畫面輸出結果：
排序前：
8	19	47	38	21	49	46	2	50	24
23	1	15	48	37	17	39	6	42	3
11	27	18	12	28	31	40	34	5	35
44	26	20	16	22	45	33	4	32	41

排序後：
1	2	3	4	5	6	8	11	12	15
16	17	18	19	20	21	22	23	24	26
27	28	31	32	33	34	35	37	38	39
40	41	42	44	45	46	47	48	49	50


 
題目：3*3的方陣相乘	
說明：由學生輸入2個3*3方陣(共18個矩陣因子)。進行矩陣相乘。程式最後詢問使用者是否還要繼續，輸入”０”則結束此程式。

a11
a12	a13	b11	b12	b13		c11	c12	c13
a21	a22	a23	b21	b22	b23	＝	c21	c22	c23
a31	a32	a33	b31	b32	b33		c31	c32	c33

矩陣內各元素相乘法則如下：
c11=a11b11+a12b21+a13b31
c12=a11b12+a12b22+a13b32
			…
c21=a21b11+a22b21+a23b31
			…
c33=a31b13+a32b23+a33b33

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
102	126	150

是否還要繼續(按'0'結束,按’1’繼續)：0	代表程式結束
 
題目：魔術方塊	
說明：輸入階數n(n<=15，且為奇數)，印出 之魔術方塊，該方塊之各列和各行和與對角線之和均相等。程式中必須有須有判斷範圍的程式，若是超出題目所訂定的數值範圍則要求重新輸入。當輸入“0”時即結束此程式。
畫面輸出結果：
請輸入階數:17
超出範圍，重新輸入

請輸入階數:4
超出範圍，重新輸入

請輸入階數:5
輸出結果
17	24	1	8	15	
23	5	7	14	16	
4	    6 	13	20	22	
10	12	19	21	3	
11 	18	25	2	9

請輸入階數:7
輸出結果
30	39	48	1	10	19	28	
38	47	7	9	18	27	29	
46	6	8	17	26	35	37	
5	14	16	25	34	36	45	
13	15	24	33	42	44	4	
21	23	32	41	43	3	12	
22	31	40	49	2	11	20	
請輸入階數:0      程式結束
 
題目：字串處理	
說明：求輸入大於0的正整數N（最多為十個位數），輸出每一個位數之數字，若該數字為0則不輸出，輸出位數的順序為：十億位、億位、千萬位、百萬位、十萬位、萬位、千位、百位、十位、個位。並找出此正整數中最大之數字，最後並將數字反轉輸出，反轉輸出時若最前面有數字為0則不輸出（如04321輸出4321）。程式中必須有須有判斷範圍的程式，若是超出題目所訂定的字串長度則要求重新輸入。當輸入一字元“0”時即結束此程式。
(1).如輸入8903
輸出 千位為8
百位為9
個位為3

最大為9
反轉輸出3098
(2).如輸入1234567890
輸出 十億位為1
億位為2
千萬位為3
百萬位為4
十萬位為5 
萬位為6
千位為7
百位為8 
十位為9

最大為9
反轉輸出987654321
(3).如輸入０	代表程式結束
畫面輸出結果：
INPUT==>8903
OUTPUT
千位為8
百位為9
個位為3

最大為9
反轉輸出3098


INPUT==>1234567892322
OUTPUT
輸入數字超過十位數請重新輸入

INPUT==>78030000
OUTPUT:
千萬位為7
百萬位為8
萬位為3

最大為8
反轉輸出3087
INPUT==>０	代表程式結束

 
題目：萬年曆	
說明：輸入西元年(大於0的正整數N)，輸出此年度之月曆。當輸入“0”時即結束此程式，需考慮平年或閏年。
(1).如輸入2004
輸出 
一月		二月		三月
日	一	二	三	四	五	六		日	一	二	三	四	五	六		日	一	二	三	四	五	六
				1	2	3		1	2	3	4	5	6	7			1	2	3	4	5	6
4	5	6	7	8	9	10		8	9	10	11	12	13	14		7	8	9	10	11	12	13
11	12	13	14	15	16	17		15	16	17	18	19	20	21		14	15	16	17	18	19	20
18	19	20	21	22	23	24		22	23	24	25	26	27	28		21	22	23	24	25	26	27
25	26	27	28	29	30	31		29								28	29	30	31			
																						
四月		五月		六月
日	一	二	三	四	五	六		日	一	二	三	四	五	六		日	一	二	三	四	五	六
				1	2	3								1				1	2	3	4	5
4	5	6	7	8	9	10		2	3	4	5	6	7	8		6	7	8	9	10	11	12
11	12	13	14	15	16	17		9	10	11	12	13	14	15		13	14	15	16	17	18	19
18	19	20	21	22	23	24		16	17	18	19	20	21	22		20	21	22	23	24	25	26
25	26	27	28	29	30			23	24	25	26	27	28	29		27	28	29	30			
								30	31													
																						
七月		八月		九月
日	一	二	三	四	五	六		日	一	二	三	四	五	六		日	一	二	三	四	五	六
				1	2	3		1	2	3	4	5	6	7					1	2	3	4
4	5	6	7	8	9	10		8	9	10	11	12	13	14		5	6	7	8	9	10	11
11	12	13	14	15	16	17		15	16	17	18	19	20	21		12	13	14	15	16	17	18
18	19	20	21	22	23	24		22	23	24	25	26	27	28		19	20	21	22	23	24	25
25	26	27	28	29	30	31		29	30	31						26	27	28	29	30	31	
十月		十一月		十二月
日	一	二	三	四	五	六		日	一	二	三	四	五	六		日	一	二	三	四	五	六
					1	2			1	2	3	4	5	6					1	2	3	4
3	4	5	6	7	8	9		7	8	9	10	11	12	13		5	6	7	8	9	10	11
10	11	12	13	14	15	16		14	15	16	17	18	19	20		12	13	14	15	16	17	18
17	18	19	20	21	22	23		21	22	23	24	25	26	27		19	20	21	22	23	24	25
24	25	26	27	28	29	30		28	29	30	31					26	27	28	29	30	31	
 (2).如輸入０	代表程式結束
畫面輸出結果：
Input:2004
Output:
一月		二月		三月
日	一	二	三	四	五	六		日	一	二	三	四	五	六		日	一	二	三	四	五	六
				1	2	3		1	2	3	4	5	6	7			1	2	3	4	5	6
4	5	6	7	8	9	10		8	9	10	11	12	13	14		7	8	9	10	11	12	13
11	12	13	14	15	16	17		15	16	17	18	19	20	21		14	15	16	17	18	19	20
18	19	20	21	22	23	24		22	23	24	25	26	27	28		21	22	23	24	25	26	27
25	26	27	28	29	30	31		29								28	29	30	31			
																						
四月		五月		六月
日	一	二	三	四	五	六		日	一	二	三	四	五	六		日	一	二	三	四	五	六
				1	2	3								1				1	2	3	4	5
4	5	6	7	8	9	10		2	3	4	5	6	7	8		6	7	8	9	10	11	12
11	12	13	14	15	16	17		9	10	11	12	13	14	15		13	14	15	16	17	18	19
18	19	20	21	22	23	24		16	17	18	19	20	21	22		20	21	22	23	24	25	26
25	26	27	28	29	30			23	24	25	26	27	28	29		27	28	29	30			
								30	31													
																						
七月		八月		九月
日	一	二	三	四	五	六		日	一	二	三	四	五	六		日	一	二	三	四	五	六
				1	2	3		1	2	3	4	5	6	7					1	2	3	4
4	5	6	7	8	9	10		8	9	10	11	12	13	14		5	6	7	8	9	10	11
11	12	13	14	15	16	17		15	16	17	18	19	20	21		12	13	14	15	16	17	18
18	19	20	21	22	23	24		22	23	24	25	26	27	28		19	20	21	22	23	24	25
25	26	27	28	29	30	31		29	30	31						26	27	28	29	30	31	
十月		十一月		十二月
日	一	二	三	四	五	六		日	一	二	三	四	五	六		日	一	二	三	四	五	六
					1	2			1	2	3	4	5	6					1	2	3	4
3	4	5	6	7	8	9		7	8	9	10	11	12	13		5	6	7	8	9	10	11
10	11	12	13	14	15	16		14	15	16	17	18	19	20		12	13	14	15	16	17	18
17	18	19	20	21	22	23		21	22	23	24	25	26	27		19	20	21	22	23	24	25
24	25	26	27	28	29	30		28	29	30	31					26	27	28	29	30	31	

 
題目：魔術方塊。	程式檔名：
說明：輸入階數n(n<=15，且為奇數)，印出 之魔術方塊，該方塊之各列和各行和與對角線之和均相等。程式中必須有須有判斷範圍的程式，若是超出題目所訂定的數值範圍則要求重新輸入。當輸入“0”時即結束此程式。
畫面輸出結果：
請輸入階數:5
輸出結果

17	24	1	8	15
23	5	7	14	16
4	6	13	20	22
10	12	19	21	3
11	18	25	2	9

請輸入階數:7
輸出結果

30	39	48	1	10	19	28
38	47	7	9	18	27	29
46	6	8	17	26	35	37
5	14	16	25	34	36	45
13	15	24	33	42	44	4
21	23	32	41	43	3	12
22	31	40	49	2	11	20

