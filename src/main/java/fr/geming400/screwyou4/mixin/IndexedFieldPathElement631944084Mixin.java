package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.IndexedFieldPathElement.class)
public class IndexedFieldPathElement631944084Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1326060520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1326060520L))
            info.setReturnValue(-1623528772);
    }

    @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_1441211240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441211240L))
            info.setReturnValue("\u7A33Y#i\"\u68112\u1659@9C\u8E93\u30A3CE6tF\u144F$`j8,}eu&\u236D4:u8%y].c4+\uA5EEW!%}4+\u531BbB9$j=;@FGq @b");
    }

    @Inject(at = @At("HEAD"), method = "get()Ljava/lang/String;", cancellable = true)
    private void get_478330355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(478330355L))
            info.setReturnValue("q\u13FBIGaKUdnsUk\u4BCD.6FT'='7KE3'R\"l}LSUM\u9384I+Xuw\u932Ay\u0A6EriU9EC{Ns1fNobg\uFB59P?T}W.1\u1773873m\uB0734z*Ls:E");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__276682184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-276682184L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1402367609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1402367609L))
            info.setReturnValue("?'+\uA03A|o+gCz1\uA1A2V)6t.?rpG\uC15DT");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1189296175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1189296175L))
            info.setReturnValue(1478039364);
    }


}
