window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.BlocoAdicionarTblHubConhecimentosTecnicos = window.blockly.js.blockly.BlocoAdicionarTblHubConhecimentosTecnicos || {};

/**
 * @function enviarParaGrade2
 *
 *
 *
 *
 * @author Guilherme Martin De Magalhaes
 * @since 22/08/2024, 16:12:09
 *
 */
window.blockly.js.blockly.BlocoAdicionarTblHubConhecimentosTecnicos.enviarParaGrade2Args = [];
window.blockly.js.blockly.BlocoAdicionarTblHubConhecimentosTecnicos.enviarParaGrade2 = async function() {

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
 * @since 22/08/2024, 16:12:09
 *
 */
window.blockly.js.blockly.BlocoAdicionarTblHubConhecimentosTecnicos.enviarParaGradeArgs = [];
window.blockly.js.blockly.BlocoAdicionarTblHubConhecimentosTecnicos.enviarParaGrade = async function() {

  //
  (await this.cronapi.client('cronapi.screen.startInsertingMode').run("TBL_HUB_CONHECIMENTOS_TECNICOS"));
  //
  this.cronapi.screen.changeValueOfField("TBL_HUB_CONHECIMENTOS_TECNICOS.active.coD_HUB_CONHECIMENTOS_TECNICOS", this.cronapi.screen.getValueOfField("vars.input3158"));
  //
  this.cronapi.screen.changeValueOfField("TBL_HUB_CONHECIMENTOS_TECNICOS.active.coD_HUB_AREA_CURSO", this.cronapi.screen.getValueOfField("vars.input315837241"));
  //
  this.cronapi.screen.changeValueOfField("TBL_HUB_CONHECIMENTOS_TECNICOS.active.coD_HUB_AREA_CURSO_TIPO", this.cronapi.screen.getValueOfField("vars.input31583724155641"));
  //
  this.cronapi.screen.changeValueOfField("TBL_HUB_CONHECIMENTOS_TECNICOS.active.tx_RESUMO_PROFISSIONAL", this.cronapi.screen.getValueOfField("vars.textarea4910"));
  //
  this.cronapi.screen.changeValueOfField("TBL_HUB_CONHECIMENTOS_TECNICOS.active.coD_HUB_AREA_ATUACAO", this.cronapi.screen.getValueOfField("vars.dynCombobox5812"));
  //
  (await this.cronapi.client('cronapi.screen.post').run("TBL_HUB_CONHECIMENTOS_TECNICOS"));
  //
  (await this.cronapi.client('cronapi.screen.backNormalState').run("TBL_HUB_CONHECIMENTOS_TECNICOS"));
  //
  (await this.cronapi.client('cronapi.screen.recompileComponent').run("cron-crn-grid-search"));
}
