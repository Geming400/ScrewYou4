package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.CsvOutput.class)
public class CsvOutput_1393937223Mixin {
        @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/util/CsvOutput$Builder;", cancellable = true)
    private static void builder__567050265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-567050265L))
            info.setReturnValue(new net.minecraft.util.CsvOutput.Builder());
    }

    @Inject(at = @At("HEAD"), method = "writeRow([Ljava/lang/Object;)V", cancellable = true)
    private void writeRow__842341920(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-842341920L))
            info.cancel();
    }


}
