/*
1.新添加一个会话 cookie： 
1
$.cookie('the_cookie', 'the_value');
注：当没有指明 cookie有效时间时，所创建的cookie有效期默认到用户关闭浏览器为止，所以被称为 
“会话cookie（session cookie）”。 
2.创建一个cookie并设置有效时间为 7天:
    1
$.cookie('the_cookie', 'the_value', { expires: 7 });
注：当指明了cookie有效时间时，所创建的cookie被称为“持久 cookie （persistent cookie）”。 
3.创建一个cookie并设置 cookie的有效路径： 
1
$.cookie('the_cookie', 'the_value', { expires: 7, path: '/' });
注：在默认情况下，只有设置 cookie的网页才能读取该 cookie。如果想让一个页面读取另一个页面设
置的cookie，必须设置cookie的路径。cookie的路径用于设置能够读取 cookie的顶级目录。将这
个路径设置为网站的根目录，可以让所有网页都能互相读取 cookie （一般不要这样设置，防止出现冲突） 。 
4.读取cookie： 
1
2
$.cookie('the_cookie'); // cookie存在 => 'the_value' 
$.cookie('not_existing'); // cookie不存在 => null
5.删除cookie，通过传递null作为cookie的值即可： 
1
$.cookie('the_cookie', null);
----------相关参数的解释---------------
    1).expires: 365
定义cookie的有效时间，值可以是一个数字（从创建cookie时算起，以天为单位）或一个Date 对
象。如果省略，那么创建的cookie是会话cookie，将在用户退出浏览器时被删除。 
2).path: '/'
默认情况：只有设置cookie的网页才能读取该cookie。 
定义cookie的有效路径。默认情况下， 该参数的值为创建 cookie 的网页所在路径（标准浏览器的行为） 。 
如果你想在整个网站中访问这个cookie需要这样设置有效路径：path: '/'。如果你想删除一个定义
了有效路径的 cookie，你需要在调用函数时包含这个路径:$.cookie('the_cookie', null,
    { path: '/' });。 domain: 'example.com'
默认值：创建 cookie的网页所拥有的域名。 
3).secure: true
默认值：false。如果为true，cookie的传输需要使用安全协议（HTTPS）。 
4).raw: true
默认值：false。 
默认情况下，读取和写入 cookie 的时候自动进行编码和解码（使用encodeURIComponent 编码， 
decodeURIComponent 解码）。要关闭这个功能设置 raw: true 即可。*/

jQuery(function () {
    initSummernote();
    initFileInput();

});

function initLoginInfo() {
    var url = 'http://chaxun.1616.net/s.php?type=ip&output=json&callback=?&_='
        + Math.random();
    $.getJSON(url, function (data) {
        saveLoginInfo(JSON.stringify(data));
    });

}

/**
 * 初始化summernote
 */
function initSummernote() {
    $('#editor')
        .summernote(
            {
                lang: 'zh-CN',
                minHeight: 240,
                disableLinkTarget: true,
                dialogsFade: true,
                placeholder: '请输入描述文字，嗯，没错，就是你想的那样.....',
                toolbar: [
                    // [groupName, [list of button]]
                    ['style', ['bold', 'italic', 'underline', 'clear']],
                    ['font', ['strikethrough', 'superscript', 'subscript']],
                    ['fontsize', ['fontsize']],
                    ['color', ['color']],
                    ['para', ['ul', 'ol', 'paragraph']],
                    ['height', ['height']],],
            });
}

/**
 * 初始化fileinput
 */
function initFileInput() {
    $("#file-1").fileinput({

        // 同步提交
        // language: 'zh', //设置语言
        // showUpload: false, //是否显示上传按钮
        // showRemove:true,
        // dropZoneEnabled: false,
        // showCaption: true,//是否显示标题
        // allowedPreviewTypes: ['image'],
        // allowedFileTypes: ['image'],
        // allowedFileExtensions: ['jpg', 'png','gif'],
        // maxFileSize : 2000,
        // maxFileCount: 8,
        // uploadAsync: false, //同步上传

        // 异步上传
        language: 'zh', // 设置语言
        uploadUrl: '#', // 上传地址
        showUpload: false, // 是否显示上传按钮
        showRemove: true,
        dropZoneEnabled: false,
        showCaption: true,// 是否显示标题
        allowedPreviewTypes: ['image'],
        allowedFileTypes: ['image'],
        allowedFileExtensions: ['jpg', 'png'],
        maxFileCount: 8,
        maxImageWidth: "300px"
    });
}

function saveLoginInfo(info) {

    $.ajax({

        url: "log/saveLoginInfo",

        data: info,

        dataType: "json",

        type: "post",

        success: function (data) {

            if (data.Result == "success") {

                alert("保存成功")

            }

        }

    })

}

// 弹出分享框
/*
 * <div class="modal fade" id="myModal" tabindex="-1" role="dialog"
 * aria-labelledby="myModalLabel" aria-hidden="true"> <div class="modal-dialog">
 * <div class="modal-content"> <div class="modal-header"> <button type="button"
 * class="close" data-dismiss="modal" aria-hidden="true"> &times; </button>
 * <h4 class="modal-title" id="myModalLabel"> 上传分享 </h4> </div> <div
 * class="modal-body"> <form enctype="multipart/form-data"> <div
 * class="form-group"> <label for="name">输入标题</label> <input type="text"
 * class="form-control" id="name" placeholder="请输入分享标题，越夸张越好..."> </div> <br>
 * <label for="name">选择图片</label> <div class="form-group"> <input id="file-1"
 * type="file" multiple> </div> <br> <label for="name">编辑文字</label> <div
 * id="editor"></div> </form> </div> <div class="modal-footer"> <button
 * type="button" class="btn btn-default" data-dismiss="modal">关闭 </button>
 * <button type="button" class="btn btn-primary"> 上传 </button> </div> </div><!--
 * /.modal-content --> </div><!-- /.modal --> </div>
 */
var modal = Vue
    .extend({
        template: '<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">\n'
        + '    <div class="modal-dialog">\n'
        + '        <div class="modal-content">\n'
        + '            <div class="modal-header">\n'
        + '                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">\n'
        + '                    &times;\n'
        + '                </button>\n'
        + '                <h4 class="modal-title" id="myModalLabel">\n'
        + '                    上传分享\n'
        + '                </h4>\n'
        + '            </div>\n'
        + '            <div class="modal-body">\n'
        + '                <form enctype="multipart/form-data">\n'
        + '                    <div class="form-group">\n'
        + '                        <label for="name">输入标题</label>\n'
        + '                        <input type="text" class="form-control" id="name"\n'
        + '                               placeholder="请输入分享标题，越夸张越好...">\n'
        + '                    </div>\n'
        + '                    <br>\n'
        + '                    <label for="name">选择图片</label>\n'
        + '                    <div class="form-group">\n'
        + '                        <input id="file-1" type="file" multiple>\n'
        + '                    </div>\n'
        + '                    <br>\n'
        + '                    <label for="name">编辑文字</label>\n'
        + '                    <div id="editor"></div>\n'
        + '                </form>\n'
        + '            </div>\n'
        + '            <div class="modal-footer">\n'
        + '                <button type="button" class="btn btn-default" data-dismiss="modal">关闭\n'
        + '                </button>\n'
        + '                <button type="button" class="btn btn-primary">\n'
        + '                    上传\n'
        + '                </button>\n'
        + '            </div>\n'
        + '        </div><!-- /.modal-content -->\n'
        + '    </div><!-- /.modal -->\n' + '</div>'
    });

Vue.component('modal', modal);

// 查找登陆用户
var vm = new Vue({
    el: '#login',
    mounted: function () {
        // $.getJSON("http://localhost:63342/WebContent/WEB-INF/view/index/1.txt",
        //     function (result) {
        //         vm.result = result.data[0];
        //     })
        debugger;
        var userInfo = $.parseJSON(getCookie("yourView_userInfo"));
        if (userInfo != null && userInfo != undefined) {
            vm.result = userInfo.data[0]
        } else {
            vm.seen = true;
        }

    },
    component: {
        'user' : {
            template: '<li><a>ssss</a></li>'
        }
    },
    method: {},
    data: {
        seen: false,
        result: {}
    }
});

var vm2 = new Vue({
    el: '#modal'
});

/**
 * 得到用户存储的cookie信息
 * @returns {string}
 */
function getCookie(yourView_userInfo) {

    //测试，手动写入cookies；
    //创建一个cookie并设置有效时间为 7天
    //先删除
    $.cookie('yourView_userInfo', null);
    $.cookie('yourView_userInfo', '{"data":[{"content":"很不错嘛","id":1,"nickname":"纳尼"},{"content":"哟西哟西","id":2,"nickname":"小强"}]}', {expires: 7});


    var userInfo = $.cookie(yourView_userInfo); // cookie存在 => 'the_value'
    if (userInfo != null && userInfo.length > 0) {
        return userInfo;
    } else {
        return "error";
    }
}