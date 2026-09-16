package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.MagmaCubeRenderer.class)
public class MagmaCubeRenderer148992145Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_402163124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(402163124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/SlimeRenderState;", cancellable = true)
    private void createRenderState__1306302059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1306302059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_2121506980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2121506980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/SlimeRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1168237144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1168237144L))
            info.setReturnValue(null);
    }


}
