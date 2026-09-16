package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.methods.OperatorService.OperatorDto.class)
public class OperatorDto1370617778Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_461991510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(461991510L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2141041303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2141041303L))
            info.setReturnValue("Wm\u4F4F\u82DBxRx[6\uFB71n9C^se\u2BE4.UM9p5#&\u5AA2\u062AqMh*'<gJfE3t\u1082oS;d\u4C3CP.Rok-4>.C,}W\u757D>$MV)0wL:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1927969869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1927969869L))
            info.setReturnValue(2100240552);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/server/players/ServerOpListEntry;)Lnet/minecraft/server/jsonrpc/methods/OperatorService$OperatorDto;", cancellable = true)
    private static void from__1048247827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1048247827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Lnet/minecraft/server/jsonrpc/api/PlayerDto;", cancellable = true)
    private void player__1890938430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1890938430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "permissionLevel()Ljava/util/Optional;", cancellable = true)
    private void permissionLevel__1985328811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985328811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bypassesPlayerLimit()Ljava/util/Optional;", cancellable = true)
    private void bypassesPlayerLimit__936267452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-936267452L))
            info.setReturnValue(null);
    }


}
