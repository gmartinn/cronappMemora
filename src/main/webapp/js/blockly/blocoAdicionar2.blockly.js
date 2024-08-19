window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.BlocoAdicionar2 = window.blockly.js.blockly.BlocoAdicionar2 || {};

/**
 * @function enviarParaGrade2
 *
 *
 *
 *
 * @author João Victor Tenorio Moreira De Lima
 * @since 19/08/2024, 03:51:34
 *
 */
window.blockly.js.blockly.BlocoAdicionar2.enviarParaGrade2Args = [];
window.blockly.js.blockly.BlocoAdicionar2.enviarParaGrade2 = async function() {

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
 * @author João Victor Tenorio Moreira De Lima
 * @since 19/08/2024, 03:51:34
 *
 */
window.blockly.js.blockly.BlocoAdicionar2.enviarParaGradeArgs = [];
window.blockly.js.blockly.BlocoAdicionar2.enviarParaGrade = async function() {

  //
  (await this.cronapi.client('cronapi.screen.startInsertingMode').run("Dados_Profissionais"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Profissionais.active.cursoCertificacao", this.cronapi.screen.getValueOfField("vars.radio5928"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Profissionais.active.area", this.cronapi.screen.getValueOfField("vars.combobox4721"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Profissionais.active.tipo", this.cronapi.screen.getValueOfField("vars.combobox472166431"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Profissionais.active.expiracao", this.cronapi.screen.getValueOfField("vars.radio592868941"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Profissionais.active.mesAnoExpiracao", this.cronapi.screen.getValueOfField("vars.date1937"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Profissionais.active.nomeCurso", this.cronapi.screen.getValueOfField("vars.input5402"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Profissionais.active.mesAnoConclusao", this.cronapi.screen.getValueOfField("vars.date8253"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Profissionais.active.cargaHoraria", this.cronapi.screen.getValueOfField("vars.input540263081"));
  //
  (await this.cronapi.client('cronapi.screen.post').run("Dados_Profissionais"));
  //
  (await this.cronapi.client('cronapi.screen.backNormalState').run("Dados_Profissionais"));
  //
  (await this.cronapi.client('cronapi.screen.recompileComponent').run("cron-crn-grid-search"));
}
