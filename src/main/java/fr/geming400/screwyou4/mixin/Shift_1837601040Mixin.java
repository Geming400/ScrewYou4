package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.providers.TrueTypeGlyphProviderDefinition.Shift.class)
public class Shift_1837601040Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1071853998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1071853998L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_702141064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702141064L))
            info.setReturnValue(";\u38E0uN0\u1064\u7E4Cum%fF@-+\u5233b6)9 \uC967F;<.(%pr2JL9r\u28A9\uB9AAedTsTlX^!]L1\u97B2\u86FA=>PkZcv<S+AqN\u5FE2O M6\u3FCAl+Z\u0491+\u9011t-F%Y1Vo");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1875863781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875863781L))
            info.setReturnValue(843019309);
    }

    @Inject(at = @At("HEAD"), method = "x()F", cancellable = true)
    private void x_1875860402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875860402L))
            info.setReturnValue(6.650431E8F);
    }

    @Inject(at = @At("HEAD"), method = "y()F", cancellable = true)
    private void y_1875860402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875860402L))
            info.setReturnValue(6.650431E8F);
    }


}
