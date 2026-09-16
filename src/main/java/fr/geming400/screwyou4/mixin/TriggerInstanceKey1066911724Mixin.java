package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.PlayerAdvancements.TriggerInstanceKey.class)
public class TriggerInstanceKey1066911724Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_158285456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(158285456L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1837335249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1837335249L))
            info.setReturnValue("B2!T|MOm3^\uA181 Lg/,9r?CRUsjnZ(%Ze8=[;:F(");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1624263815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1624263815L))
            info.setReturnValue(2142748359);
    }

    @Inject(at = @At("HEAD"), method = "criterion()Ljava/lang/String;", cancellable = true)
    private void criterion_1021245270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1021245270L))
            info.setReturnValue("1\u06C2k{tNG(`;h&d\u9C42?wn4}@!H->Lt$5");
    }

    @Inject(at = @At("HEAD"), method = "advancement()Lnet/minecraft/advancements/AdvancementHolder;", cancellable = true)
    private void advancement__751392362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-751392362L))
            info.setReturnValue(null);
    }


}
