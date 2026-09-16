package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.brigadier.LongArgumentInfo.class)
public class LongArgumentInfo_673573617Mixin {
        @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/brigadier/LongArgumentInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_1730107234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1730107234L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork__608275914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-608275914L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/brigadier/LongArgumentInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_358214256(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(358214256L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__873627516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-873627516L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/brigadier/LongArgumentInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_2064658782(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2064658782L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_638143050(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(638143050L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/LongArgumentType;)Lnet/minecraft/commands/synchronization/brigadier/LongArgumentInfo$Template;", cancellable = true)
    private void unpack__1607530225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1607530225L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack__2096285049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2096285049L))
            info.setReturnValue(null);
    }


}
