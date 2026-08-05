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
            info.setReturnValue(";㣠uN0ၤ繌um%fF@-+刳b6)9 쥧F;<.(%pr2JL9r⢩릪edTsTlX^!]L1鞲蛺=>PkZcv<S+AqN忢O M6㿊l+Zґ+逑t-F%Y1Vo");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1875863781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875863781L))
            info.setReturnValue(791496409);
    }

    @Inject(at = @At("HEAD"), method = "x()F", cancellable = true)
    private void x_1875860402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875860402L))
            info.setReturnValue(6.135202E8F);
    }

    @Inject(at = @At("HEAD"), method = "y()F", cancellable = true)
    private void y_1875860402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1875860402L))
            info.setReturnValue(6.135202E8F);
    }


}
