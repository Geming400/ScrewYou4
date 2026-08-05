package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.info.CommandsReport.class)
public class CommandsReport2030240842Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_141393940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141393940L))
            info.setReturnValue("\uBB6Dcnn?*ux<AOyj\u2333 H./iu?MHn?dwUY,8]@q8L?G\"T\uBD69Cy+ua\"Bm0\u9DAE7/5%\u125Ds.Dy)I_9Txp=4mtya\u53FCwFMLol_75zZHFxH8,I`MD");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_2129966585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2129966585L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
