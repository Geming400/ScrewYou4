package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.LongJumpToRandomPos.PossibleJump.class)
public class PossibleJump_754546841Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2140059099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2140059099L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__380913135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-380913135L))
            info.setReturnValue("*E]+_&S姞lk{រ^醟⳦ᴯ4伄s7l碑V}ܐ$E붂Qk6燍G1tgO%@ﶱ뛠ksM<[ェH-jMjmVei0}`D-iJ㘖沸d55w*怐[똆YX< {=s[Zƥa眘iG#l녷");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_792809582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(792809582L))
            info.setReturnValue(1733487709);
    }

    @Inject(at = @At("HEAD"), method = "weight()I", cancellable = true)
    private void weight_792809086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(792809086L))
            info.setReturnValue(360703633);
    }

    @Inject(at = @At("HEAD"), method = "targetPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void targetPos__1138840039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1138840039L))
            info.setReturnValue(null);
    }


}
