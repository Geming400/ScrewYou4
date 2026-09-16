package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.scores.Scoreboard.PackedScore.class)
public class PackedScore1558456498Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_649830230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(649830230L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1966087273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1966087273L))
            info.setReturnValue("bM%c\uADFC9y!cQP\u6D62Q+\uAB77w*Lew\uA43Cj^ &v$ \u0DDED|FG+&\u8B059a\"?[CLx+;GF`1\u4C98@R\uAA14:pl1$JYM` <");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2115808589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2115808589L))
            info.setReturnValue(1272790498);
    }

    @Inject(at = @At("HEAD"), method = "owner()Ljava/lang/String;", cancellable = true)
    private void owner_316080814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(316080814L))
            info.setReturnValue("\u5106I pjVY*OdW}M%pS4-REq'=BE}_<]PLx]vTJ");
    }

    @Inject(at = @At("HEAD"), method = "objective()Ljava/lang/String;", cancellable = true)
    private void objective_817332404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(817332404L))
            info.setReturnValue("uR8W\u72FF+h:k}3Qqt6{\uC82A8mn.J\uCE2EddMpz\u477Br}*\u2CD1]w<$o-BJ\u1B8A\"xBalCD@0&9FlQ\u324E\u837EBzp+BVV=cE\uB85D.,Rz1CxzlT\u0B0B5HBCI");
    }

    @Inject(at = @At("HEAD"), method = "score()Lnet/minecraft/world/scores/Score$Packed;", cancellable = true)
    private void score__1860562243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1860562243L))
            info.setReturnValue(null);
    }


}
