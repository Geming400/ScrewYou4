package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.skeleton.WitherSkeleton.class)
public class WitherSkeleton61207762Mixin {
        @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_1909939700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1909939700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget_1705247473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705247473L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canBeAffected(Lnet/minecraft/world/effect/MobEffectInstance;)Z", cancellable = true)
    private void canBeAffected_217079839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(217079839L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canHoldItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canHoldItem_1795742894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1795742894L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPreferredWeaponType()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void getPreferredWeaponType_908541807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(908541807L))
            info.setReturnValue(null);
    }


}
