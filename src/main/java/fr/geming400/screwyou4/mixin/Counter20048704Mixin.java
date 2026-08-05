package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.SoundBufferLibrary.DebugOutput.Counter.class)
public class Counter20048704Mixin {
        @Inject(at = @At("HEAD"), method = "totalSize()J", cancellable = true)
    private void totalSize_58311911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(58311911L))
            info.setReturnValue(-8235719502041391222L);
    }

    @Inject(at = @At("HEAD"), method = "totalCount()I", cancellable = true)
    private void totalCount_58310950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(58310950L))
            info.setReturnValue(-1142409461);
    }

    @Inject(at = @At("HEAD"), method = "accountBuffer(Lnet/minecraft/resources/Identifier;ILjavax/sound/sampled/AudioFormat;)V", cancellable = true)
    private void accountBuffer__1078444358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1078444358L))
            info.cancel();
    }


}
