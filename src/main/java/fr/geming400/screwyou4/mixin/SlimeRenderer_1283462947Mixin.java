package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.SlimeRenderer.class)
public class SlimeRenderer_1283462947Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SlimeRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__33766343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-33766343L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1038989515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1038989515L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1536633925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1536633925L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SlimeRenderState;", cancellable = true)
    private void createRenderState__171831258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-171831258L))
            info.setReturnValue(null);
    }


}
