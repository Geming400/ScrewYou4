package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ZoglinRenderer.class)
public class ZoglinRenderer1055000342Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/HoglinRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_866256100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866256100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1267452119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1267452119L))
            info.setReturnValue(null);
    }


}
