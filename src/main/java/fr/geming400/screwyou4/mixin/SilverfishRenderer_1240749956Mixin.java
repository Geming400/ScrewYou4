package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.SilverfishRenderer.class)
public class SilverfishRenderer_1240749956Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;", cancellable = true)
    private void createRenderState_546672816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(546672816L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.LivingEntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_652113511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652113511L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1051709668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1051709668L))
            info.setReturnValue(null);
    }


}
