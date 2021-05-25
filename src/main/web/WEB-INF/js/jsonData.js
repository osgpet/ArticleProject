/**
 * Author:beyondboy
 * Gmail:xuguoli.scau@gmail.com
 * Date: 2016/2/21
 * Time: 22:48
 */
$(document).ready(function()
{
    var urlstr=$('body').attr('class');
    console.info(urlstr);
    getJsonData(urlstr);
});
//根据urlstr,获取json数据
function getJsonData(urlstr)
{
    $.ajax
    (
        {
            url:urlstr,
            type:"GET",
            dataType:"json",
            success:function(data)
            {
                createShowingTable(data);
            },
            error:function()
            {
                alert("访问异常");
            }
        }
    );
}
//data就是json数据,动态的创建一个table,同时将后台获取的数据动态的填充到相应的单元格
function createShowingTable(data)
{
    console.info('进入当前的数据展现');
    //此处动态生成一个表格
    var tableStr="<table class='In-table' border='1'>"
    tableStr=tableStr+"<thead><td>文章序号</td><td>标题</td><td>出版时间</td><td>文章类型</td><td>作者名字</td><td>来源方</td></thead>"
    var len=data.length;
    for(var i=0;i<len;i++)
    {
        tableStr=tableStr+"<tr><td>"+data[i].articleId+"</td><td>"+data[i].title+"</td>"+"<td>"+data[i].pulishDate+"</td>"
        +"<td>"+data[i].articleType+"</td>"+"<td>"+data[i].authorName+"</td>"+"<td>"+data[i].sourceName+"</td>"+"</tr>"
    }
    tableStr=tableStr+"</table>";
    //将动态生成的table添加的事先隐藏的div中
    $("#dataTable").html(tableStr);
}