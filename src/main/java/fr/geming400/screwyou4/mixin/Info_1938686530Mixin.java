package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceOrTagArgument.Info.class)
public class Info_1938686530Mixin {
        @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack__831172136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-831172136L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/commands/arguments/ResourceOrTagArgument;)Lnet/minecraft/commands/arguments/ResourceOrTagArgument$Info$Template;", cancellable = true)
    private void unpack_1009062342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1009062342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_656836999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(656836999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/arguments/ResourceOrTagArgument$Info$Template;", cancellable = true)
    private void deserializeFromNetwork_1721037304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1721037304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_1903255963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1903255963L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/arguments/ResourceOrTagArgument$Info$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork__1397538998(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1397538998L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/arguments/ResourceOrTagArgument$Info$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__315440634(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-315440634L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_391485397(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(391485397L))
            info.cancel();
    }


}
