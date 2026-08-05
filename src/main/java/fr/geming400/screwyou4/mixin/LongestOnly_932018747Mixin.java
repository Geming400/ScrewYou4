package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.ErrorCollector.LongestOnly.class)
public class LongestOnly_932018747Mixin {
        @Inject(at = @At("HEAD"), method = "store(ILnet/minecraft/util/parsing/packrat/SuggestionSupplier;Ljava/lang/Object;)V", cancellable = true)
    private void store_545634204(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(545634204L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries__1736611734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1736611734L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finish(I)V", cancellable = true)
    private void finish_2145935718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2145935718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cursor()I", cancellable = true)
    private void cursor_970280992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(970280992L))
            info.setReturnValue(702088195);
    }


}
