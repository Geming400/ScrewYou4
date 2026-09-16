package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.material.MapColor.class)
public class MapColor1278857943Mixin {
        @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/level/material/MapColor;", cancellable = true)
    private static void byId__1183820661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1183820661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPackedId(Lnet/minecraft/world/level/material/MapColor$Brightness;)B", cancellable = true)
    private void getPackedId__827959494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-827959494L))
            info.setReturnValue(94);
    }

    @Inject(at = @At("HEAD"), method = "getColorFromPackedId(I)I", cancellable = true)
    private static void getColorFromPackedId_983458424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(983458424L))
            info.setReturnValue(-846893451);
    }

    @Inject(at = @At("HEAD"), method = "calculateARGBColor(Lnet/minecraft/world/level/material/MapColor$Brightness;)I", cancellable = true)
    private void calculateARGBColor__1053117863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1053117863L))
            info.setReturnValue(-1795677308);
    }


}
