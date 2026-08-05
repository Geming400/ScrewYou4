package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.ColorLerper.Type.class)
public class Type1476032921Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/color/ColorLerper$Type;", cancellable = true)
    private static void values_1636545515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1636545515L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/color/ColorLerper$Type;", cancellable = true)
    private static void valueOf_1205467076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1205467076L))
            info.setReturnValue(net.minecraft.client.color.ColorLerper.Type.MUSIC_NOTE);
    }

    @Inject(at = @At("HEAD"), method = "getColor(Lnet/minecraft/world/item/DyeColor;)I", cancellable = true)
    private void getColor_1493797685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1493797685L))
            info.setReturnValue(-1828312868);
    }


}
