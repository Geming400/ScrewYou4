package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.DamageScaling.class)
public class DamageScaling2024917114Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/damagesource/DamageScaling;", cancellable = true)
    private static void values_167662261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(167662261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/damagesource/DamageScaling;", cancellable = true)
    private static void valueOf__183147726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-183147726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_889456643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(889456643L))
            info.setReturnValue(null);
    }


}
