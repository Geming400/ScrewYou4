package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.DownloadQueue.BatchResult.class)
public class BatchResult_1288752602Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_380126333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(380126333L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2059176126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2059176126L))
            info.setReturnValue("L$\u3AF5>s_+%}SEU)+\uC2CFOJ}\u4058Aga+Z\uD094!&?NY6O\u5DAF\u71DA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1846104692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846104692L))
            info.setReturnValue(-248880224);
    }

    @Inject(at = @At("HEAD"), method = "downloaded()Ljava/util/Map;", cancellable = true)
    private void downloaded__119365062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-119365062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "failed()Ljava/util/Set;", cancellable = true)
    private void failed__1443565410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1443565410L))
            info.setReturnValue(null);
    }


}
