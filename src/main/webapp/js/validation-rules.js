var ValidationRules = function(){

}

ValidationRules.prototype={
    validatePhoneNumber : function(value){
        if(value == "") return false;
        var number = value.replace(/\s+/g, "");
        return number.length === 11 && /^\d+$/.test(number);
    }
}