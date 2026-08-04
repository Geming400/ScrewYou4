package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.UndeadHorseRenderer.Type.class)
public class Type_876918937Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/entity/UndeadHorseRenderer$Type;", cancellable = true)
    private static void values_267548080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(267548080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/entity/UndeadHorseRenderer$Type;", cancellable = true)
    private static void valueOf__166544493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-166544493L))
            info.setReturnValue(null);
    }


}
