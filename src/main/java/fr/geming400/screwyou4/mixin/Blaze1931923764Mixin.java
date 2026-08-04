package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.Blaze.class)
public class Blaze1931923764Mixin {
        @Inject(at = @At("HEAD"), method = "isSensitiveToWater()Z", cancellable = true)
    private void isSensitiveToWater_1970202347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1970202347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightLevelDependentMagicValue()F", cancellable = true)
    private void getLightLevelDependentMagicValue_1970183127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1970183127L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOnFire()Z", cancellable = true)
    private void isOnFire_1970202347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1970202347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_1970198503(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1970198503L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1231705319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1231705319L))
            info.setReturnValue(null);
    }


}
