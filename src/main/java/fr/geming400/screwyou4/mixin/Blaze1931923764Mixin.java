package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Blaze.class)
public class Blaze1931923764Mixin {
        @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__987941542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-987941542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSensitiveToWater()Z", cancellable = true)
    private void isSensitiveToWater__814319685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-814319685L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isOnFire()Z", cancellable = true)
    private void isOnFire_151862220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(151862220L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLightLevelDependentMagicValue()F", cancellable = true)
    private void getLightLevelDependentMagicValue__289960520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-289960520L))
            info.setReturnValue(9.716812E8F);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__731745965(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-731745965L))
            info.cancel();
    }


}
