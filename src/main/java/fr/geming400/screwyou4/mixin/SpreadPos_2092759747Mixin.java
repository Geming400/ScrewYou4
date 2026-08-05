package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MultifaceSpreader.SpreadPos.class)
public class SpreadPos_2092759747Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__816695291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-816695291L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_957299771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(957299771L))
            info.setReturnValue("&%5㮦|$\"Wg멦/?%H㷆価]L{(JOMs3IT}鈐{vwU&@sSk夠D癴b5VｮSxs<3z⌅8槨@xX났w4nk$5`S o입ꆬ%>;arC;hm.龎s)+oJ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2131022488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131022488L))
            info.setReturnValue(-1123776770);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos_199372867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199372867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "face()Lnet/minecraft/core/Direction;", cancellable = true)
    private void face_1329904461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1329904461L))
            info.setReturnValue(net.minecraft.core.Direction.EAST);
    }


}
