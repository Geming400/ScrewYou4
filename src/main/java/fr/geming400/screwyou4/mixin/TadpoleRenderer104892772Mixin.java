package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.TadpoleRenderer.class)
public class TadpoleRenderer104892772Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__483743672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-483743672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;", cancellable = true)
    private void createRenderState__589184367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-589184367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_2107400445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2107400445L))
            info.setReturnValue(null);
    }


}
