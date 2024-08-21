window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.BlocoAdicionar3 = window.blockly.js.blockly.BlocoAdicionar3 || {};

/**
 * @function enviarParaGrade2
 *
 *
 *
 *
 * @author Guilherme Martin De Magalhaes
 * @since 21/08/2024, 12:51:33
 *
 */
window.blockly.js.blockly.BlocoAdicionar3.enviarParaGrade2Args = [];
window.blockly.js.blockly.BlocoAdicionar3.enviarParaGrade2 = async function() {

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
 * @since 21/08/2024, 12:51:33
 *
 */
window.blockly.js.blockly.BlocoAdicionar3.enviarParaGradeArgs = [];
window.blockly.js.blockly.BlocoAdicionar3.enviarParaGrade = async function() {

  //
  (await this.cronapi.client('cronapi.screen.startInsertingMode').run("Dados_Tecnicos"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Tecnicos.active.linguagemProgramacao", this.cronapi.screen.getValueOfField("vars.combobox5564"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Tecnicos.active.situacaoProgramacao", this.cronapi.screen.getValueOfField("vars.combobox55649061"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Tecnicos.active.bandoDados", this.cronapi.screen.getValueOfField("vars.combobox3163"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Profissionais.active.expiracao", this.cronapi.screen.getValueOfField("vars.combobox316379791"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Tecnicos.active.infraEstrutura", this.cronapi.screen.getValueOfField("vars.combobox3163797911916196391"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Tecnicos.active.situacaoGestao", this.cronapi.screen.getValueOfField("vars.combobox316379791191619639175011"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Tecnicos.active.situacaoGestao", this.cronapi.screen.getValueOfField("vars.combobox31637979119161963917501148451"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Tecnicos.active.resumoprofissional", this.cronapi.screen.getValueOfField("vars.textarea8464"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Tecnicos.active.areaAtuacao", this.cronapi.screen.getValueOfField("vars.combobox2100"));
  //
  this.cronapi.screen.changeValueOfField("Dados_Profissionais.active.cargaHoraria", this.cronapi.screen.getValueOfField("vars.input540263081"));
  //
  (await this.cronapi.client('cronapi.screen.post').run("Dados_Tecnicos"));
  //
  (await this.cronapi.client('cronapi.screen.backNormalState').run("Dados_Tecnicos"));
  //
  (await this.cronapi.client('cronapi.screen.recompileComponent').run("cron-crn-grid-search"));
}
