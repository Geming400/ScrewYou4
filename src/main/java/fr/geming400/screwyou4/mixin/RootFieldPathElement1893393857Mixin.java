package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.RootFieldPathElement.class)
public class RootFieldPathElement1893393857Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__1592306283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1592306283L))
            info.setReturnValue("/$Q5f0=B|h\uA5BD$Dz\u90987\uD4BC&");
    }

    @Inject(at = @At("HEAD"), method = "get()Ljava/lang/String;", cancellable = true)
    private void get_1739780128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1739780128L))
            info.setReturnValue("\u8DD4E?`Cl`;wgHoKiE\u58DE/\u1635%4mM\uA3AD]6s+R,O5Nt$Ola\u8C72\uD7E8C/H01/y{m$");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_984767589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(984767589L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1631149914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1631149914L))
            info.setReturnValue("Qe\u4EDFq|lvOqI{7R\u72F0AQ&*iM{E M\u2CEDE\u10C7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1844221348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1844221348L))
            info.setReturnValue(984302406);
    }


}
