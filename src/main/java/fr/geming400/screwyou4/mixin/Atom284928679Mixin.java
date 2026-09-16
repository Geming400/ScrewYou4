package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.parsing.packrat.Atom.class)
public class Atom284928679Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_1094195835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1094195835L))
            info.setReturnValue("v+Qy:lw:m>}t=%'BQn\u3CE2 ,7>{7K:hzQ|rrtn_SIg6\u32DFG");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__623697589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623697589L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1055351708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1055351708L))
            info.setReturnValue("c:09eX\u78D0eT@/F\")[kI d?>%\u04CE_A!%\u13D3s_p*t@14DHa9h_\u2A344H&\uBC1D\u2322");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_842280770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(842280770L))
            info.setReturnValue(-989112163);
    }

    @Inject(at = @At("HEAD"), method = "of(Ljava/lang/String;)Lnet/minecraft/util/parsing/packrat/Atom;", cancellable = true)
    private static void of_401987402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(401987402L))
            info.setReturnValue(null);
    }


}
