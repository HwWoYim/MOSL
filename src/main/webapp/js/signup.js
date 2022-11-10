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
// 이용약관동의 checkbox
const signupCheckBox = document.getElementById("signupCheckBox");
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
const mailReg = /^[0-9a-zA-Z]([-_]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i; // 이메일
const phoneReg =  /^[0-9]{11}$/; // 휴대폰 번호

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
	// 아이디 입력창이 비어있을 때
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
	// 비밀번호 입력창이 비어 있을 때
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
	// 비밀번호 재확인 입력창이 비어 있을 때
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
	// 이름 입력창이 비어 있을 때
	if(inputName.value.length == 0){
		checkName.style.display="none";
		inputName.style.borderBottom = "0.5px solid gray";
	}
}
// 생년월일 유효성 검사
function birthChecking(){
	const flag = birthReg.test(inputBirth.value);
	if(flag){
		inputBirth.style.borderBottom="4px solid #1E90FF";
	} else {
		inputBirth.style.borderBottom="4px solid #DC143C";
	}
	if(inputBirth.value.length == 0){
		inputBirth.style.borderBottom = "0.5px solid gray";
	}
}
// 이메일 유효성 검사
function emailChecking(){
	const flag = mailReg.test(inputEmail.value);
	if(flag){
		inputEmail.style.borderBottom = "4px solid #1E90FF";
	} else{
		inputEmail.style.borderBottom = "4px solid #DC143C";
	}
	if(inputEmail.value.length == 0){
		inputEmail.style.borderBottom = "0.5px solid gray";
	}
}
// 전화번호 유효성 검사
function phoneChecking(){
	const flag = phoneReg.test(inputPhone.value);
	if(flag){
		inputPhone.style.borderBottom = "4px solid #1E90FF";
	} else{
		inputPhone.style.borderBottom = "4px solid #DC143C";
	}
	if(inputPhone.value.length == 0){
		inputPhone.style.borderBottom =  "0.5px solid gray";
	}
}	

inputID.addEventListener("keyup", idChecking);
inputPW.addEventListener("keyup", pwChecking);
checkPW.addEventListener('keyup', pwRegex);
inputName.addEventListener("keyup", nameChecking);
inputBirth.addEventListener("keyup", birthChecking);
inputEmail.addEventListener("keyup", emailChecking);
inputPhone.addEventListener("keyup", phoneChecking);

// 회원가입 버튼 활성화
function btnLife(){
	// 입력란 배열에 존재하는 길이 만큼 수행
	if(idChecking && pwChecking && pwRegex && nameChecking && birthChecking && emailChecking && phoneChecking && (signupCheckBox.checked)){
		signupButton.disabled = false;
		signupButton.style.backgroundColor = "black";
		signupButton.style.color = "lightgray";
		signupButton.style.cursor = "pointer";
	} else {
		signupButton.disabled = true; 	
		signupButton.style.backgroundColor = "lightgray";
		signupButton.style.color = "black";
		signupButton.style.cursor = "no-drop";
	}
}
signupCheckBox.addEventListener("click", btnLife);