package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.BlazeRenderer.class)
public class BlazeRenderer_1411707817Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;", cancellable = true)
    private void createRenderState_717630677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(717630677L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_823071372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(823071372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__880751807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-880751807L))
            info.setReturnValue(null);
    }


}
