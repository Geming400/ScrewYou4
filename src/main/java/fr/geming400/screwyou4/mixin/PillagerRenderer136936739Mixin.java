package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.PillagerRenderer.class)
public class PillagerRenderer136936739Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__451699705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-451699705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/IllagerRenderState;", cancellable = true)
    private void createRenderState__1527616070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1527616070L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.IllagerRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/IllagerRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__479028480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-479028480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_2139573372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139573372L))
            info.setReturnValue(null);
    }


}
