package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.skeleton.WitherSkeleton.class)
public class WitherSkeleton61207762Mixin {
        @Inject(at = @At("HEAD"), method = "doHurtTarget(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private void doHurtTarget_976866908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(976866908L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canBeAffected(Lnet/minecraft/world/effect/MobEffectInstance;)Z", cancellable = true)
    private void canBeAffected__1554138888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1554138888L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPreferredWeaponType()Lnet/minecraft/tags/TagKey;", cancellable = true)
    private void getPreferredWeaponType__1647682642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1647682642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canHoldItem(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canHoldItem__2012040564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2012040564L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "finalizeSpawn(Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/world/entity/SpawnGroupData;)Lnet/minecraft/world/entity/SpawnGroupData;", cancellable = true)
    private void finalizeSpawn_811306071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(811306071L))
            info.setReturnValue(null);
    }


}
