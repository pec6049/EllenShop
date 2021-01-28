INSERT INTO product VALUES('P1234', '엘렌 jk', 59000, '데일리하게 입기 좋은 캐주얼 아이템', 'Outer', 'Ellen', 1000, 'new', 'P1234.jpg');
INSERT INTO product VALUES('P1235', '벨리 플라워 ops', 48000, '빈티지한 플라워 패턴과 색감의 포인트 원피스', 'Dress', 'Ellen', 1000, 'new', 'P1235.jpg');
INSERT INTO product VALUES('P1236', '포지티브 ash denim', 28500, '깔끔한 스트레이트핏에 데일리한 색감의 팬츠', 'Pants', 'Ellen', 1000, 'new', 'P1236.jpg');
INSERT INTO product VALUES('P1237', 'Scoop stripe tee', 18000, '사랑스럽고 데일리한 컬리의 스트라이프 티', 'Top', 'Ellen', 1000, 'new', 'P1237.jpg');

select * from product;

delete from product where p_id='P1236';