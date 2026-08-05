package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.info.BiomeParametersDumpReport.class)
public class BiomeParametersDumpReport787257700Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1101589202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1101589202L))
            info.setReturnValue("M#@H31\u67E9=h'!A4!,p\u3CCA7`&>vJBN|z/g\uB73C|\u1E69icj&h][9Y]*\u7020\uC1A0?l+C#");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_886983443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886983443L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }


}
