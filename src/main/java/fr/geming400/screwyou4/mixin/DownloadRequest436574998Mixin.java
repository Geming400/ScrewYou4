package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.DownloadQueue.DownloadRequest.class)
public class DownloadRequest436574998Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__472051270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-472051270L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1206998523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1206998523L))
            info.setReturnValue("f9u");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_993927089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(993927089L))
            info.setReturnValue(999713996);
    }

    @Inject(at = @At("HEAD"), method = "hash()Lcom/google/common/hash/HashCode;", cancellable = true)
    private void hash__232098836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-232098836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "url()Ljava/net/URL;", cancellable = true)
    private void url_777130243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777130243L))
            info.setReturnValue(null);
    }


}
