package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.ErrorCollector.Nop.class)
public class Nop_2146705154Mixin {
        @Inject(at = @At("HEAD"), method = "store(ILnet/minecraft/util/parsing/packrat/SuggestionSupplier;Ljava/lang/Object;)V", cancellable = true)
    private void store_1760320611(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1760320611L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "finish(I)V", cancellable = true)
    private void finish__934345171(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-934345171L))
            info.cancel();
    }


}
