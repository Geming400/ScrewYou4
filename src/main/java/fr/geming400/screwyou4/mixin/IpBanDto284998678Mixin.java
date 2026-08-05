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
            info.setReturnValue("nz闫dCDIV@}G(o<gljkq`C#=jr3'okLo@쁎Dyz}PM&Vљ3J}6}K+d_e4BZi]Ssត7爞ᓖ(nN* J a.p^틒`W|!ᡯ!");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_323261420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(323261420L))
            info.setReturnValue(1031504871);
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
            info.setReturnValue("C`ar卭oymK_X:ⰽGycFg昐O<&軗AqTo7〆Yd$VC 㼜vjFsa(O쮱G0(Av!Wf旲L詸Mxo>'珩.B;1x芰8o쨗[N8[K+8JQ!LW+qBDcLlN");
    }


}
