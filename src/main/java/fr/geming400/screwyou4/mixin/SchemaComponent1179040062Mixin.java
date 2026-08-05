package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.api.SchemaComponent.class)
public class SchemaComponent1179040062Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_43579591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(43579591L))
            info.setReturnValue("-04L;#");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1730414975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1730414975L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_43580087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(43580087L))
            info.setReturnValue("(\uA593\uD0ABlzBqFov6wSXVA.0nbZ{\u4B45Ad{lK$vSV5LG9vyHbeuq?\u851CzH\u733Ca+K\uB08E\uFCB8!HD0%O");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1217302804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1217302804L))
            info.setReturnValue(-1770922717);
    }

    @Inject(at = @At("HEAD"), method = "ref()Ljava/net/URI;", cancellable = true)
    private void ref__1363744161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1363744161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asArray()Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private void asArray__824257726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-824257726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "schema()Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private void schema__824257726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-824257726L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asRef()Lnet/minecraft/server/jsonrpc/api/Schema;", cancellable = true)
    private void asRef__824257726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-824257726L))
            info.setReturnValue(null);
    }


}
