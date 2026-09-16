package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.repository.KnownPack.class)
public class KnownPack_2016907074Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1108280805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1108280805L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1507637194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1507637194L))
            info.setReturnValue("NZ>[48j.e9[3\uA0A8$ub%yO?%2(");
    }

    @Inject(at = @At("HEAD"), method = "version()Ljava/lang/String;", cancellable = true)
    private void version__94684766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-94684766L))
            info.setReturnValue("L_\u6022j\uC729\u5496{K(\u26B23sG\u5987Uuw@hd/Pb.\u3D3AobuN\u4C00l|DO4A\u9F9E\u6C92F-e\u6BE50mcU'p\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1720708132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1720708132L))
            info.setReturnValue(62320685);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id__1936898651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1936898651L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "namespace()Ljava/lang/String;", cancellable = true)
    private void namespace_1785781733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1785781733L))
            info.setReturnValue("rB]k\u2627;\u3D34O)%Ez57F\u5610wh%B0${D\u4D0F\uB9A2\u5E1A6y\u4531\u7C31\u7178|Z0VRw83.w\uAD4C!\u7091XZH\u2F06UOv!\u1643 )P$J/5Rpl:}Gt+OSW&$/'J1");
    }

    @Inject(at = @At("HEAD"), method = "isVanilla()Z", cancellable = true)
    private void isVanilla__722554713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-722554713L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "vanilla(Ljava/lang/String;)Lnet/minecraft/server/packs/repository/KnownPack;", cancellable = true)
    private static void vanilla_830863560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830863560L))
            info.setReturnValue(null);
    }


}
