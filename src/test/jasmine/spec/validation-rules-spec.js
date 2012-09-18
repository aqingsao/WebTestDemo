describe("validation rules", function(){
    describe("validate phone number", function(){
        var validationRules;

        beforeEach(function(){
            validationRules = new ValidationRules();
        });

        it('should be 11 digits', function(){
            expect(validationRules.validatePhoneNumber("12345678901")).toEqual(true);
            expect(validationRules.validatePhoneNumber("123456789012")).toEqual(false);
        });

        it('could contains space', function(){
            expect(validationRules.validatePhoneNumber("123 456 78901")).toEqual(true);
        });

        it('could not contains char',function(){
            expect(validationRules.validatePhoneNumber("123e4567890")).toEqual(false);
        })
    })
})