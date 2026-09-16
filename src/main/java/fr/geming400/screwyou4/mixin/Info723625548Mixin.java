package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.EntityArgument.Info.class)
public class Info723625548Mixin {
        @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/arguments/EntityArgument$Info$Template;", cancellable = true)
    private void deserializeFromNetwork_1473812809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1473812809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork__558223982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-558223982L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/arguments/EntityArgument$Info$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__1058160819(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1058160819L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__823575584(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-823575584L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/arguments/EntityArgument$Info$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_194065465(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(194065465L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_688194982(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(688194982L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/commands/arguments/EntityArgument;)Lnet/minecraft/commands/arguments/EntityArgument$Info$Template;", cancellable = true)
    private void unpack_1843742389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1843742389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack__2046233117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2046233117L))
            info.setReturnValue(null);
    }


}
