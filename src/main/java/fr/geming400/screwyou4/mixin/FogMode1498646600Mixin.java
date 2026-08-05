package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.fog.FogRenderer.FogMode.class)
public class FogMode1498646600Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/fog/FogRenderer$FogMode;", cancellable = true)
    private static void values_2106056474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106056474L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/fog/FogRenderer$FogMode;", cancellable = true)
    private static void valueOf_106018813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(106018813L))
            info.setReturnValue(net.minecraft.client.renderer.fog.FogRenderer.FogMode.WORLD);
    }


}
