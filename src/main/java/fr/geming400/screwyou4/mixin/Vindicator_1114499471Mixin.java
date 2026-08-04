package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.illager.Vindicator.class)
public class Vindicator_1114499471Mixin {
        @Inject(at = @At("HEAD"), method = "getArmPose()Lnet/minecraft/world/entity/monster/illager/AbstractIllager$IllagerArmPose;", cancellable = true)
    private void getArmPose_760917556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(760917556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_414281025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(414281025L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCustomName(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setCustomName__786679467(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-786679467L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn__1331735888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1331735888L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyRaidBuffs(Lnet/minecraft/server/level/ServerLevel;IZ)V", cancellable = true)
    private void applyRaidBuffs__1941503869(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1941503869L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCelebrateSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getCelebrateSound__2090254928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2090254928L))
            info.setReturnValue(null);
    }


}
