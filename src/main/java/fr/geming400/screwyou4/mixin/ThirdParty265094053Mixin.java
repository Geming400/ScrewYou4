package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.ReportEnvironment.Server.ThirdParty.class)
public class ThirdParty265094053Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1650606312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1650606312L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__870365922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-870365922L))
            info.setReturnValue("5\u4DA1}iA5Nb\u9944V_74[\u8FB9\u2CBF(pueSlE^\uD5C19?(\u4B0D>ESEQ?L--&91):C;f|\"ifJI6`\u120C\u20E4J_Q8Z]+\u756F'X;:v\u8399C%@z3]lmGj?<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_303356795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(303356795L))
            info.setReturnValue(-1413123221);
    }

    @Inject(at = @At("HEAD"), method = "ip()Ljava/lang/String;", cancellable = true)
    private void ip__870366418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-870366418L))
            info.setReturnValue("90n\u566DlIhMqK2>l DT=Ad#R\u9FDDn5\uCC46\u9C418=-E*q`");
    }


}
