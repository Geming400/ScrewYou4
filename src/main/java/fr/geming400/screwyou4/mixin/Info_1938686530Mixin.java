package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceOrTagArgument.Info.class)
public class Info_1938686530Mixin {
        @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack__1442474166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1442474166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/commands/arguments/ResourceOrTagArgument;)Lnet/minecraft/commands/arguments/ResourceOrTagArgument$Info$Template;", cancellable = true)
    private void unpack__1839793644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1839793644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/arguments/ResourceOrTagArgument$Info$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork__2048507433(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2048507433L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_981316264(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(981316264L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_1479305100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1479305100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/arguments/ResourceOrTagArgument$Info$Template;", cancellable = true)
    private void deserializeFromNetwork__977123971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-977123971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/arguments/ResourceOrTagArgument$Info$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_769875049(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(769875049L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_1491131320(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1491131320L))
            info.cancel();
    }


}
