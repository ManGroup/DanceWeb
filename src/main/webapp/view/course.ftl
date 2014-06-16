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
</script>


<div id="cc" class="easyui-layout" style="width:100%;height:100%;">
    <div class="easyui-layout" fit="true" style="height:250px;">
        <div region="north" style="height:44px;">
            <div style="float:right;margin:4px 5px 0 0">
                <input class="easyui-searchbox" prompt="Please input value" style="width:300px">
            </div>
            <div style="padding:2px 5px;">
                <a href="#" class="easyui-linkbutton" data-options="plain:true">Home</a>
                <a href="#" class="easyui-splitbutton" data-options="menu:'#mm1',iconCls:'icon-edit'">Edit</a>
                <a href="#" class="easyui-menubutton" data-options="menu:'#mm2',iconCls:'icon-help'">Help</a>
                <a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-save',toggle:true">Save</a>
                <a href="#" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-print'">Print</a>
            </div>
            <div id="mm1" style="width:150px;">
                <div data-options="iconCls:'icon-undo'">Undo</div>
                <div data-options="iconCls:'icon-redo',disabled:true">Redo</div>
                <div class="menu-sep"></div>
                <div>Cut</div>
                <div>Copy</div>
                <div>Paste</div>
                <div class="menu-sep"></div>
                <div>
                    <span>Toolbar</span>
                    <div style="width:150px;">
                        <div>Address</div>
                        <div>Link</div>
                        <div>Navigation Toolbar</div>
                        <div>Bookmark Toolbar</div>
                        <div class="menu-sep"></div>
                        <div>New Toolbar...</div>
                    </div>
                </div>
                <div data-options="iconCls:'icon-remove'">Delete</div>
                <div>Select All</div>
            </div>
            <div id="mm2" style="width:100px;">
                <div>Help</div>
                <div>Update</div>
                <div>About</div>
            </div>
        </div>

        <div region="east" title="East" split="true" style="width:200px">
            <ul class="easyui-tree">
                <li>
                    <span>My Documents</span>
                    <ul>
                        <li data-options="state:'closed'">
                            <span>Photos</span>
                            <ul>
                                <li>
                                    <span>Friend</span>
                                </li>
                                <li>
                                    <span>Wife</span>
                                </li>
                                <li>
                                    <span>Company</span>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <span>Program Files</span>
                            <ul>
                                <li>Intel</li>
                                <li>Java</li>
                                <li>Microsoft Office</li>
                                <li>Games</li>
                            </ul>
                        </li>
                        <li>index.html</li>
                        <li>about.html</li>
                        <li>welcome.html</li>
                    </ul>
                </li>
            </ul>
        </div>
        <div region="center">
            <table class="easyui-datagrid" rownumbers="true" striped="true" border="false" fit="true" fitColumns="true" pagination="true" remoteSort="false">
                <thead>
                <tr>
                    <th data-options="field:'itemid',sortable:true,width:100">Item ID</th>
                    <th data-options="field:'productid',sortable:true,width:100">Product</th>
                    <th data-options="field:'listprice',align:'right',sortable:true,width:100">List Price</th>
                    <th data-options="field:'attr1',width:250">Attribute</th>
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
        <div region="south" border="false" style="height:230px;padding-top:5px">
            <div class="easyui-layout" fit="true" style="height:210px;margin-top1:10px">
                <div region="west" split1="true" border="false" style="width:210px;">
                    <div id="calendarList" class="easyui-calendar" fit="true" onSelect="onSelect()j"></div>
                </div>
                <div region="east" style="width:300px;padding:10px;position:relative">
                    <div class="easyui-progressbar" value="50" style="width:250px;margin:10px 0"></div>
                    <div style="margin:20px 0;">
                        <input class="easyui-slider" style="width:250px" value="20" data-options="
								showTip:true,
								rule: [0,'|',25,'|',50,'|',75,'|',100]
							">
                    </div>
                    <div style="margin-top:50px">
                        <a href="#" class="easyui-tooltip" title="This is a tooltip message">Hover me</a>
                    </div>
                </div>
                <div region="center" border="false" style="padding:0 5px">
                    <div class="easyui-panel" fit="true" style="padding:10px;">
                        <div style="font-weight:bold;font-size:16px;margin-bottom:10px">Form Fields</div>
                        <table>
                            <tr>
                                <td>ValidateBox:</td>
                                <td>
                                    <input class="easyui-validatebox" required>
                                </td>
                            </tr>
                            <tr>
                                <td>CombobBox:</td>
                                <td>
                                    <select class="easyui-combobox" name="language" style="width:200px"><option value="ar">Arabic</option><option value="bg">Bulgarian</option><option value="ca">Catalan</option><option value="zh-cht">Chinese Traditional</option><option value="cs">Czech</option><option value="da">Danish</option><option value="nl">Dutch</option><option value="en" selected="selected">English</option><option value="et">Estonian</option><option value="fi">Finnish</option><option value="fr">French</option><option value="de">German</option><option value="el">Greek</option><option value="ht">Haitian Creole</option><option value="he">Hebrew</option><option value="hi">Hindi</option><option value="mww">Hmong Daw</option><option value="hu">Hungarian</option><option value="id">Indonesian</option><option value="it">Italian</option><option value="ja">Japanese</option><option value="ko">Korean</option><option value="lv">Latvian</option><option value="lt">Lithuanian</option><option value="no">Norwegian</option><option value="fa">Persian</option><option value="pl">Polish</option><option value="pt">Portuguese</option><option value="ro">Romanian</option><option value="ru">Russian</option><option value="sk">Slovak</option><option value="sl">Slovenian</option><option value="es">Spanish</option><option value="sv">Swedish</option><option value="th">Thai</option><option value="tr">Turkish</option><option value="uk">Ukrainian</option><option value="vi">Vietnamese</option></select>
                                </td>
                            </tr>
                            <tr>
                                <td>TimeSpinner:</td>
                                <td>
                                    <input class="easyui-timespinner" showSeconds="true" style="width:200px">
                                </td>
                            </tr>
                            <tr>
                                <td>DateTimeBox:</td>
                                <td>
                                    <input class="easyui-datetimebox" showSeconds="true" style="width:200px">
                                </td>
                            </tr>
                        </table>
                        <div style="margin:10px 0;">
                            <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'">Add</a>
                            <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove'">Remove</a>
                            <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save',toggle:true">Save</a>
                            <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-cut',disabled:true">Cut</a>
                            <a href="#" class="easyui-linkbutton">Text Button</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>