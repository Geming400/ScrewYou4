package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.SpriteContents.AnimationState.class)
public class AnimationState1391230916Mixin {
        @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__723344513(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-723344513L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1261547258(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1261547258L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "drawToAtlas(Lcom/mojang/blaze3d/systems/RenderPass;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V", cancellable = true)
    private void drawToAtlas__1663713125(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1663713125L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "needsToDraw()Z", cancellable = true)
    private void needsToDraw__1282242657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1282242657L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDrawUbo(I)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;", cancellable = true)
    private void getDrawUbo_1228815676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1228815676L))
            info.setReturnValue(null);
    }


}
