Narrative:
In order to gain scores for my previous activities
As a user
I want to retro claim for scores

Scenario: I want to retro claim for scores

Given I login member center with user <13711111111>
When I go to retro claim page
When I retro claim score with item <hotel>, city <上海>, hotel <JinJiang>, room <1502>, check in <2012-03-12>, check out <2012-03-13> and amount <499>
Then I could see a record with item <hotel>, check in <2012-03-12>, check out <2012-03-13>, score <499> and status <打开> claimed on today