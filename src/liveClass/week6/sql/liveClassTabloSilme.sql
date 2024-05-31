--tablo ismi değiştirme
alter table yazarlar2 rename to yazarlar

--tablo içeriğini silme (DELETE)
delete from kitaplar

--tablo komple silme
drop table yazarlar

--tablodan bir eleman silme
delete from yazarlar where id=1;
delete from kitaplar where id=2;

--on delete cascade eklenmiş şekilde
delete from yazarlar where id=1;


