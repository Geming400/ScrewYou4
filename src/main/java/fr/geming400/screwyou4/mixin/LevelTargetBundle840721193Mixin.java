package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.LevelTargetBundle.class)
public class LevelTargetBundle840721193Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Lcom/mojang/blaze3d/resource/ResourceHandle;", cancellable = true)
    private void get__1643758685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643758685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_878995932(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(878995932L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "replace(Lnet/minecraft/resources/Identifier;Lcom/mojang/blaze3d/resource/ResourceHandle;)V", cancellable = true)
    private void replace__366259225(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-366259225L))
            info.cancel();
    }


}
