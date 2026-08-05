package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.hurtingprojectile.WitherSkull.class)
public class WitherSkull764991228Mixin {
        @Inject(at = @At("HEAD"), method = "isDangerous()Z", cancellable = true)
    private void isDangerous_803269811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(803269811L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBlockExplosionResistance(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;F)F", cancellable = true)
    private void getBlockExplosionResistance__2067351049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2067351049L))
            info.setReturnValue(9.098745E8F);
    }

    @Inject(at = @At("HEAD"), method = "isOnFire()Z", cancellable = true)
    private void isOnFire_803269811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(803269811L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setDangerous(Z)V", cancellable = true)
    private void setDangerous_1994608057(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1994608057L))
            info.cancel();
    }


}
