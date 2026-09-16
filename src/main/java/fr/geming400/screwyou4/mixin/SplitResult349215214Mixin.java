package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.DataComponentPatch.SplitResult.class)
public class SplitResult349215214Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__559411054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-559411054L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1119638739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119638739L))
            info.setReturnValue("uQcppX$x1-c)onRA7_R\u57AEm8^b\u374EH.Jiv:m\u7667XGEu,7u8(C'TU{");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_906567305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(906567305L))
            info.setReturnValue(1752749227);
    }

    @Inject(at = @At("HEAD"), method = "added()Lnet/minecraft/core/component/DataComponentMap;", cancellable = true)
    private void added__895896581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-895896581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removed()Ljava/util/Set;", cancellable = true)
    private void removed__1895757904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1895757904L))
            info.setReturnValue(null);
    }


}
