package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.ReportEnvironment.Server.ThirdParty.class)
public class ThirdParty265094053Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__643532215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-643532215L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1035517578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1035517578L))
            info.setReturnValue("|K+\uFBFD5|kZ'-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_822446144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(822446144L))
            info.setReturnValue(785502832);
    }

    @Inject(at = @At("HEAD"), method = "ip()Ljava/lang/String;", cancellable = true)
    private void ip__1636439787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1636439787L))
            info.setReturnValue("y\u4E1F\u6765;\uA232`^]7YBX>]5\u8824Q1Au>{1iL) zrGd#=i0\u77E3\u8C70Y\u297B)\uB8A4\u55C2[[x'ng%#ZqMuI?g{6iwB+CjF[uG=Vc)hz\u876B+jE\u1AC2w");
    }


}
