package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.BlockPos.TraversalNodeStatus.class)
public class TraversalNodeStatus1427430873Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/core/BlockPos$TraversalNodeStatus;", cancellable = true)
    private static void values_263347437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(263347437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/core/BlockPos$TraversalNodeStatus;", cancellable = true)
    private static void valueOf__619115450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-619115450L))
            info.setReturnValue(net.minecraft.core.BlockPos.TraversalNodeStatus.STOP);
    }


}
