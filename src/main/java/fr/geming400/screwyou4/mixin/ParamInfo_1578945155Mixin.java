package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.api.ParamInfo.class)
public class ParamInfo_1578945155Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_443484683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(443484683L))
            info.setReturnValue("-WTNq}'aK薁n]yPCJ8TXN@*;ꨔ6x&䴷룍V(m_:mc{;Ss薢jn$㘄^إ*'EEyG1*tqF)Q赻Rcr!H둹m#fFPOI蜰$^#+o+_3o35");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1330509883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1330509883L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_443485179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(443485179L))
            info.setReturnValue("a9[ulpoHM}`nzH㭿&;rE8cRa");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1617207896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1617207896L))
            info.setReturnValue(1551346996);
    }

    @Inject(at = @At("HEAD"), method = "required()Z", cancellable = true)
    private void required_1617223737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1617223737L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "schema()Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private void schema__424352634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-424352634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "typedCodec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private static void typedCodec__980168170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-980168170L))
            info.setReturnValue(null);
    }


}
