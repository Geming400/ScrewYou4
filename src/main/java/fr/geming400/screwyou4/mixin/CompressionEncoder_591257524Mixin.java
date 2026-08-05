package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.CompressionEncoder.class)
public class CompressionEncoder_591257524Mixin {
        @Inject(at = @At("HEAD"), method = "setThreshold(I)V", cancellable = true)
    private void setThreshold_1805174495(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1805174495L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getThreshold()I", cancellable = true)
    private void getThreshold_629519769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(629519769L))
            info.setReturnValue(1153178545);
    }


}
