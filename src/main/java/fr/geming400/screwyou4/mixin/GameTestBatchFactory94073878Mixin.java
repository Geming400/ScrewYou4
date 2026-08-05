package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestBatchFactory.class)
public class GameTestBatchFactory94073878Mixin {
        @Inject(at = @At("HEAD"), method = "divideIntoBatches(Ljava/util/Collection;Lnet/minecraft/gametest/framework/GameTestBatchFactory$TestDecorator;Lnet/minecraft/server/level/ServerLevel;)Ljava/util/List;", cancellable = true)
    private static void divideIntoBatches__1892605752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892605752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromGameTestInfo()Lnet/minecraft/gametest/framework/GameTestRunner$GameTestBatcher;", cancellable = true)
    private static void fromGameTestInfo__1362843049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1362843049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromGameTestInfo(I)Lnet/minecraft/gametest/framework/GameTestRunner$GameTestBatcher;", cancellable = true)
    private static void fromGameTestInfo__1386790192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1386790192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toGameTestBatch(Ljava/util/Collection;Lnet/minecraft/core/Holder;I)Lnet/minecraft/gametest/framework/GameTestBatch;", cancellable = true)
    private static void toGameTestBatch_136535635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(136535635L))
            info.setReturnValue(null);
    }


}
