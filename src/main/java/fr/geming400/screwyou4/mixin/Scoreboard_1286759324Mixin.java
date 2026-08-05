package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.Scoreboard.class)
public class Scoreboard_1286759324Mixin {
        @Inject(at = @At("HEAD"), method = "getDisplayObjective(Lnet/minecraft/world/scores/DisplaySlot;)Lnet/minecraft/world/scores/Objective;", cancellable = true)
    private void getDisplayObjective_674743726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674743726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerScoreInfo(Lnet/minecraft/world/scores/ScoreHolder;Lnet/minecraft/world/scores/Objective;)Lnet/minecraft/world/scores/ReadOnlyScoreInfo;", cancellable = true)
    private void getPlayerScoreInfo_224002032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(224002032L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerTeam(Ljava/lang/String;)Lnet/minecraft/world/scores/PlayerTeam;", cancellable = true)
    private void getPlayerTeam_130043962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(130043962L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPlayerToTeam(Ljava/lang/String;Lnet/minecraft/world/scores/PlayerTeam;)Z", cancellable = true)
    private void addPlayerToTeam__1573346050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1573346050L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPlayersTeam(Ljava/lang/String;)Lnet/minecraft/world/scores/PlayerTeam;", cancellable = true)
    private void getPlayersTeam_1448521013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1448521013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forAllObjectives(Lnet/minecraft/world/scores/criteria/ObjectiveCriteria;Lnet/minecraft/world/scores/ScoreHolder;Ljava/util/function/Consumer;)V", cancellable = true)
    private void forAllObjectives_1403870582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1403870582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getObjective(Ljava/lang/String;)Lnet/minecraft/world/scores/Objective;", cancellable = true)
    private void getObjective__2019674586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2019674586L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onTeamRemoved(Lnet/minecraft/world/scores/PlayerTeam;)V", cancellable = true)
    private void onTeamRemoved__237841490(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-237841490L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetAllPlayerScores(Lnet/minecraft/world/scores/ScoreHolder;)V", cancellable = true)
    private void resetAllPlayerScores_1441556936(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1441556936L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addObjective(Ljava/lang/String;Lnet/minecraft/world/scores/criteria/ObjectiveCriteria;Lnet/minecraft/network/chat/Component;Lnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;ZLnet/minecraft/network/chat/numbers/NumberFormat;)Lnet/minecraft/world/scores/Objective;", cancellable = true)
    private void addObjective__360635597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-360635597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getObjectiveNames()Ljava/util/Collection;", cancellable = true)
    private void getObjectiveNames__102737328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-102737328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onTeamAdded(Lnet/minecraft/world/scores/PlayerTeam;)V", cancellable = true)
    private void onTeamAdded__1511408306(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1511408306L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerTeams()Ljava/util/Collection;", cancellable = true)
    private void getPlayerTeams__1149091478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1149091478L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removePlayerTeam(Lnet/minecraft/world/scores/PlayerTeam;)V", cancellable = true)
    private void removePlayerTeam__1278749876(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1278749876L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onObjectiveChanged(Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void onObjectiveChanged_1362522087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1362522087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "listPlayerScores(Lnet/minecraft/world/scores/Objective;)Ljava/util/Collection;", cancellable = true)
    private void listPlayerScores__186800392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-186800392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listPlayerScores(Lnet/minecraft/world/scores/ScoreHolder;)Lit/unimi/dsi/fastutil/objects/Object2IntMap;", cancellable = true)
    private void listPlayerScores_1948555357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948555357L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreatePlayerScore(Lnet/minecraft/world/scores/ScoreHolder;Lnet/minecraft/world/scores/Objective;)Lnet/minecraft/world/scores/ScoreAccess;", cancellable = true)
    private void getOrCreatePlayerScore_516950699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(516950699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOrCreatePlayerScore(Lnet/minecraft/world/scores/ScoreHolder;Lnet/minecraft/world/scores/Objective;Z)Lnet/minecraft/world/scores/ScoreAccess;", cancellable = true)
    private void getOrCreatePlayerScore_14800715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(14800715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDisplayObjective(Lnet/minecraft/world/scores/DisplaySlot;Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void setDisplayObjective_1068160308(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1068160308L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entityRemoved(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void entityRemoved_530994212(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(530994212L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTrackedPlayers()Ljava/util/Collection;", cancellable = true)
    private void getTrackedPlayers__1395191127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1395191127L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removePlayerFromTeam(Ljava/lang/String;Lnet/minecraft/world/scores/PlayerTeam;)V", cancellable = true)
    private void removePlayerFromTeam_720095820(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(720095820L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removePlayerFromTeam(Ljava/lang/String;)Z", cancellable = true)
    private void removePlayerFromTeam_289552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(289552L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getObjectives()Ljava/util/Collection;", cancellable = true)
    private void getObjectives_2030776923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2030776923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeObjective(Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void removeObjective__2131782868(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2131782868L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTeamNames()Ljava/util/Collection;", cancellable = true)
    private void getTeamNames__136130560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-136130560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addPlayerTeam(Ljava/lang/String;)Lnet/minecraft/world/scores/PlayerTeam;", cancellable = true)
    private void addPlayerTeam_2103657615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2103657615L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onObjectiveAdded(Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void onObjectiveAdded__1062788965(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1062788965L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetSinglePlayerScore(Lnet/minecraft/world/scores/ScoreHolder;Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void resetSinglePlayerScore_46480821(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(46480821L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlayerRemoved(Lnet/minecraft/world/scores/ScoreHolder;)V", cancellable = true)
    private void onPlayerRemoved__767692804(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-767692804L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlayerScoreRemoved(Lnet/minecraft/world/scores/ScoreHolder;Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void onPlayerScoreRemoved_1250327361(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1250327361L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onObjectiveRemoved(Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void onObjectiveRemoved__2071632197(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2071632197L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onTeamChanged(Lnet/minecraft/world/scores/PlayerTeam;)V", cancellable = true)
    private void onTeamChanged__1153241086(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1153241086L))
            info.cancel();
    }


}
