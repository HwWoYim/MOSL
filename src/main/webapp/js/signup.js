// input 영역 저장
const inputBOX = document.getElementsByClassName("signupInput");
const inputID = inputBOX[0];
const inputPW = inputBOX[1];
const checkPW = inputBOX[2];
const inputName = inputBOX[3];
const inputBirth = inputBOX[4];
const inputEmail = inputBOX[5];
const inputPhone = inputBOX[6];
const inputAdd = inputBOX[7];
// 유효성 검사 메시지들 저장
const checkID = document.getElementById("checkID");
const firstCheckPW = document.getElementById("firstCheckPW");
const secondCheckPW = document.getElementById("checkPW");
const checkName = document.getElementById("checkName");

// 정규표현식 저장
const idReg = /^[a-zA-Z0-9]{7,15}$/; // 아이디
const pwReg = /^(?=.*[a-zA-Z])(?=.*[0-9]).{12,18}$/; // 비밀번호
const koNameReg = /^[가-힣]{2,5}$/; // 비밀번호 재확인
const enNameReg = /^[a-zA-Z]{2,10}\s[a-zA-Z]{2,10}$/; // 이름
const birthReg = /^[0-9]{6}$/; // 생년월일
const mailReg = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i; // 이메일
const phoneReg =  /^\d{3}-\d{3,4}-\d{4}$/; // 휴대폰 번호

// 아이디 유효성 검사
function idChecking(){
	const flag = idReg.test(inputID.value);
	if(flag){
		checkID.style.display = "none";
		inputID.style.borderBottom = "4px solid #1E90FF";
	} else{
		checkID.style.display = "block";
		inputID.style.borderBottom = "4px solid #DC143C";
	}
	if(inputID.value.length == 0){
		checkID.style.display="none";
		inputID.style.borderBottom = "0.5px solid gray";
	}
}
// 비밀번호 유효성 검사
function pwChecking(){
	const flag = pwReg.test(inputPW.value);
	if(flag){
		firstCheckPW.style.display = "none";
		inputPW.style.borderBottom = "4px solid #1E90FF";
	} else {
		firstCheckPW.style.display = "block";
		inputPW.style.borderBottom = "4px solid #DC143C";
	}
	if(inputPW.value.length == 0){
		firstCheckPW.style.display="none";
		inputPW.style.borderBottom = "0.5px solid gray";
	}
}
// 비밀번호 재확인 유효성 검사
function pwRegex(){
	const flag = inputPW.value == checkPW.value ? true : false;
	if(flag){
		secondCheckPW.style.display = "block";
		secondCheckPW.style.color = "#1E90FF";
		checkPW.style.borderBottom = "4px solid #1E90FF";
	} else{
		secondCheckPW.style.display = "none";
		checkPW.style.borderBottom = "4px solid #DC143C";
	}
	if(checkPW.value.length == 0){
		secondCheckPW.style.display = "none";
		checkPW.style.borderBottom = "0.5px solid gray";
	}
}
// 이름 유효성 검사
function nameChecking(){
	const flag = koNameReg.test(inputName.value) || enNameReg.test(inputName.value);
	if(flag){
		checkName.style.display = "none";
		inputName.style.borderBottom = "4px solid #1E90FF";
	} else{
		checkName.style.display="block";
		inputName.style.borderBottom = "4px solid #DC143C";
	}
	
}


inputID.addEventListener("keyup", idChecking);
inputPW.addEventListener("keyup", pwChecking);
checkPW.addEventListener('keyup', pwRegex);
inputName.addEventListener("keyup", nameChecking);