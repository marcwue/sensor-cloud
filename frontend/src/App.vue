<template>
  <div id="app">
    <SensorTable/>
  </div>
</template>

<script>
import SensorTable from './components/SensorTable.vue'

export default {
  name: 'App',
  components: {
    SensorTable
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}
</style>
