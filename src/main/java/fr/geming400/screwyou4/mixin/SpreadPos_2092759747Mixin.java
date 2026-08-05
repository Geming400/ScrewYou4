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
            info.setReturnValue("&%5\u3BA6|$\"Wg\uBA66/?%H\u3DC6\u4FA1]L{(JOMs3IT}\u9210{vwU&@sSk\u5920D\u7674b5V\uFF6ESxs<3z\u23058\u69E8@xX\uB0ACw4nk$5`S o\uC785\uA1AC%>;arC;hm.\u9F8Es)+oJ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2131022488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131022488L))
            info.setReturnValue(-320588870);
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
