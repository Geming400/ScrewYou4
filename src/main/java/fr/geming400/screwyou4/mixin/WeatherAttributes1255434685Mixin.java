package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.WeatherAttributes.class)
public class WeatherAttributes1255434685Mixin {
        @Inject(at = @At("HEAD"), method = "addBuiltinLayers(Lnet/minecraft/world/attribute/EnvironmentAttributeSystem$Builder;Lnet/minecraft/world/attribute/WeatherAttributes$WeatherAccess;)V", cancellable = true)
    private static void addBuiltinLayers__1898443064(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1898443064L))
            info.cancel();
    }


}
