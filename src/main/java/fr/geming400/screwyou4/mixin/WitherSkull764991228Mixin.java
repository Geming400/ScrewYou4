package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.hurtingprojectile.WitherSkull.class)
public class WitherSkull764991228Mixin {
        @Inject(at = @At("HEAD"), method = "isDangerous()Z", cancellable = true)
    private void isDangerous_179933299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179933299L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isOnFire()Z", cancellable = true)
    private void isOnFire__1015070316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1015070316L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBlockExplosionResistance(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;F)F", cancellable = true)
    private void getBlockExplosionResistance__1871512370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1871512370L))
            info.setReturnValue(1.138712E8F);
    }

    @Inject(at = @At("HEAD"), method = "setDangerous(Z)V", cancellable = true)
    private void setDangerous__476963903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-476963903L))
            info.cancel();
    }


}
