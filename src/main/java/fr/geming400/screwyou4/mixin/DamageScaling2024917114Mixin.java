package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.DamageScaling.class)
public class DamageScaling2024917114Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/damagesource/DamageScaling;", cancellable = true)
    private static void values__1803049261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1803049261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/damagesource/DamageScaling;", cancellable = true)
    private static void valueOf__2108610470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2108610470L))
            info.setReturnValue(net.minecraft.world.damagesource.DamageScaling.ALWAYS);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_2113125736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2113125736L))
            info.setReturnValue("G{");
    }


}
