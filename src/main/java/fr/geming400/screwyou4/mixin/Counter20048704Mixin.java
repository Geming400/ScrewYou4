package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.SoundBufferLibrary.DebugOutput.Counter.class)
public class Counter20048704Mixin {
        @Inject(at = @At("HEAD"), method = "totalSize()J", cancellable = true)
    private void totalSize_1284009634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1284009634L))
            info.setReturnValue(-3223934616109743790L);
    }

    @Inject(at = @At("HEAD"), method = "totalCount()I", cancellable = true)
    private void totalCount__1410845733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1410845733L))
            info.setReturnValue(1573395912);
    }

    @Inject(at = @At("HEAD"), method = "accountBuffer(Lnet/minecraft/resources/Identifier;ILjavax/sound/sampled/AudioFormat;)V", cancellable = true)
    private void accountBuffer_1456086989(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1456086989L))
            info.cancel();
    }


}
