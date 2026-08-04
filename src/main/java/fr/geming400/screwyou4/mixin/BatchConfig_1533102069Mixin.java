package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.DownloadQueue.BatchConfig.class)
public class BatchConfig_1533102069Mixin {
        @Inject(at = @At("HEAD"), method = "maxSize()I", cancellable = true)
    private void maxSize_1571364314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1571364314L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1376352969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1376352969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_397642093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(397642093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1571364810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1571364810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "proxy()Ljava/net/Proxy;", cancellable = true)
    private void proxy_1084359635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1084359635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "headers()Ljava/util/Map;", cancellable = true)
    private void headers__471521572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-471521572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listener()Lnet/minecraft/util/HttpUtil$DownloadProgressListener;", cancellable = true)
    private void listener__34880904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-34880904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashFunction()Lcom/google/common/hash/HashFunction;", cancellable = true)
    private void hashFunction_1362543437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1362543437L))
            info.setReturnValue(null);
    }


}
