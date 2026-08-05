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
            info.setReturnValue("qQ^^=pV,䣿pw倧M]geA`i8Bꌚ2^\"wR-o斺bbl8IF8,m5o탿,>a;←tE&7*TD:訖0w4T肰소:+ X0'$N⾙+yD CNE>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1784343873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1784343873L))
            info.setReturnValue(69897328);
    }

    @Inject(at = @At("HEAD"), method = "header()Ljava/lang/String;", cancellable = true)
    private void header_610620660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(610620660L))
            info.setReturnValue(",8/),<)CxlD,}hm)헷5b㫯a'gI쎼勧p[hu퉊eJlЅP_)5oACi<绍rz⃝㔞]/*Gh$|jLXbL@6`Qo#⍴l8琧!VYTp嶠?1Eg06豻㴜uNWP`$");
    }

    @Inject(at = @At("HEAD"), method = "getErrorComment()Ljava/lang/String;", cancellable = true)
    private void getErrorComment_610620660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(610620660L))
            info.setReturnValue(",8/),<)CxlD,}hm)헷5b㫯a'gI쎼勧p[hu퉊eJlЅP_)5oACi<绍rz⃝㔞]/*Gh$|jLXbL@6`Qo#⍴l8琧!VYTp嶠?1Eg06豻㴜uNWP`$");
    }

    @Inject(at = @At("HEAD"), method = "appendHeader(Ljava/lang/StringBuilder;Ljava/util/List;)V", cancellable = true)
    private void appendHeader_2055130992(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2055130992L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nuggets()Ljava/util/List;", cancellable = true)
    private void nuggets__922549349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-922549349L))
            info.setReturnValue(null);
    }


}
