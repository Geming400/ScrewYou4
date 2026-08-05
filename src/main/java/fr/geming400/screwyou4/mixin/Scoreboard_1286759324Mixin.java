package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.Scoreboard.class)
public class Scoreboard_1286759324Mixin {
        @Inject(at = @At("HEAD"), method = "getPlayerTeam(Ljava/lang/String;)Lnet/minecraft/world/scores/PlayerTeam;", cancellable = true)
    private void getPlayerTeam__1292201842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1292201842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPlayerToTeam(Ljava/lang/String;Lnet/minecraft/world/scores/PlayerTeam;)Z", cancellable = true)
    private void addPlayerToTeam__1178177148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1178177148L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPlayersTeam(Ljava/lang/String;)Lnet/minecraft/world/scores/PlayerTeam;", cancellable = true)
    private void getPlayersTeam__1292201842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1292201842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayObjective(Lnet/minecraft/world/scores/DisplaySlot;)Lnet/minecraft/world/scores/Objective;", cancellable = true)
    private void getDisplayObjective__2056039199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2056039199L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerScoreInfo(Lnet/minecraft/world/scores/ScoreHolder;Lnet/minecraft/world/scores/Objective;)Lnet/minecraft/world/scores/ReadOnlyScoreInfo;", cancellable = true)
    private void getPlayerScoreInfo_406326695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(406326695L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onTeamChanged(Lnet/minecraft/world/scores/PlayerTeam;)V", cancellable = true)
    private void onTeamChanged__1407576630(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1407576630L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forAllObjectives(Lnet/minecraft/world/scores/criteria/ObjectiveCriteria;Lnet/minecraft/world/scores/ScoreHolder;Ljava/util/function/Consumer;)V", cancellable = true)
    private void forAllObjectives_1593019336(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1593019336L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getObjective(Ljava/lang/String;)Lnet/minecraft/world/scores/Objective;", cancellable = true)
    private void getObjective_1483991587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1483991587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removePlayerFromTeam(Ljava/lang/String;)Z", cancellable = true)
    private void removePlayerFromTeam__1855842980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1855842980L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "removePlayerFromTeam(Ljava/lang/String;Lnet/minecraft/world/scores/PlayerTeam;)V", cancellable = true)
    private void removePlayerFromTeam__1178180992(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1178180992L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onObjectiveRemoved(Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void onObjectiveRemoved_78463841(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(78463841L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getObjectives()Ljava/util/Collection;", cancellable = true)
    private void getObjectives__526888949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-526888949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDisplayObjective(Lnet/minecraft/world/scores/DisplaySlot;Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void setDisplayObjective_628585709(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(628585709L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addObjective(Ljava/lang/String;Lnet/minecraft/world/scores/criteria/ObjectiveCriteria;Lnet/minecraft/network/chat/Component;Lnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;ZLnet/minecraft/network/chat/numbers/NumberFormat;)Lnet/minecraft/world/scores/Objective;", cancellable = true)
    private void addObjective_1078776267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078776267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removePlayerTeam(Lnet/minecraft/world/scores/PlayerTeam;)V", cancellable = true)
    private void removePlayerTeam__1407576630(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1407576630L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTeamNames()Ljava/util/Collection;", cancellable = true)
    private void getTeamNames__526888949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-526888949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityRemoved(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void entityRemoved_835034663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(835034663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getObjectiveNames()Ljava/util/Collection;", cancellable = true)
    private void getObjectiveNames__526888949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-526888949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onObjectiveChanged(Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void onObjectiveChanged_78463841(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(78463841L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlayerRemoved(Lnet/minecraft/world/scores/ScoreHolder;)V", cancellable = true)
    private void onPlayerRemoved_2114803356(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2114803356L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onTeamAdded(Lnet/minecraft/world/scores/PlayerTeam;)V", cancellable = true)
    private void onTeamAdded__1407576630(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1407576630L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPlayerTeam(Ljava/lang/String;)Lnet/minecraft/world/scores/PlayerTeam;", cancellable = true)
    private void addPlayerTeam__1292201842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1292201842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreatePlayerScore(Lnet/minecraft/world/scores/ScoreHolder;Lnet/minecraft/world/scores/Objective;Z)Lnet/minecraft/world/scores/ScoreAccess;", cancellable = true)
    private void getOrCreatePlayerScore_1386690439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1386690439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreatePlayerScore(Lnet/minecraft/world/scores/ScoreHolder;Lnet/minecraft/world/scores/Objective;)Lnet/minecraft/world/scores/ScoreAccess;", cancellable = true)
    private void getOrCreatePlayerScore_1392489199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1392489199L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onPlayerScoreRemoved(Lnet/minecraft/world/scores/ScoreHolder;Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void onPlayerScoreRemoved_2021295407(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2021295407L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onTeamRemoved(Lnet/minecraft/world/scores/PlayerTeam;)V", cancellable = true)
    private void onTeamRemoved__1407576630(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1407576630L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetAllPlayerScores(Lnet/minecraft/world/scores/ScoreHolder;)V", cancellable = true)
    private void resetAllPlayerScores_2114803356(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2114803356L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onObjectiveAdded(Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void onObjectiveAdded_78463841(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(78463841L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "listPlayerScores(Lnet/minecraft/world/scores/ScoreHolder;)Lit/unimi/dsi/fastutil/objects/Object2IntMap;", cancellable = true)
    private void listPlayerScores__1185207683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1185207683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listPlayerScores(Lnet/minecraft/world/scores/Objective;)Ljava/util/Collection;", cancellable = true)
    private void listPlayerScores_1698951384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1698951384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTrackedPlayers()Ljava/util/Collection;", cancellable = true)
    private void getTrackedPlayers__526888949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-526888949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeObjective(Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void removeObjective_78463841(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(78463841L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetSinglePlayerScore(Lnet/minecraft/world/scores/ScoreHolder;Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void resetSinglePlayerScore_2021295407(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2021295407L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerTeams()Ljava/util/Collection;", cancellable = true)
    private void getPlayerTeams__526888949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-526888949L))
            info.setReturnValue(null);
    }


}
