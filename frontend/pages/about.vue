<template>
  <div>
    <h1>About</h1>
    <p>{{ $auth.$state }}</p>
    <p>{{ $auth.strategy.token.get() }}</p>
  </div>
</template>

<script>
import Vue from 'vue';

export default Vue.extend({
  name: 'AboutTest',
  head() {
    return {
      title: 'About The App',
      meta: [
        {
          hid: 'description',
          name: 'description',
          content: 'Updates for values',
        },
      ],
    };
  },
});
</script>

<style></style>
