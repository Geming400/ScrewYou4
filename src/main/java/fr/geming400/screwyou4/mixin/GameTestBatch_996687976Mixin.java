package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestBatch.class)
public class GameTestBatch_996687976Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1690804411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1690804411L))
            info.setReturnValue(-912003011);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_88061707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(88061707L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1767111500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1767111500L))
            info.setReturnValue("6\u9BC8[$w=fvG\u4551[j=p+_\uAF96F.\u1065%BItvWvU7ouA2'?\u8702*2S4^y^ElPk+\"FKW:W?6>-2 {F{x8UoMHO`'\u43F1r>Je/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1554040066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1554040066L))
            info.setReturnValue(-470894728);
    }

    @Inject(at = @At("HEAD"), method = "environment()Lnet/minecraft/core/Holder;", cancellable = true)
    private void environment_147293168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(147293168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gameTestInfos()Ljava/util/Collection;", cancellable = true)
    private void gameTestInfos__985163304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-985163304L))
            info.setReturnValue(null);
    }


}
