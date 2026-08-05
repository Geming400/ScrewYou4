package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.CsvOutput.class)
public class CsvOutput_1393937223Mixin {
        @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/util/CsvOutput$Builder;", cancellable = true)
    private static void builder__314917438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-314917438L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeRow([Ljava/lang/Object;)V", cancellable = true)
    private void writeRow_151374427(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(151374427L))
            info.cancel();
    }


}
