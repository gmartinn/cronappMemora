window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.BlocoAdicionarTblHubIdiomas = window.blockly.js.blockly.BlocoAdicionarTblHubIdiomas || {};

/**
 * @function enviarParaGrade2
 *
 *
 *
 *
 * @author Guilherme Martin De Magalhaes
 * @since 20/08/2024, 14:01:54
 *
 */
window.blockly.js.blockly.BlocoAdicionarTblHubIdiomas.enviarParaGrade2Args = [];
window.blockly.js.blockly.BlocoAdicionarTblHubIdiomas.enviarParaGrade2 = async function() {

  //
  (await this.cronapi.client('cronapi.screen.startInsertingMode').run("Dados_Academicos2"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Academicos2.active.curso", this.cronapi.screen.getValueOfField("vars.input4754"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Academicos2.active.tipoCurso", this.cronapi.screen.getValueOfField("vars.combobox8630"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Academicos2.active.situacao", this.cronapi.screen.getValueOfField("vars.combobox86302031"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Academicos2.active.mesAnoConclusao", this.cronapi.screen.getValueOfField("vars.date2393"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Academicos2.active.idioma", this.cronapi.screen.getValueOfField("vars.combobox5223"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Academicos2.active.leitura", this.cronapi.screen.getValueOfField("vars.combobox522355961"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Academicos2.active.escrita", this.cronapi.screen.getValueOfField("vars.combobox52235596157001"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Academicos2.active.conversacao", this.cronapi.screen.getValueOfField("vars.combobox5223559615700179201"));
  //
  (await this.cronapi.client('cronapi.screen.post').run("Dados_Academicos2"));
  //
  (await this.cronapi.client('cronapi.screen.backNormalState').run("Dados_Academicos2"));
  //
  (await this.cronapi.client('cronapi.screen.recompileComponent').run("cron-crn-grid-search"));
}

/**
 * @function enviarParaGrade
 *
 *
 *
 *
 * @author Guilherme Martin De Magalhaes
 * @since 20/08/2024, 14:01:54
 *
 */
window.blockly.js.blockly.BlocoAdicionarTblHubIdiomas.enviarParaGradeArgs = [];
window.blockly.js.blockly.BlocoAdicionarTblHubIdiomas.enviarParaGrade = async function() {

  //
  (await this.cronapi.client('cronapi.screen.startInsertingMode').run("TBL_HUB_IDIOMASm"));
  //
  this.cronapi.screen.changeValueOfField("IdiomaCombo.active.opcao", this.cronapi.screen.getValueOfField("vars.dynCombobox8689"));
  //
  this.cronapi.screen.changeValueOfField("LeituraCombo.active.opcao", this.cronapi.screen.getValueOfField("vars.dynCombobox868962871"));
  //
  this.cronapi.screen.changeValueOfField("EscritaCombo.active.opcao", this.cronapi.screen.getValueOfField("vars.dynCombobox868911141"));
  //
  this.cronapi.screen.changeValueOfField("ConversacaoCombo.active.opcao", this.cronapi.screen.getValueOfField("vars.dynCombobox868987821"));
  //
  (await this.cronapi.client('cronapi.screen.post').run("TBL_HUB_IDIOMASm"));
  //
  (await this.cronapi.client('cronapi.screen.backNormalState').run("TBL_HUB_IDIOMASm"));
  //
  (await this.cronapi.client('cronapi.screen.recompileComponent').run("cron-crn-grid-search"));
}
