new Vue({
    el: "#app",
    data: {
        describe: {},
        describeList: []
    },
    created(){
        this.findAll();
    },
    methods: {
        findAll: function () {
            var url = "/user/findAll";
            var _this = this;

            axios.get(url).then(function (response) {
                _this.describeList = response.data;
            }).catch(function (err) {
                console.log(err)
            });
        },
        update: function () {
            var url = "/user/update";
            var _this = this;

            axios.post(url, _this.user).then(function (response) {
                _this.findAll();
            }).catch(function (err) {
                console.log(err)
            });
        },
        findById: function (id) {
            var url = "/user/findById";
            var _this = this;
            axios.get(url, {
                params: {
                    id: id
                }
            }).then(function (response) {
                _this.describe = response.data;
                $("#myModal").modal("show");//让模态框显示
            }).catch(function (err) {
                console.log(err)
            });
        }
    },

});