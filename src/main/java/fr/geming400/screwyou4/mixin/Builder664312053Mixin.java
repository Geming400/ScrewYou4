package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestRunner.Builder.class)
public class Builder664312053Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/gametest/framework/GameTestRunner;", cancellable = true)
    private void build__1833615107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1833615107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "batcher(Lnet/minecraft/gametest/framework/GameTestRunner$GameTestBatcher;)Lnet/minecraft/gametest/framework/GameTestRunner$Builder;", cancellable = true)
    private void batcher_831295202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(831295202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "haltOnError()Lnet/minecraft/gametest/framework/GameTestRunner$Builder;", cancellable = true)
    private void haltOnError_1078257606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078257606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newStructureSpawner(Lnet/minecraft/gametest/framework/GameTestRunner$StructureSpawner;)Lnet/minecraft/gametest/framework/GameTestRunner$Builder;", cancellable = true)
    private void newStructureSpawner_1534343864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1534343864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "existingStructureSpawner(Lnet/minecraft/gametest/framework/StructureGridSpawner;)Lnet/minecraft/gametest/framework/GameTestRunner$Builder;", cancellable = true)
    private void existingStructureSpawner_1103994854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1103994854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromBatches(Ljava/util/Collection;Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/gametest/framework/GameTestRunner$Builder;", cancellable = true)
    private static void fromBatches_1130379072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1130379072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearBetweenBatches()Lnet/minecraft/gametest/framework/GameTestRunner$Builder;", cancellable = true)
    private void clearBetweenBatches_1078257606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078257606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromInfo(Ljava/util/Collection;Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/gametest/framework/GameTestRunner$Builder;", cancellable = true)
    private static void fromInfo_1130379072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1130379072L))
            info.setReturnValue(null);
    }


}
