package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.ErrorCollector.LongestOnly.class)
public class LongestOnly_932018747Mixin {
        @Inject(at = @At("HEAD"), method = "store(ILnet/minecraft/util/parsing/packrat/SuggestionSupplier;Ljava/lang/Object;)V", cancellable = true)
    private void store_576211099(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(576211099L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_1228932346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1228932346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "finish(I)V", cancellable = true)
    private void finish__1848839239(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1848839239L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cursor()I", cancellable = true)
    private void cursor__690756982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-690756982L))
            info.setReturnValue(456424084);
    }


}
