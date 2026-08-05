package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.ErrorEntry.class)
public class ErrorEntry_1486102816Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1423352222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1423352222L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_350642840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(350642840L))
            info.setReturnValue("\u5E9Ay^vX\u37933yxCyd(Sgvk");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1524365557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1524365557L))
            info.setReturnValue(1743716360);
    }

    @Inject(at = @At("HEAD"), method = "reason()Ljava/lang/Object;", cancellable = true)
    private void reason__949672262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-949672262L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "cursor()I", cancellable = true)
    private void cursor_1524365061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1524365061L))
            info.setReturnValue(444804073);
    }

    @Inject(at = @At("HEAD"), method = "suggestions()Lnet/minecraft/util/parsing/packrat/SuggestionSupplier;", cancellable = true)
    private void suggestions_1736204408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1736204408L))
            info.setReturnValue(null);
    }


}
