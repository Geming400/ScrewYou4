package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.LightLayer.class)
public class LightLayer1613273517Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/LightLayer;", cancellable = true)
    private static void values__1630035085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630035085L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/LightLayer;", cancellable = true)
    private static void valueOf_413471162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(413471162L))
            info.setReturnValue(net.minecraft.world.level.LightLayer.BLOCK);
    }


}
