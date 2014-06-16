<link rel="stylesheet" type="text/css" href="/stylesheets/default.css">
<script type="text/javascript" src="/vendor/jquery/jquery-1.10.2.js"></script>
<script type="text/javascript" src="/vendor/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/vendor/easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css" href="/vendor/easyui/themes/gray/easyui.css" id="swicth-style">
<link rel="stylesheet" type="text/css" href="/vendor/easyui/themes/icon.css">
<link rel="stylesheet" href="/vendor/easyui/themes/icon.css" type="text/css"/>
<script type="text/javascript" src="/javascripts/easyui-extend.js" charset="utf-8"></script>
<script src="/vendor/uploadify/jquery.uploadify.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="/vendor/uploadify/uploadify.css">
<script type="text/javascript">

    $(document).ready(function(){
        $('#calendarList').calendar({
            onSelect: function(date){
                alert(date.getFullYear()+":"+(date.getMonth()+1)+":"+date.getDate());
            }
        });
    });
    function addScheduleView() {
        console.log("addScheduleView");
    }
</script>


<div id="cc" class="easyui-layout" style="width:100%;height:100%;">
    <div class="easyui-layout" fit="true">

        <div region="west" title="日历" split="true" style="width:331px;">

            <div style="width: 320px;height: 320px;padding: 3px 2px 2px 2px;">
                <div id="calendarList" class="easyui-calendar" fit="true" onSelect="onSelect();"></div>
            </div>

            <div style="width: 320px;height: 26px;padding: 3px;background: #f3f3f3">
                今天课程
            </div>
            <div style="width: 320px;height: 300px;padding: 3px;background: #fbeed5">
                今天课程
            </div>
        </div>
        <div region="center" style="padding: 2px;">
            <div class="easyui-layout" fit="true">
                <div region="north" style="height:44px;">
                    <div style="padding:2px 5px;">
                        <a href="#" class="easyui-linkbutton" data-options="plain:true">全部课程</a>
                        <a href="#" class="easyui-linkbutton" data-options="plain:true" onclick="addScheduleView();">新建</a>
                        <a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-edit'">编辑</a>
                        <a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-help'">删除</a>
                    </div>
                </div>
                <div region="center">
                    <table class="easyui-datagrid" rownumbers="true" striped="true" border="false" fit="true" fitColumns="false" pagination="true" remoteSort="false">
                        <thead>
                        <tr>
                            <th data-options="field:'itemid',sortable:true,width:60">课程编号</th>
                            <th data-options="field:'productid',sortable:true,width:60">主题</th>
                            <th data-options="field:'listprice',sortable:true,width:60">开始时间</th>
                            <th data-options="field:'attr1',width:60">结束时间</th>
                            <th data-options="field:'attr1',width:60">费用</th>
                            <th data-options="field:'attr1',width:60">地点</th>
                            <th data-options="field:'attr1',width:60">教师</th>
                            <th data-options="field:'attr1',width:30">报名人数</th>
                            <th data-options="field:'attr1',width:30">创建者</th>
                            <th data-options="field:'attr1',width:30">创建时间</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>EST-1</td><td>FI-SW-01</td><td>36.50</td><td>Large</td>
                        </tr>
                        <tr>
                            <td>EST-10</td><td>K9-DL-01</td><td>18.50</td><td>Spotted Adult Female</td>
                        </tr>
                        <tr>
                            <td>EST-11</td><td>RP-SN-01</td><td>28.50</td><td>Venomless</td>
                        </tr>
                        <tr>
                            <td>EST-12</td><td>RP-SN-01</td><td>26.50</td><td>Rattleless</td>
                        </tr>
                        <tr>
                            <td>EST-13</td><td>RP-LI-02</td><td>35.50</td><td>Green Adult</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

    </div>
</div>