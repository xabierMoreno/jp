import { DemoUiPage } from './app.po';

describe('demo-ui App', () => {
  let page: DemoUiPage;

  beforeEach(() => {
    page = new DemoUiPage();
  });

  it('should display welcome message', done => {
    page.navigateTo();
    page.getParagraphText()
      .then(msg => expect(msg).toEqual('Welcome to app!!'))
      .then(done, done.fail);
  });
});
