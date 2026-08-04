package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.BlockPos.TraversalNodeStatus.class)
public class TraversalNodeStatus1427430873Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/core/BlockPos$TraversalNodeStatus;", cancellable = true)
    private static void values_1225862475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1225862475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/core/BlockPos$TraversalNodeStatus;", cancellable = true)
    private static void valueOf__1059312530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1059312530L))
            info.setReturnValue(null);
    }


}
