package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestRunner.Builder.class)
public class Builder664312053Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/gametest/framework/GameTestRunner;", cancellable = true)
    private void build__742808753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-742808753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromInfo(Ljava/util/Collection;Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/gametest/framework/GameTestRunner$Builder;", cancellable = true)
    private static void fromInfo_1009344712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1009344712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "batcher(Lnet/minecraft/gametest/framework/GameTestRunner$GameTestBatcher;)Lnet/minecraft/gametest/framework/GameTestRunner$Builder;", cancellable = true)
    private void batcher_1737181705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1737181705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "haltOnError()Lnet/minecraft/gametest/framework/GameTestRunner$Builder;", cancellable = true)
    private void haltOnError_1898843358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1898843358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "existingStructureSpawner(Lnet/minecraft/gametest/framework/StructureGridSpawner;)Lnet/minecraft/gametest/framework/GameTestRunner$Builder;", cancellable = true)
    private void existingStructureSpawner_566809606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(566809606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromBatches(Ljava/util/Collection;Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/gametest/framework/GameTestRunner$Builder;", cancellable = true)
    private static void fromBatches_1910516258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1910516258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearBetweenBatches()Lnet/minecraft/gametest/framework/GameTestRunner$Builder;", cancellable = true)
    private void clearBetweenBatches__931752199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-931752199L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newStructureSpawner(Lnet/minecraft/gametest/framework/GameTestRunner$StructureSpawner;)Lnet/minecraft/gametest/framework/GameTestRunner$Builder;", cancellable = true)
    private void newStructureSpawner__830553629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-830553629L))
            info.setReturnValue(null);
    }


}
