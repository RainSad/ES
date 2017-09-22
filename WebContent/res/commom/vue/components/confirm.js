// <div id="app">
//     <h1 @click="go">vue示例（本质上是父组件）</h1>
//
// <!-- 子组件实例（本质上也是vue实例） -->
// <!-- 子组件绑定接口 -->
// <!-- 监听子组件点击事件 -->
// <my-component :list="msg" @myclick="sayHi"></my-component>
//     </div>
//子组件绑定了父组件msg数据，msg更新了，子组件也同步更新
var str = '<h3 @click="say">{{ list }}（本质上是子组件）</h3>';

var confirModel = '<!-- 弹出提示对话框 -->\n' +
    '<div class="modal fade" id="delcfmModel">\n' +
    '    <div class="modal-dialog">\n' +
    '        <div class="modal-content message_align">\n' +
    '            <div class="modal-header">\n' +
    '                <button type="button" class="close" data-dismiss="modal"\n' +
    '                        aria-label="Close">\n' +
    '                    <span aria-hidden="true">×</span>\n' +
    '                </button>\n' +
    '                <h4 class="modal-title">{{info.header}}</h4>\n' +
    '            </div>\n' +
    '            <div class="modal-body">\n' +
    '                <p>{{info.message}}</p>\n' +
    '            </div>\n' +
    '            <div class="modal-footer">\n' +
    '                <button v-on:click="cancel" type="button" class="btn btn-default" data-dismiss="modal">{{info.cancel}}\n' +
    '                </button>\n' +
    '                <button v-on:click="submit" type="button" class="btn btn-primary">{{info.confirm}}</button>\n' +
    '            </div>\n' +
    '        </div>\n' +
    '    </div>\n' +
    '</div>';

// 全局声明my-component子组件 (通用组件)
Vue.component('my-component', {
    // 接口属性list（本质上是vue实例data对象的一个成员）
    props: ['list'],
    template: str,
    data: function () {
        return {
            i: 0
        }
    },
    methods: {
        say: function () {
            this.i += 1;
            // 触发子组件事件
            this.$emit('myclick');
        }
    }
});

// vue实例
new Vue({
    el: '#app',
    data: {
        msg: 'hello world'
    },
    methods: {
        sayHi: function () {
            alert(this.msg + '      你好 世界');
        },
        go: function () {
            alert('我是父组件');
        }
    }
});