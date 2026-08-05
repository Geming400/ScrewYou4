package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.HttpUtil.class)
public class HttpUtil_1651860688Mixin {
        @Inject(at = @At("HEAD"), method = "downloadFile(Ljava/nio/file/Path;Ljava/net/URL;Ljava/util/Map;Lcom/google/common/hash/HashFunction;Lcom/google/common/hash/HashCode;ILjava/net/Proxy;Lnet/minecraft/util/HttpUtil$DownloadProgressListener;)Ljava/nio/file/Path;", cancellable = true)
    private static void downloadFile__1313268625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1313268625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAvailablePort()I", cancellable = true)
    private static void getAvailablePort_1690123181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1690123181L))
            info.setReturnValue(1314469845);
    }

    @Inject(at = @At("HEAD"), method = "isPortAvailable(I)Z", cancellable = true)
    private static void isPortAvailable__1429185545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1429185545L))
            info.setReturnValue(true);
    }


}
