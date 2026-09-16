package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestBatchFactory.class)
public class GameTestBatchFactory94073878Mixin {
        @Inject(at = @At("HEAD"), method = "toGameTestBatch(Ljava/util/Collection;Lnet/minecraft/core/Holder;I)Lnet/minecraft/gametest/framework/GameTestBatch;", cancellable = true)
    private static void toGameTestBatch_1135695182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1135695182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "divideIntoBatches(Ljava/util/Collection;Lnet/minecraft/gametest/framework/GameTestBatchFactory$TestDecorator;Lnet/minecraft/server/level/ServerLevel;)Ljava/util/List;", cancellable = true)
    private static void divideIntoBatches_1023648569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1023648569L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromGameTestInfo()Lnet/minecraft/gametest/framework/GameTestRunner$GameTestBatcher;", cancellable = true)
    private static void fromGameTestInfo_1078087835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078087835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromGameTestInfo(I)Lnet/minecraft/gametest/framework/GameTestRunner$GameTestBatcher;", cancellable = true)
    private static void fromGameTestInfo_1267623180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1267623180L))
            info.setReturnValue(null);
    }


}
