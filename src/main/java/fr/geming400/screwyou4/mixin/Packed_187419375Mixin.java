package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.trialspawner.TrialSpawnerStateData.Packed.class)
public class Packed_187419375Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1572931633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1572931633L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__948040601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-948040601L))
            info.setReturnValue("B&2T\u7113=sDJ\u995C.p<*F_Ph>'+ZKfLvG'.[#)Nb+\u00E4A29Dc^ ^'9\uD730\u5B09:(m{s\u926D\uD70B>\u01A4MGv\uB2E6\u9DDEEi=.>PC\u6622#s?'qm<24\u190C\u6963u]6I");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_225682116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(225682116L))
            info.setReturnValue(-208842960);
    }

    @Inject(at = @At("HEAD"), method = "detectedPlayers()Ljava/util/Set;", cancellable = true)
    private void detectedPlayers__1641616112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1641616112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "totalMobsSpawned()I", cancellable = true)
    private void totalMobsSpawned_225681620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(225681620L))
            info.setReturnValue(-5695541);
    }

    @Inject(at = @At("HEAD"), method = "cooldownEndsAt()J", cancellable = true)
    private void cooldownEndsAt_225682581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(225682581L))
            info.setReturnValue(-4586637381469316862L);
    }

    @Inject(at = @At("HEAD"), method = "nextMobSpawnsAt()J", cancellable = true)
    private void nextMobSpawnsAt_225682581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(225682581L))
            info.setReturnValue(-4586637381469316862L);
    }

    @Inject(at = @At("HEAD"), method = "ejectingLootTable()Ljava/util/Optional;", cancellable = true)
    private void ejectingLootTable_432880796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432880796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "currentMobs()Ljava/util/Set;", cancellable = true)
    private void currentMobs__1641616112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1641616112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nextSpawnData()Ljava/util/Optional;", cancellable = true)
    private void nextSpawnData_432880796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(432880796L))
            info.setReturnValue(null);
    }


}
