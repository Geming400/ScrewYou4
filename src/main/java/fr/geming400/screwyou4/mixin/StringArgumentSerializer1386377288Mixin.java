package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.brigadier.StringArgumentSerializer.class)
public class StringArgumentSerializer1386377288Mixin {
        @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_1350946722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1350946722L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/brigadier/StringArgumentSerializer$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork__1301936931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1301936931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_104527758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(104527758L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/brigadier/StringArgumentSerializer$Template;", cancellable = true)
    private void deserializeFromNetwork__422178893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-422178893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__160823844(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-160823844L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/brigadier/StringArgumentSerializer$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__1290779647(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1290779647L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/StringArgumentType;)Lnet/minecraft/commands/synchronization/brigadier/StringArgumentSerializer$Template;", cancellable = true)
    private void unpack_1426147445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1426147445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack__1383481377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1383481377L))
            info.setReturnValue(null);
    }


}
