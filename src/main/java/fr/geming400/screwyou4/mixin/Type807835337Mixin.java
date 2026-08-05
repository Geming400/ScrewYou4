package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.DonkeyRenderer.Type.class)
public class Type807835337Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/entity/DonkeyRenderer$Type;", cancellable = true)
    private static void values_1362940729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1362940729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/entity/DonkeyRenderer$Type;", cancellable = true)
    private static void valueOf__1972688010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1972688010L))
            info.setReturnValue(net.minecraft.client.renderer.entity.DonkeyRenderer.Type.MULE);
    }


}
