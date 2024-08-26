window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.BlocoAreaCursosTipo = window.blockly.js.blockly.BlocoAreaCursosTipo || {};

/**
 * @function enviarParaGrade2
 *
 *
 *
 *
 * @author Guilherme Martin De Magalhaes
 * @since 26/08/2024, 14:12:09
 *
 */
window.blockly.js.blockly.BlocoAreaCursosTipo.enviarParaGrade2Args = [];
window.blockly.js.blockly.BlocoAreaCursosTipo.enviarParaGrade2 = async function() {

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
 * @since 26/08/2024, 14:12:09
 *
 */
window.blockly.js.blockly.BlocoAreaCursosTipo.enviarParaGradeArgs = [];
window.blockly.js.blockly.BlocoAreaCursosTipo.enviarParaGrade = async function() {

  //
  (await this.cronapi.client('cronapi.screen.startInsertingMode').run("AreaCursosTipo"));
  //
  this.cronapi.screen.changeValueOfField("AreaCursosTipo.active.descricaoAreaCursos", this.cronapi.screen.getValueOfField("vars.input3151"));
  //
  this.cronapi.screen.changeValueOfField("vars.radio1701", this.cronapi.screen.getValueOfField("vars.radio6992"));
  //
  (await this.cronapi.client('cronapi.screen.post').run("AreaCursosTipo"));
  //
  (await this.cronapi.client('cronapi.screen.backNormalState').run("AreaCursosTipo"));
  //
  (await this.cronapi.client('cronapi.screen.recompileComponent').run("cron-crn-grid-search"));
}
