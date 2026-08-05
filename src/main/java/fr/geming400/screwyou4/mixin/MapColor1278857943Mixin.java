package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.material.MapColor.class)
public class MapColor1278857943Mixin {
        @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/level/material/MapColor;", cancellable = true)
    private static void byId__2062528199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2062528199L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPackedId(Lnet/minecraft/world/level/material/MapColor$Brightness;)B", cancellable = true)
    private void getPackedId__1995199549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1995199549L))
            info.setReturnValue(45);
    }

    @Inject(at = @At("HEAD"), method = "calculateARGBColor(Lnet/minecraft/world/level/material/MapColor$Brightness;)I", cancellable = true)
    private void calculateARGBColor__1995192822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1995192822L))
            info.setReturnValue(-287096451);
    }

    @Inject(at = @At("HEAD"), method = "getColorFromPackedId(I)I", cancellable = true)
    private static void getColorFromPackedId__1802204626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1802204626L))
            info.setReturnValue(362623002);
    }


}
