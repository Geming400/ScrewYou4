package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.TimeArgument.Info.class)
public class Info1876226850Mixin {
        @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_1840796284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1840796284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/arguments/TimeArgument$Info$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork__1427722567(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1427722567L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_594377320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(594377320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/arguments/TimeArgument$Info$Template;", cancellable = true)
    private void deserializeFromNetwork__197884299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-197884299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_329025718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(329025718L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/arguments/TimeArgument$Info$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_1592506553(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1592506553L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/commands/arguments/TimeArgument;)Lnet/minecraft/commands/arguments/TimeArgument$Info$Template;", cancellable = true)
    private void unpack_1903632823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1903632823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack__893631815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-893631815L))
            info.setReturnValue(null);
    }


}
