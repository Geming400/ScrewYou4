package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.maps.MapFrame.class)
public class MapFrame102449367Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__806176901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-806176901L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_872872892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872872892L))
            info.setReturnValue("CeOih@\uC802\u8A22 \uBFFCr( U5\uD267?{iwG@h\"KZ De9Q^!eym:43:.>y|9e>&SG13\uABC1YZOt,\u7D93*i!UkLQ!d\u1D2C\u9881\uBC80C-|<%Z{n!\u28EDd;8X");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_659801458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(659801458L))
            info.setReturnValue(1092720595);
    }

    @Inject(at = @At("HEAD"), method = "getId()Ljava/lang/String;", cancellable = true)
    private void getId_1249740977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1249740977L))
            info.setReturnValue("C6]\"9u0|LSG\uF99C");
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos_2116640388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116640388L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation()I", cancellable = true)
    private void rotation_303957503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(303957503L))
            info.setReturnValue(1873225672);
    }

    @Inject(at = @At("HEAD"), method = "entityId()I", cancellable = true)
    private void entityId_585507103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(585507103L))
            info.setReturnValue(789380655);
    }

    @Inject(at = @At("HEAD"), method = "frameId(Lnet/minecraft/core/BlockPos;)Ljava/lang/String;", cancellable = true)
    private static void frameId__1407776356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1407776356L))
            info.setReturnValue(" 1T`pqH|wA`]KU Cg#a^Uh\uC3BD\u00B3:d\uC889CMOK\uAC4Atx=\uB3BA\u7C13.o\uD28E1\u4369!KCw\uCCBD/|;D+a\uBEAD8FZk^'.rpkc$XVNFk8]H3oc\u7D11e&Tg{#{\u13E8Vh");
    }


}
