package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.MinecraftServer.ServerResourcePackInfo.class)
public class ServerResourcePackInfo_97724856Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__810901413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-810901413L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_868148380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(868148380L))
            info.setReturnValue("NxG(-|*r\u72CCT$.U+$L8X\u2930+\uB018QYN>\uBA54Q'Dm\uCDCC\u7777oF\u47C9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_655076946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(655076946L))
            info.setReturnValue(-1101382234);
    }

    @Inject(at = @At("HEAD"), method = "hash()Ljava/lang/String;", cancellable = true)
    private void hash__241841202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-241841202L))
            info.setReturnValue("q-iP{92\uA00A&\u2CEE 5\u15B988\uBADAU+tm@pi}c?=^f%S7N_DJP\u8EAC!f=0Jk}UZ8\u83B8\u49BA\u4F7Drlk\u889Es\u2407<(`l?;*D*j3\"\u08D2C");
    }

    @Inject(at = @At("HEAD"), method = "url()Ljava/lang/String;", cancellable = true)
    private void url__1311317649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1311317649L))
            info.setReturnValue("{pJRyG|)Vj'jYR.\u29B5pMo?NlAD\u3EF48KS*+aTz5\uCF20]N\u71381\u4AF320 2]");
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/UUID;", cancellable = true)
    private void id_921568613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(921568613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prompt()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void prompt__2021947730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2021947730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRequired()Z", cancellable = true)
    private void isRequired__1021389275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1021389275L))
            info.setReturnValue(false);
    }


}
