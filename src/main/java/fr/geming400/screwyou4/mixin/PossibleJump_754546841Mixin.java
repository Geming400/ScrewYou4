package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.LongJumpToRandomPos.PossibleJump.class)
public class PossibleJump_754546841Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__154079428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-154079428L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1524970365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1524970365L))
            info.setReturnValue("\u24D3<3Z$<O\u71F6E\uAB50,=<fv\u3000kC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1311898931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1311898931L))
            info.setReturnValue(276825755);
    }

    @Inject(at = @At("HEAD"), method = "weight()I", cancellable = true)
    private void weight__1515268346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1515268346L))
            info.setReturnValue(1122975601);
    }

    @Inject(at = @At("HEAD"), method = "targetPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void targetPos__1207351434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1207351434L))
            info.setReturnValue(null);
    }


}
