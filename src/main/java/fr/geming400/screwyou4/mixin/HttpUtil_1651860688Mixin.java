package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.HttpUtil.class)
public class HttpUtil_1651860688Mixin {
        @Inject(at = @At("HEAD"), method = "getAvailablePort()I", cancellable = true)
    private static void getAvailablePort__166013703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-166013703L))
            info.setReturnValue(154006724);
    }

    @Inject(at = @At("HEAD"), method = "isPortAvailable(I)Z", cancellable = true)
    private static void isPortAvailable__834232395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-834232395L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "downloadFile(Ljava/nio/file/Path;Ljava/net/URL;Ljava/util/Map;Lcom/google/common/hash/HashFunction;Lcom/google/common/hash/HashCode;ILjava/net/Proxy;Lnet/minecraft/util/HttpUtil$DownloadProgressListener;)Ljava/nio/file/Path;", cancellable = true)
    private static void downloadFile_128939923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(128939923L))
            info.setReturnValue(null);
    }


}
