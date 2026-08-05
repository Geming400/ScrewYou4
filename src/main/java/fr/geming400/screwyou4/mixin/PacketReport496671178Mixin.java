package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.info.PacketReport.class)
public class PacketReport496671178Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__638789293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-638789293L))
            info.setReturnValue("G|1F6v\uD334 e#!H^<N w]//WN9WMckEbD](b<j,\u6D9E,;|'{!0.A\uCF903ghoHiu\u77A0#:c6G\u33ECL@&sQHHtsqgDY+\u5D71wve'2,2kF^e\u65C0{Z\uD7B1%`>a/");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_1223193636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1223193636L))
            info.setReturnValue(null);
    }


}
