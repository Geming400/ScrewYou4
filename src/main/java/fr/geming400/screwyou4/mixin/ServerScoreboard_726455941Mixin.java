package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.ServerScoreboard.class)
public class ServerScoreboard_726455941Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/world/scores/ScoreboardSaveData$Packed;)V", cancellable = true)
    private void load_35268348(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(35268348L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPlayerToTeam(Ljava/lang/String;Lnet/minecraft/world/scores/PlayerTeam;)Z", cancellable = true)
    private void addPlayerToTeam__2133649433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133649433L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getObjectiveDisplaySlotCount(Lnet/minecraft/world/scores/Objective;)I", cancellable = true)
    private void getObjectiveDisplaySlotCount__1146774901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1146774901L))
            info.setReturnValue(-1321009212);
    }

    @Inject(at = @At("HEAD"), method = "getStartTrackingPackets(Lnet/minecraft/world/scores/Objective;)Ljava/util/List;", cancellable = true)
    private void getStartTrackingPackets_923386665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(923386665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStopTrackingPackets(Lnet/minecraft/world/scores/Objective;)Ljava/util/List;", cancellable = true)
    private void getStopTrackingPackets_942727901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(942727901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "startTrackingObjective(Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void startTrackingObjective_1836995146(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1836995146L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopTrackingObjective(Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void stopTrackingObjective_1865377258(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1865377258L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "storeToSaveDataIfDirty(Lnet/minecraft/world/scores/ScoreboardSaveData;)V", cancellable = true)
    private void storeToSaveDataIfDirty_90294856(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(90294856L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onObjectiveAdded(Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void onObjectiveAdded__1623092348(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1623092348L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlayerRemoved(Lnet/minecraft/world/scores/ScoreHolder;)V", cancellable = true)
    private void onPlayerRemoved__1327996187(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1327996187L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPlayerScoreRemoved(Lnet/minecraft/world/scores/ScoreHolder;Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void onPlayerScoreRemoved_690023978(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(690023978L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDisplayObjective(Lnet/minecraft/world/scores/DisplaySlot;Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void setDisplayObjective_507856925(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(507856925L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onObjectiveRemoved(Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void onObjectiveRemoved_1663031716(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1663031716L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onTeamAdded(Lnet/minecraft/world/scores/PlayerTeam;)V", cancellable = true)
    private void onTeamAdded__2071711689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2071711689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onTeamRemoved(Lnet/minecraft/world/scores/PlayerTeam;)V", cancellable = true)
    private void onTeamRemoved__798144873(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-798144873L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removePlayerFromTeam(Ljava/lang/String;Lnet/minecraft/world/scores/PlayerTeam;)V", cancellable = true)
    private void removePlayerFromTeam_159792437(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(159792437L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onObjectiveChanged(Lnet/minecraft/world/scores/Objective;)V", cancellable = true)
    private void onObjectiveChanged_802218704(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(802218704L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onTeamChanged(Lnet/minecraft/world/scores/PlayerTeam;)V", cancellable = true)
    private void onTeamChanged__1713544469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1713544469L))
            info.cancel();
    }


}
