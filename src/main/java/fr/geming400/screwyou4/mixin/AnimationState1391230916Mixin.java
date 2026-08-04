package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.SpriteContents.AnimationState.class)
public class AnimationState1391230916Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1429505655(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1429505655L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1429505655(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1429505655L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDrawUbo(I)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void getDrawUbo_192317908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(192317908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "needsToDraw()Z", cancellable = true)
    private void needsToDraw_1429509499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1429509499L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "drawToAtlas(Lcom/mojang/blaze3d/systems/RenderPass;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V", cancellable = true)
    private void drawToAtlas_1544190727(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1544190727L))
            info.cancel();
    }


}
