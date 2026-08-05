package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.DownloadQueue.BatchConfig.class)
public class BatchConfig_1533102069Mixin {
        @Inject(at = @At("HEAD"), method = "maxSize()I", cancellable = true)
    private void maxSize_553542005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(553542005L))
            info.setReturnValue(-1943076177);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_624475800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(624475800L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1991441703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1991441703L))
            info.setReturnValue("QuDT\u2F80j)JR\uCF74M`\"_=)\u8EF8k2K&\"xkm\u2CD1a+/l-FT^D}61)%$Dd8V;$\u0F71,FQ$=AE[uK\u4BCFGrK\u9426o\uC999&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2090454159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2090454159L))
            info.setReturnValue(-2120037874);
    }

    @Inject(at = @At("HEAD"), method = "proxy()Ljava/net/Proxy;", cancellable = true)
    private void proxy_2096253761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2096253761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "headers()Ljava/util/Map;", cancellable = true)
    private void headers__3699306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-3699306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listener()Lnet/minecraft/util/HttpUtil$DownloadProgressListener;", cancellable = true)
    private void listener_1002405420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1002405420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashFunction()Lcom/google/common/hash/HashFunction;", cancellable = true)
    private void hashFunction__1440041209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1440041209L))
            info.setReturnValue(null);
    }


}
