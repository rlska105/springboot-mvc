var main = {
    init : function () {
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
        });
    },
    save : function () {
        var data = {
            word: $('#word').val(),
            meaning: $('#meaning').val()
        };

        $.ajax({
            type: 'POST',
            url: '/words',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function() {
            alert('Conplete sucessfully.');
            location.reload();
        }).fail(function (error) {
            alert(error);
        });
    }

};

main.init();