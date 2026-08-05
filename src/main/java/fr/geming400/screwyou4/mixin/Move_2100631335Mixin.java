package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.filefix.operations.Move.class)
public class Move_2100631335Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1192005066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1192005066L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1423912437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1423912437L))
            info.setReturnValue("pukji`");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1636983871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1636983871L))
            info.setReturnValue(207616879);
    }

    @Inject(at = @At("HEAD"), method = "from()Ljava/lang/String;", cancellable = true)
    private void from__1351879975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1351879975L))
            info.setReturnValue("Hc]zO\u66F3_!UfZy\u72D9a/}z\u8F16h4`G\u8E62!fQE[[K|}B^\uCB0Dp;YRTQw]fOIX\u5049 .}pF'\uA9BFu,'f-(R<je#Oc;B`A) Rl[G1X\uD5AEiQ&@%LM?y{X9");
    }

    @Inject(at = @At("HEAD"), method = "to()Ljava/lang/String;", cancellable = true)
    private void to__1782741270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1782741270L))
            info.setReturnValue("\uAE608W*#j\u04AFFH\u67C2N(\uD307;e[g\u3FDE\uBF22>lm1Q\u5FF8#W@\u63C7(\u503D*{<K>0Rj\u74F5jQ_?[@VKix35\uD7F4^LG\u7E0C)^3KG\uC343w\uD66A\u582ANo4[/X\u9BD6c;^.c+\u6287(\u79FD8i\u081E+o*\u8D10\u06DB8");
    }

    @Inject(at = @At("HEAD"), method = "fix(Ljava/nio/file/Path;Lnet/minecraft/util/worldupdate/UpgradeProgress;)V", cancellable = true)
    private void fix__10586922(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-10586922L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "relative(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/util/filefix/operations/Move;", cancellable = true)
    private void relative_1825782311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1825782311L))
            info.setReturnValue(null);
    }


}
