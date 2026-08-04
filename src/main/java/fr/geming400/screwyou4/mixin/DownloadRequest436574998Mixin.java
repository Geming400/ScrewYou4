package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.DownloadQueue.DownloadRequest.class)
public class DownloadRequest436574998Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1822087257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822087257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__698884977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-698884977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_474837740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(474837740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hash()Lcom/google/common/hash/HashCode;", cancellable = true)
    private void hash__104725446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-104725446L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "url()Ljava/net/URL;", cancellable = true)
    private void url__2106119852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2106119852L))
            info.setReturnValue(null);
    }


}
