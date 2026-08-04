package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.material.FogType.class)
public class FogType_223246310Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/material/FogType;", cancellable = true)
    private static void values_172235864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(172235864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/material/FogType;", cancellable = true)
    private static void valueOf__2117536939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2117536939L))
            info.setReturnValue(null);
    }


}
