사용자 
- sys/system으로 로그인

//생성
CREATE USER cozy IDENTIFIED BY a123;


//권한부여
GRANT CONNECT,RESOURCE,DBA TO cozy;
GRANT CREATE TABLE, CREATE VIEW TO cozy;
GRANT CONNECT,DBA TO cozy;

//CUSTOMER


//item

CREATE TABLE ITEM
(itemNum NUMBER(8) PRIMARY KEY,
itemName varchar2(50),
itemMainType varchar2(20),
itemSubType varchar2(20),
itemPrice NUMBER(10),
itemDiscount NUMBER(10),
itemContent varchar2(50),
itemImage1 varchar2(20),
itemImage2 varchar2(20),
itemImage3 varchar2(20),
itemImage4 varchar2(20),
itemImage5 varchar2(20),
detailImage varchar2(20),
itemHitcount NUMBER (10),
itemStock NUMBER(10),
itemState varchar2(20),
todaydeal NUMBER(10),
itemColor varchar2(20),
itemSize varchar2(20));

//CART
CREATE TABLE CART
(CARTNUM NUMBER(8) PRIMARY KEY,
ITEMNUM NUMBER(8),
CUSTOMEREAMIL VARCHAR2(20),
ITEMQTY NUMBER(20),
FOREIGN KEY (CUSTOMEREAMIL) REFERENCES CUSTOMER(CUSTOMEREAMIL),
FOREIGN KEY (ITEMNUM) REFERENCES ITEM(ITEMNUM));
