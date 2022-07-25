<template>
  <div class="container">
    <p>Trying to se if it works</p>
    <nuxt />
  </div>
</template>

<script>
import Nuxt from 'nuxt';
import Vue from 'vue';

export default Vue.extend({
  components: Nuxt,
});
</script>

<style>
* {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
}

body {
  font-family: Arial, Helvetica, sans-serif;
  font-size: 1rem;
  line-height: 1.6;
  background: #f4f4f4;
}

a {
  color: #666;
  text-decoration: none;
}

ul {
  list-style: none;
}

.container {
  max-width: 4000px;
  background: rgb(255, 104, 104);
  flex: 1;
  padding: 10;
  background: #fff;
}
</style>
