/**add by yangxuan**/
function resetButton() {
		$("#code").attr("value","");
		$('#password').attr("value","");
		$("#__verifycode#").attr("value","");
}
function validateLoign() {
	$("div[id='errorAlert']:eq(2)").remove();
	var username = $('#code').val();
	var password = $('#password').val(); 
	var validateCode = $('#__verifycode').val();
	if (username=="" || null==username) {
		/*alert("登陆名不能为空!");*/
		$("div[id='errorAlert']:eq(0)").attr("class","errorAlert-show");
		return;
	} else {
		/**if ($('#ssn').val().length >9 | $('#pwd').val().length<6) {
			alert("登陆名必须在6至8位之间!");
			return;
		}**/
	}
	if (password=="" || null==password) {
		$("div[id='errorAlert']:eq(1)").attr("class","errorAlert-show");
		return;
	} 
	if ($("#rememberMe").attr("checked") != "checked") {
		$("#password").val(CalcuMD5("password", "form1", false));
	} else {
		$("#password").val("");
	}
	
	submit();
}
//window.document.onkeyup=function(evt){
// 		if(window.ActiveXObject){
// 			if(event.keyCode==13){
// 				validateLoign();
// 				submit();
// 			}
// 		}else{
// 			if(evt.which==13){
// 				validateLoign();
// 				submit();
// 			}
// 		}
// }
function submit()
{
	document.loginForm.submit();
	document.getElementById("loginForm").disabled=true;
}

function changePngForCode(obj){
	$("div[id='errorAlert']:eq(2)").remove();
	var value=$(obj).val();
	if(value!=""){
		$("div[id='errorAlert']:eq(0)").attr("class","errorAlert-hd");
	}
}
function changePngForPwd(obj){
	$("div[id='errorAlert']:eq(2)").remove();
	var value=$(obj).val();
	if(value!=""){
		$("div[id='errorAlert']:eq(1)").attr("class","errorAlert-hd");
	}
}
