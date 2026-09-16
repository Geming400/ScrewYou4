package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.ColorLerper.class)
public class ColorLerper1499827577Mixin {
        @Inject(at = @At("HEAD"), method = "getLerpedColor(Lnet/minecraft/client/color/ColorLerper$Type;F)I", cancellable = true)
    private static void getLerpedColor_1531899730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1531899730L))
            info.setReturnValue(160618316);
    }


}
