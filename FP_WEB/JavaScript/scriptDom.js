console.log("JavaScript ligado!");

// Title e nome estudante
const pageTitle = document.getElementById("pageTitle");
const studentName = document.getElementById("studentName");
pageTitle.textContent = "Olá turma!";
studentName.textContent = "Dayane AP";


// xx==xx==xx==xx==xx==xx== Inicio do Formulario Nome xx==xx==xx==xx==xx==xx== //
const nameForm = document.getElementById("nameForm");
const nameInput = document.getElementById("nameInput");
const feedbackMessage = document.getElementById("feedbackMessage");

// adiciona UM EVENTO: mensagem de confirmação
nameForm.addEventListener("submit", (event) => {
  event.preventDefault();
  feedbackMessage.textContent = "Nome enviado com sucesso!";
});
// xx==xx== FIM Formulario Nome xx==xx== //

// xx==xx==xx==xx==xx==xx== Inicio do Formulario Tarefas xx==xx==xx==xx==xx==xx== //
const taskForm = document.getElementById("taskForm");
const taskInput = document.getElementById("taskInput");
const taskList = document.getElementById("taskList");

// tarefa "Estudar DOM"
const sampleTaskItem = document.createElement("li");
sampleTaskItem.textContent = "Estudar DOM";
taskList.append(sampleTaskItem);

// tarefa "Praticar Eventos"
const objectTask = {title: "Praticar eventos"};
const objectTaskItem = document.createElement("li");
objectTaskItem.textContent = objectTask.title;
taskList.append(objectTaskItem);

// adiciona UM EVENTO: enviar tarefa
taskForm.addEventListener("submit", (event) => {
  event.preventDefault(); // impede que recarregue

  // cria a constante de input
  const taskText = taskInput.value.trim();

  // ignora se adicionar apenas espaços no form
  if (taskText === "") return; 
  
  // a lista de tarefas
  const taskItem = document.createElement("li");
  const taskLabel = document.createElement("span");
  taskLabel.textContent = taskText;
  
  // limpa o formulario apos o envio
  taskInput.value = ""; 

  // botao que remove uma tarefa adicionada
  const removeButton = document.createElement("button");
  removeButton.type = "button";
  removeButton.textContent = "Remover";
  removeButton.addEventListener("click", () => taskItem.remove());
  taskItem.append(taskLabel, removeButton);

  // tarefas adicionadas no form
  taskList.append(taskItem);
});

// adiciona UM EVENTO: mensagem de confirmacao de tarefa enviada
taskForm.addEventListener("submit", (event) => {
  event.preventDefault();
  feedbackMessageTask.textContent = "Tarefa adicionada com sucesso!";
});
// xx==xx== FIM Formulario Tarefas xx==xx== //