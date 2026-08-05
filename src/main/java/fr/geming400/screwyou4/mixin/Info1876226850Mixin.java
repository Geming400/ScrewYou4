package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.TimeArgument.Info.class)
public class Info1876226850Mixin {
        @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack__1504933845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1504933845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/commands/arguments/TimeArgument;)Lnet/minecraft/commands/arguments/TimeArgument$Info$Template;", cancellable = true)
    private void unpack__1892671099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892671099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_1416845421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1416845421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/arguments/TimeArgument$Info$Template;", cancellable = true)
    private void deserializeFromNetwork_1346582864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1346582864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_918856585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(918856585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/arguments/TimeArgument$Info$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork__404412020(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-404412020L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/arguments/TimeArgument$Info$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_1766347510(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1766347510L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_1428671641(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1428671641L))
            info.cancel();
    }


}
