package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.ColorLerper.Type.class)
public class Type1476032921Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/color/ColorLerper$Type;", cancellable = true)
    private static void values_741172041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(741172041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/color/ColorLerper$Type;", cancellable = true)
    private static void valueOf__1522308116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1522308116L))
            info.setReturnValue(net.minecraft.client.color.ColorLerper.Type.SHEEP);
    }

    @Inject(at = @At("HEAD"), method = "getColor(Lnet/minecraft/world/item/DyeColor;)I", cancellable = true)
    private void getColor_750823048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(750823048L))
            info.setReturnValue(1252116617);
    }


}
