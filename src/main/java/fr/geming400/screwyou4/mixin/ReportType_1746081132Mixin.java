package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.ReportType.class)
public class ReportType_1746081132Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1163373906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1163373906L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_610621156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(610621156L))
            info.setReturnValue("qQ^^=pV,\u48FFpw\u5027M]geA`i8B\uA31A2^\"wR-o\u65BAbbl8IF8,m5o\uD0FF,>a;\u2190tE&7*TD:\u8A160w4T\u80B0\uC18C:+ X0'$N\u2F99+yD CNE>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1784343873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1784343873L))
            info.setReturnValue(-718070672);
    }

    @Inject(at = @At("HEAD"), method = "header()Ljava/lang/String;", cancellable = true)
    private void header_610620660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(610620660L))
            info.setReturnValue(",8/),<)CxlD,}hm)\uD5F75b\u3AEFa'gI\uC3BC\u52E7p[hu\uD24AeJl\u0405P_)5oACi<\u7ECDrz\u20DD\u351E]/*Gh$|jLXbL@6`Qo#\u2374l8\u7427!VYTp\u5DA0?1Eg06\u8C7B\u3D1CuNWP`$");
    }

    @Inject(at = @At("HEAD"), method = "nuggets()Ljava/util/List;", cancellable = true)
    private void nuggets__922549349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-922549349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "appendHeader(Ljava/lang/StringBuilder;Ljava/util/List;)V", cancellable = true)
    private void appendHeader_2055130992(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2055130992L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getErrorComment()Ljava/lang/String;", cancellable = true)
    private void getErrorComment_610620660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(610620660L))
            info.setReturnValue(",8/),<)CxlD,}hm)\uD5F75b\u3AEFa'gI\uC3BC\u52E7p[hu\uD24AeJl\u0405P_)5oACi<\u7ECDrz\u20DD\u351E]/*Gh$|jLXbL@6`Qo#\u2374l8\u7427!VYTp\u5DA0?1Eg06\u8C7B\u3D1CuNWP`$");
    }


}
