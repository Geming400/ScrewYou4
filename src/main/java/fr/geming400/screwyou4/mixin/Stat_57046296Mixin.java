package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.stats.Stat.class)
public class Stat_57046296Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__851580469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-851580469L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_827469324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(827469324L))
            info.setReturnValue("i,(M|{Z.0$]\u9C86FAsKY\uD77CxND>Cu1T$3T7s&%Fu,r*M\uA8470\"nTq^p5%\u6725vI!e\u15C5n\uD259'zfk+_P?42Sa\u0D88gsn%8Q\u20178sC7;({t;I\u17F80qt;ot");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_614397890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(614397890L))
            info.setReturnValue(-2008289448);
    }

    @Inject(at = @At("HEAD"), method = "getValue()Ljava/lang/Object;", cancellable = true)
    private void getValue_1311335469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1311335469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "format(I)Ljava/lang/String;", cancellable = true)
    private void format_634435440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(634435440L))
            info.setReturnValue("9ACWB+P0JqhyI+,':>d;QYqMI?>CgMEfq?q\u697D-3Xlv:?7=Ur&\u9F30t\u5745#m,'mp\u33D3e\u00DC%;#Ajt\u91D0G%8I%9y`U_*wSz`+");
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/stats/StatType;", cancellable = true)
    private void getType_649545891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(649545891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buildName(Lnet/minecraft/stats/StatType;Ljava/lang/Object;)Ljava/lang/String;", cancellable = true)
    private static void buildName__2020289384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2020289384L))
            info.setReturnValue("%\u964By*/`k\u399DsUq^slkk \uC174\u35F8\uAB77\u0B03 \uB9A8czk|#{m1R33^q\uFACF_N\u6632;\uB463|xv\u5F14IELA\uF93E\u43FF:h 0fz^hK\u91FC\u641FE1.1lowI781ezG !b=$@Rb@r]8a\u2D58");
    }


}
