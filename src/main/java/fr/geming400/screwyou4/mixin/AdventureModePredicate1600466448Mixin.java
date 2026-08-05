package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.AdventureModePredicate.class)
public class AdventureModePredicate1600466448Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1308989085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1308989085L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_465005977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(465005977L))
            info.setReturnValue("+\u82B3RUo'0U\u2F8Cd6\u3452A\uC233oModWFLpf/66`G3`r9fEK]1\u466E\u2400Czwa,G J /D{l3J_b\uB4ADb_SN\u319BS$V,D3Dwlrni)OT\uAB80w\u9A8BYp;u");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1638728694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1638728694L))
            info.setReturnValue(797341556);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/block/state/pattern/BlockInWorld;)Z", cancellable = true)
    private void test__1085236325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1085236325L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Ljava/util/function/Consumer;)V", cancellable = true)
    private void addToTooltip__2013484435(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2013484435L))
            info.cancel();
    }


}
