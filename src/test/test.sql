id, userid,productid,income,days
int  int     int       int   int 20210119
    用户id在    产品好  1      某一天
    2020年12月份，单天总收入大于100的userid 总收入 天

    userid, 总收入，tian

    select   userid, days, acount(income)   from  a.user  where  income>100  and days=20210118 group by userid, days;
