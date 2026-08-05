package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.LevelTargetBundle.class)
public class LevelTargetBundle840721193Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Lcom/mojang/blaze3d/resource/ResourceHandle;", cancellable = true)
    private void get__434170887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-434170887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_54893487(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(54893487L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "replace(Lnet/minecraft/resources/Identifier;Lcom/mojang/blaze3d/resource/ResourceHandle;)V", cancellable = true)
    private void replace__64702029(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-64702029L))
            info.cancel();
    }


}
