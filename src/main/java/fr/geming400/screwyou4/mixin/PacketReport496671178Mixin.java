package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.info.PacketReport.class)
public class PacketReport496671178Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1392175724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1392175724L))
            info.setReturnValue("dyT7\u32BE;KSZ\u1F2C\u45CD\uFEAC,uif).\u8D28u#R-6)k\uD356\uFD84T%1dKtR1+3|n71c&t,YoM6 +;;\u6E80)aiPBmCvgj\u3C95tI\"_2\u605Fa4\u2AB6s\uA245)|\u9720F<_[G./\uA07ESqm-\u0AA7");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_596396921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(596396921L))
            info.setReturnValue(null);
    }


}
