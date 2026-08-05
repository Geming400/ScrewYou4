package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.VindicatorRenderer.class)
public class VindicatorRenderer352603888Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__236032556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-236032556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/IllagerRenderState;", cancellable = true)
    private void createRenderState__1311948921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1311948921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/IllagerRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__263361331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-263361331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1939726775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939726775L))
            info.setReturnValue(null);
    }


}
