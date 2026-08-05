package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.SlideDownBlockTrigger.TriggerInstance.class)
public class TriggerInstance_1157723439Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1751731599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1751731599L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_22263463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(22263463L))
            info.setReturnValue("T H$\u862C+O4yL81%F\uFD14k\u105D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1195986180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1195986180L))
            info.setReturnValue(-674966134);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void matches_1012434452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1012434452L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "state()Ljava/util/Optional;", cancellable = true)
    private void state_1403184860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1403184860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Ljava/util/Optional;", cancellable = true)
    private void block_1403184860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1403184860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1403184860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1403184860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slidesDownBlock(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void slidesDownBlock_1581525981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1581525981L))
            info.setReturnValue(null);
    }


}
