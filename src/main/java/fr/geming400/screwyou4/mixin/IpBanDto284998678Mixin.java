package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.IpBanlistService.IpBanDto.class)
public class IpBanDto284998678Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1670510937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1670510937L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__850461297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-850461297L))
            info.setReturnValue("nz\u95EBdCDIV@}G(o<gljkq`C#=jr3'okLo@\uC04EDyz}PM&V\u04593J}6}K+d_e4BZi]Ss\u178F7\u721E\u14D6(nN* J a.p^\uD2D2`W|!\u186F!");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_323261420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(323261420L))
            info.setReturnValue(1391264771);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/server/players/IpBanListEntry;)Lnet/minecraft/server/jsonrpc/methods/IpBanlistService$IpBanDto;", cancellable = true)
    private static void from__1822984223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1822984223L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "source()Ljava/util/Optional;", cancellable = true)
    private void source_530460100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530460100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reason()Ljava/util/Optional;", cancellable = true)
    private void reason_530460100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530460100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "expires()Ljava/util/Optional;", cancellable = true)
    private void expires_530460100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(530460100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ip()Ljava/lang/String;", cancellable = true)
    private void ip__850461793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-850461793L))
            info.setReturnValue("C`ar\u536DoymK_X:\u2C3DGycFg\u6610O<&\u8ED7AqTo7\u3006Yd$VC \u3F1CvjFsa(O\uCBB1G0(Av!Wf\u65F2L\u8A78Mxo>'\u73E9.B;1x\u82B08o\uCA17[N8[K+8JQ!LW+qBDcLlN");
    }


}
