package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.material.MapColor.Brightness.class)
public class Brightness_635924008Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/material/MapColor$Brightness;", cancellable = true)
    private static void values_171964196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(171964196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/material/MapColor$Brightness;", cancellable = true)
    private static void valueOf__1699661151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1699661151L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byId(I)Lnet/minecraft/world/level/material/MapColor$Brightness;", cancellable = true)
    private static void byId__2026412718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2026412718L))
            info.setReturnValue(null);
    }


}
