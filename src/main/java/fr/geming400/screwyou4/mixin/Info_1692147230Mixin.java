package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceSelectorArgument.Info.class)
public class Info_1692147230Mixin {
        @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_734776964(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(734776964L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/arguments/ResourceSelectorArgument$Info$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_2116330439(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2116330439L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/commands/arguments/ResourceSelectorArgument;)Lnet/minecraft/commands/arguments/ResourceSelectorArgument$Info$Template;", cancellable = true)
    private void unpack__436964864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-436964864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack__1689013466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1689013466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_1244592020(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1244592020L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/arguments/ResourceSelectorArgument$Info$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_623916721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(623916721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_1232765800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1232765800L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/arguments/ResourceSelectorArgument$Info$Template;", cancellable = true)
    private void deserializeFromNetwork_211699851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211699851L))
            info.setReturnValue(null);
    }


}
