package com.yloonspring.accservers.constant;

public class DBConstant {

    /* 数据源主备切换 */
    public static final String DS_MASTER = "master"; //主数据源配置
    public static final String DS_SLAVE = "slave"; //备数据源配置
    public static final String DS_DYNAMIC = "dynamic"; //动态数据源配置

    /* 数据源路由  */
    public static final String DS_STRATEGY_LOCAL = "local"; //从本地配置
    public static final String DS_STRATEGY_ETCD = "etcd"; //从etcd获取

    /* yml文件配置key值 */
    public static final String  DS_YML_QUALIFIER_KEY = "datasource.qualifier"; //主备还是动态
    public static final String DS_YML_INITWAY_KEY ="datasource.initway";  //local还是etcd

}
