package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.ValidationContext.ParametersNotProvidedProblem.class)
public class ParametersNotProvidedProblem1597303585Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_688677317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(688677317L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1927240186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1927240186L))
            info.setReturnValue("as5\u45C0i\u24BC\u3507\u1905[\uC868\u050B+3E\u983B?)\u8961eF\uBE6F^Qj@V6uT\uD5008Af8\uCA546rQd\u0A1C\uFE05,`\u6CC5=NkCm\u4864-MBNF_A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2140311620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2140311620L))
            info.setReturnValue(704910421);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description_423315878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(423315878L))
            info.setReturnValue("C\uBB2FG#7O&:EV!DsfY\u21F9\u9ABD<I;cMR4gC_$du 5\uADF2\u49E99]D\u359F<0");
    }

    @Inject(at = @At("HEAD"), method = "notProvided()Ljava/util/Set;", cancellable = true)
    private void notProvided__391639123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-391639123L))
            info.setReturnValue(null);
    }


}
