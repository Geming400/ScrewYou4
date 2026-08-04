package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.IndexedPathElement.class)
public class IndexedPathElement_1581711832Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1619974077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619974077L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get()Ljava/lang/String;", cancellable = true)
    private void get_446251360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(446251360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1327743206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1327743206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_446251856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(446251856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1619974573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619974573L))
            info.setReturnValue(null);
    }


}
