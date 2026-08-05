package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.illager.Vindicator.class)
public class Vindicator_1114499471Mixin {
        @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__1805365836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1805365836L))
            info.setReturnValue(new net.minecraft.world.entity.ai.attributes.AttributeSupplier.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setCustomName(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setCustomName_2032435959(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2032435959L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCelebrateSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getCelebrateSound__1567060494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1567060494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyRaidBuffs(Lnet/minecraft/server/level/ServerLevel;IZ)V", cancellable = true)
    private void applyRaidBuffs_142027323(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(142027323L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1864597779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1864597779L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getArmPose()Lnet/minecraft/world/entity/monster/illager/AbstractIllager$IllagerArmPose;", cancellable = true)
    private void getArmPose_213813373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(213813373L))
            info.setReturnValue(net.minecraft.world.entity.monster.illager.AbstractIllager.IllagerArmPose.CELEBRATING);
    }


}
