package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.feline.CatSoundVariant.class)
public class CatSoundVariant1253580110Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_344953842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(344953842L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2024003635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2024003635L))
            info.setReturnValue("<U[go\uB89Dm|YBz\u5213IcM07MQg\uA96081Hc\uD2EA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1810932201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1810932201L))
            info.setReturnValue(1002289071);
    }

    @Inject(at = @At("HEAD"), method = "adultSounds()Lnet/minecraft/world/entity/animal/feline/CatSoundVariant$CatSoundSet;", cancellable = true)
    private void adultSounds_502816397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(502816397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "babySounds()Lnet/minecraft/world/entity/animal/feline/CatSoundVariant$CatSoundSet;", cancellable = true)
    private void babySounds_1462217129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1462217129L))
            info.setReturnValue(null);
    }


}
