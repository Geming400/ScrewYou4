package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.functions.PlainTextFunction.class)
public class PlainTextFunction_1421293551Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1488161487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1488161487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_285833575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(285833575L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1459556292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1459556292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1021773003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1021773003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries__1247336930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1247336930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/nbt/CompoundTag;Lcom/mojang/brigadier/CommandDispatcher;)Lnet/minecraft/commands/functions/InstantiatedFunction;", cancellable = true)
    private void instantiate_1715234394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715234394L))
            info.setReturnValue(null);
    }


}
