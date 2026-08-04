package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.AbortedFileFixException.class)
public class AbortedFileFixException860623623Mixin {
        @Inject(at = @At("HEAD"), method = "notRevertedMoves()Ljava/util/List;", cancellable = true)
    private void notRevertedMoves__1808006857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1808006857L))
            info.setReturnValue(null);
    }


}
