package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.main.GameConfig.QuickPlayDisabled.class)
public class QuickPlayDisabled_464659681Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__443966588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-443966588L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1235083205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1235083205L))
            info.setReturnValue("\uB6A0I{z]xm}\u1510\u7312b\u7E96}j\u5C33Pb./9/`N\uBFAB}IM3\uF9D2$D7c;Gly_K2jOe_,\u4F54");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1022011771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1022011771L))
            info.setReturnValue(-1382877183);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled__1569488320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569488320L))
            info.setReturnValue(false);
    }


}
