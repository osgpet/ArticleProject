/**
 * Created by Lenovo on 2016/2/18.
 */
var PageRow = document.getElementById('PageRow');                   //设置每页显示行数

var InTb = document.getElementById('input-table');               //表格

var Fp = document.getElementById('F-page');                      //首页

var Nep = document.getElementById('Nex-page');                  //下一页

var Prp = document.getElementById('Pre-page');                  //上一页

var Lp = document.getElementById('L-page');                     //尾页

var txtotalPage = document.getElementById('s1');                         //总页数

var txCurrentPage = document.getElementById('s2');                         //当前页数

var currentPage=1;//首页为1                                              //定义变量表示当前页数
//计算总页数
var totalPage;
var dataArray=[

    ["赵云","男","48"],

    ["林冲","男","40"],

    ["貂蝉","女","20"],

    ["程咬金","男","42"],

    ["元芳","男","35"],

    ["关羽","男","40"],

    ["张飞","男","39"],

    ["李白","男","41"],

    ["马超","男","28"],

    ["黄忠","男","65"],

    ["魏延","男","25"],

    ["杨贵妃","女","22"],

    ["武则天","女","24"],

    ["陈到","男","40"],

    ["姜维","男","2"],

    ["凤姐","女","22"],

    ["犀利哥","男","35"],

    ["本拉登","男","25"],

    ["春哥","你猜","22"],

    ["孔子","男","68"],

    ["老子","男","58"],

    ["孟子他妈","女","48"]];//定义变量表示总页数
if (dataArray.length % PageRow.value == 0)                    //判断总的页数
{
    totalPage = parseInt(dataArray.length / PageRow.value);
}
else {
    totalPage = parseInt(dataArray.length / PageRow.value) + 1
}
Fp.onclick = function () {
    if (PageRow.value != "")                                     //判断每页显示是否为空
    {
        currentPage=1;
        page(dataArray);
    }
}
Nep.onclick = function () {
    if (currentPage < totalPage)                                 //判断当前页数小于总页数
    {
        currentPage+=1;
        page(dataArray);
    }
    else
    {
        currentPage=1;
        page(dataArray);
    }

}
Prp.onclick=function(){
    if(currentPage>1)
    {
        currentPage-=1;
        page(dataArray);
    }
    else
    {
        currentPage=1;
    }
}
Lp.onclick=function(){
    currentPage=totalPage;
    page(dataArray);
}
var page=function(dataArray)
{
    InTb.innerHTML = '';                                     //每次进来都清空表格
    txCurrentPage.innerHTML = '';                                        //每次进来清空当前页数
    // currentPage = 1;
    txCurrentPage.appendChild(document.createTextNode(currentPage));
    txtotalPage.innerHTML = '';                                      //每次进来清空总页数
    txtotalPage.appendChild(document.createTextNode(totalPage));
    var oTBody = document.createElement('tbody');               //创建tbody
    oTBody.setAttribute('class', 'In-table');                   //定义class
    oTBody.insertRow(0);
    oTBody.rows[0].insertCell(0);
    oTBody.rows[0].cells[0].appendChild(document.createTextNode('文章序号'));
    oTBody.rows[0].insertCell(1);
    oTBody.rows[0].cells[1].appendChild(document.createTextNode('标题'));
    oTBody.rows[0].insertCell(2);
    oTBody.rows[0].cells[2].appendChild(document.createTextNode('出版时间'));
    oTBody.rows[0].insertCell(3);
    oTBody.rows[0].cells[3].appendChild(document.createTextNode('文章类型'));
    oTBody.rows[0].insertCell(4);
    oTBody.rows[0].cells[4].appendChild(document.createTextNode('作者名字'));
    oTBody.rows[0].insertCell(5);
    oTBody.rows[0].cells[5].appendChild(document.createTextNode('来源方'));
    InTb.appendChild(oTBody);                                     //将创建的tbody添加入table
    var end=PageRow.value *currentPage;//a等于每页显示的行数乘以上一页数                                             //定义变量a
    var c;                                                  //定义变量c
    var start=PageRow.value*(currentPage-1);
    if (dataArray.length - start >= PageRow.value)                  //判断下一页数组数据是否小于每页显示行数
    {
        c = PageRow.value;
    }
    //最后一页
    else {
        c = dataArray.length - start;
        // currentPage=1;
    }
    for (i =0; i < c; i++) {                                                        //循环打印数组值
        oTBody.insertRow(i + 1);
        for (j = 0; j < dataArray[i+start].length; j++) {
            oTBody.rows[i + 1].insertCell(j);
            oTBody.rows[i + 1].cells[j].appendChild(document.createTextNode(dataArray[i+start][j]));
        }
    }
}