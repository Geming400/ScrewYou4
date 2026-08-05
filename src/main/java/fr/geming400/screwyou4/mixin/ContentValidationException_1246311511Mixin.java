package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.validation.ContentValidationException.class)
public class ContentValidationException_1246311511Mixin {
        @Inject(at = @At("HEAD"), method = "getMessage(Ljava/nio/file/Path;Ljava/util/List;)Ljava/lang/String;", cancellable = true)
    private static void getMessage_464278872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(464278872L))
            info.setReturnValue("ABNBt#rjdc+!rn=x0dLf)I)*g FABwxb%CD}yN+'");
    }

    @Inject(at = @At("HEAD"), method = "getMessage()Ljava/lang/String;", cancellable = true)
    private void getMessage_606309616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(606309616L))
            info.setReturnValue("}T\u01FEu{EtRa9s7avI2J<\u00B1\uD6CBGTG5\"(A9UGNkQ[3r;56pPMb\u754B)OSEQ[;\u9976\uAA46s(GcXr\u2F20G_NRu\u4187.Bivr0pUx* )4Y*u");
    }


}
