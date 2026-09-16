package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.SlideDownBlockTrigger.TriggerInstance.class)
public class TriggerInstance_1157723439Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_249097170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(249097170L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1928146963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1928146963L))
            info.setReturnValue("\uC0AElu\u5FB4\u3267nf\u3DA0q0,\u78D0;[5x/oh\u956E9\u0527BedL\"g>2\u5C5D\uAEDC\u8F3C3olG},a&[i'MGgJ-\u7367)7.W.yu74Ey=\u1A6D\u66EA.0OtN\uA73B>\u8BFF\u713B0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1715075529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715075529L))
            info.setReturnValue(844694475);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void matches__794402943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-794402943L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "state()Ljava/util/Optional;", cancellable = true)
    private void state__1233303443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1233303443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "block()Ljava/util/Optional;", cancellable = true)
    private void block__1916201879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1916201879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__72929603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-72929603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slidesDownBlock(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void slidesDownBlock__1486326554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1486326554L))
            info.setReturnValue(null);
    }


}
