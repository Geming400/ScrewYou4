package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.DonkeyRenderer.Type.class)
public class Type807835337Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/entity/DonkeyRenderer$Type;", cancellable = true)
    private static void values__2114315817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2114315817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/entity/DonkeyRenderer$Type;", cancellable = true)
    private static void valueOf_1261477534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1261477534L))
            info.setReturnValue(net.minecraft.client.renderer.entity.DonkeyRenderer.Type.MULE);
    }


}
