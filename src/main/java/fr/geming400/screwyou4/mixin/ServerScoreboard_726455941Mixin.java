package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ServerScoreboard.class)
public class ServerScoreboard_726455941Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/world/scores/ScoreboardSaveData$Packed;)V", cancellable = true)
    private void load__93408350(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-93408350L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onObjectiveChanged(Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void onObjectiveChanged__481839542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-481839542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onTeamRemoved(Lnet/minecraft/world/scores/PlayerTeam;)V", cancellable = true)
    private void onTeamRemoved__1967880013(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1967880013L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removePlayerFromTeam(Ljava/lang/String;Lnet/minecraft/world/scores/PlayerTeam;)V", cancellable = true)
    private void removePlayerFromTeam__1738484375(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1738484375L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDisplayObjective(Lnet/minecraft/world/scores/DisplaySlot;Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void setDisplayObjective_68282326(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(68282326L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onObjectiveRemoved(Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void onObjectiveRemoved__481839542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-481839542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onTeamAdded(Lnet/minecraft/world/scores/PlayerTeam;)V", cancellable = true)
    private void onTeamAdded__1967880013(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1967880013L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlayerRemoved(Lnet/minecraft/world/scores/ScoreHolder;)V", cancellable = true)
    private void onPlayerRemoved_1554499973(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1554499973L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlayerScoreRemoved(Lnet/minecraft/world/scores/ScoreHolder;Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void onPlayerScoreRemoved_1460992024(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1460992024L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onObjectiveAdded(Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void onObjectiveAdded__481839542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-481839542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getObjectiveDisplaySlotCount(Lnet/minecraft/world/scores/Objective;)I", cancellable = true)
    private void getObjectiveDisplaySlotCount__481852035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-481852035L))
            info.setReturnValue(1649178177);
    }

    @Inject(at = @At("HEAD"), method = "onTeamChanged(Lnet/minecraft/world/scores/PlayerTeam;)V", cancellable = true)
    private void onTeamChanged__1967880013(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1967880013L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPlayerToTeam(Ljava/lang/String;Lnet/minecraft/world/scores/PlayerTeam;)Z", cancellable = true)
    private void addPlayerToTeam__1738480531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1738480531L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getStopTrackingPackets(Lnet/minecraft/world/scores/Objective;)Ljava/util/List;", cancellable = true)
    private void getStopTrackingPackets__550485183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-550485183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStartTrackingPackets(Lnet/minecraft/world/scores/Objective;)Ljava/util/List;", cancellable = true)
    private void getStartTrackingPackets__550485183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-550485183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startTrackingObjective(Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void startTrackingObjective__481839542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-481839542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopTrackingObjective(Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void stopTrackingObjective__481839542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-481839542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "storeToSaveDataIfDirty(Lnet/minecraft/world/scores/ScoreboardSaveData;)V", cancellable = true)
    private void storeToSaveDataIfDirty__1510647242(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1510647242L))
            info.cancel();
    }


}
